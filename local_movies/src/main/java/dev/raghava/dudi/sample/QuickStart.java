package dev.raghava.dudi.sample;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class QuickStart {
    public static void main( String[] args ) {

        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb+srv://raghava219:MaT7bv8AX6guCnUM@cluster0.sapthjn.mongodb.net/?retryWrites=true&w=majority";

        try (MongoClient mongoClient = MongoClients.create(uri)) {

        	MongoDatabase database = mongoClient.getDatabase("test");
            
        	MongoCollection<Document> collection = database.getCollection("test");

        	Document query = new Document("_id",new ObjectId("648464f8e6a9752a3a4d58ec"));

            // Document doc = collection.find(eq("title", "Back to the Future")).first();
        	
        	Document doc = collection.find(query).first();
            
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
    }
}