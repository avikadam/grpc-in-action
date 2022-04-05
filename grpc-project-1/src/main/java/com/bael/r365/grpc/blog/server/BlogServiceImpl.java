package com.bael.r365.grpc.blog.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.proto.blog.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class BlogServiceImpl extends BlogServiceGrpc.BlogServiceImplBase {

    private final Logger log = Logger.getLogger(BlogServiceImpl.class);

    private final MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    private final MongoDatabase database = mongoClient.getDatabase("mydb");
    private final MongoCollection<Document> collection = database.getCollection("sample/blog");

    @Override
    public void createBlog(CreateBlogRequest request,
                           StreamObserver<CreateBlogResponse> responseObserver) {

        log.log(Level.INFO, "Received Create Blog request");

        Blog blog = request.getBlog();

        Document doc = new Document("author_id", blog.getAuthorId()).append("title",
                                                                            blog.getTitle())
                                                                    .append("content",
                                                                            blog.getContent());

        log.log(Level.INFO, "Inserting blog...");
        // we insert (create) the document in mongoDB
        collection.insertOne(doc);


        // we retrieve the MongoDB generated ID
        String id = doc.getObjectId("_id")
                       .toString();
        log.log(Level.INFO, "Inserted blog: " + id);

        CreateBlogResponse response = CreateBlogResponse.newBuilder()
                                                        .setBlog(blog.toBuilder()
                                                                     .setId(id)
                                                                     .build())
                                                        .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }


    @Override
    public void readBlog(ReadBlogRequest request,
                         StreamObserver<ReadBlogResponse> responseObserver) {
        log.log(Level.INFO, "Received Read Blog request");

        String blogId = request.getBlogId();

        log.log(Level.INFO, "Searching for a blog");
        Document result = null;

        try {
            result = collection.find(eq("_id", new ObjectId(blogId)))
                               .first();
        } catch (Exception e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription("The blog with the " +
                                                                              "corresponding id " +
                                                                              "was not found")
                                                     .augmentDescription(e.getLocalizedMessage())
                                                     .asRuntimeException());
        }

        if (result == null) {
            log.log(Level.INFO, "Blog not found");
            // we don't have a match
            responseObserver.onError(Status.NOT_FOUND.withDescription("The blog with the " +
                                                                              "corresponding id " +
                                                                              "was not found")
                                                     .asRuntimeException());
        } else {
            log.log(Level.INFO, "Blog found, sending response");
            Blog blog = documentToBlog(result);

            responseObserver.onNext(ReadBlogResponse.newBuilder()
                                                    .setBlog(blog)
                                                    .build());

            responseObserver.onCompleted();
        }

    }

    @Override
    public void updateBlog(UpdateBlogRequest request,
                           StreamObserver<UpdateBlogResponse> responseObserver) {
        log.log(Level.INFO, "Received Update Blog request");

        Blog blog = request.getBlog();

        String blogId = blog.getId();

        log.log(Level.INFO, "Searching for a blog so we can update it");
        Document result = null;

        try {
            result = collection.find(eq("_id", new ObjectId(blogId)))
                               .first();
        } catch (Exception e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription("The blog with the " +
                                                                              "corresponding id " +
                                                                              "was not found")
                                                     .augmentDescription(e.getLocalizedMessage())
                                                     .asRuntimeException());
        }

        if (result == null) {
            log.log(Level.WARN, "Blog not found");
            // we don't have a match
            responseObserver.onError(Status.NOT_FOUND.withDescription("The blog with the " +
                                                                              "corresponding id " +
                                                                              "was not found")
                                                     .asRuntimeException());
        } else {
            Document replacement = new Document("author_id", blog.getAuthorId()).append("title",
                                                                                        blog.getTitle())
                                                                                .append("content"
                                                                                        ,
                                                                                        blog.getContent())
                                                                                .append("_id",
                                                                                        new ObjectId(blogId));

            log.log(Level.INFO, "Replacing blog in database...");

            collection.replaceOne(eq("_id", result.getObjectId("_id")), replacement);

            log.log(Level.INFO, "Replaced! Sending as a response");
            responseObserver.onNext(UpdateBlogResponse.newBuilder()
                                                      .setBlog(documentToBlog(replacement))
                                                      .build());

            responseObserver.onCompleted();
        }
    }

    private Blog documentToBlog(Document document) {
        return Blog.newBuilder()
                   .setAuthorId(document.getString("author_id"))
                   .setTitle(document.getString("title"))
                   .setContent(document.getString("content"))
                   .setId(document.getObjectId("_id")
                                  .toString())
                   .build();
    }

    @Override
    public void deleteBlog(DeleteBlogRequest request,
                           StreamObserver<DeleteBlogResponse> responseObserver) {
        log.log(Level.INFO, "Received Delete Blog Request");

        String blogId = request.getBlogId();
        DeleteResult result = null;
        try {
            result = collection.deleteOne(eq("_id", new ObjectId(blogId)));
        } catch (Exception e) {
            log.log(Level.ERROR, "Blog not found");
            responseObserver.onError(Status.NOT_FOUND.withDescription("The blog with the " +
                                                                              "corresponding id " +
                                                                              "was not found")
                                                     .augmentDescription(e.getLocalizedMessage())
                                                     .asRuntimeException());
        }

        if (null != result && result.getDeletedCount() == 0) {
            log.log(Level.WARN, "Blog not found");
            responseObserver.onError(Status.NOT_FOUND.withDescription("The blog with the " +
                                                                              "corresponding id " +
                                                                              "was not found")
                                                     .asRuntimeException());
        } else {
            log.log(Level.INFO, "Blog was deleted");
            responseObserver.onNext(DeleteBlogResponse.newBuilder()
                                                      .setBlogId(blogId)
                                                      .build());

            responseObserver.onCompleted();
        }

    }

    @Override
    public void listBlog(ListBlogRequest request,
                         StreamObserver<ListBlogResponse> responseObserver) {
        log.log(Level.INFO, "Received List Blog Request");

        collection.find()
                  .iterator()
                  .forEachRemaining(document -> responseObserver.onNext(ListBlogResponse.newBuilder()
                                                                                        .setBlog(documentToBlog(document))
                                                                                        .build()));

        responseObserver.onCompleted();
    }
}
