import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    var client = MongoClients.create();
    var todoDB= client.getDatabase("todoDb" );
    todoDB.createCollection("todolist");
    var todoCollection=todoDB.getCollection("todolist");
    var todoDocument= new Document();
    todoDocument.append("taskName","work on MamgoDB");
    todoDocument.append("todoDate","13 Aug 2024");
    todoDocument.append("todoTime","20 hrs");
    todoDocument.append("taskStatus","False");
    todoCollection.insertOne(todoDocument);



    // to update document update
        //to change the data if status is false in all document
       todoCollection.updateOne(new Document("taskName","Work on Mongo" ),new Document("$set",new Document("taskstatus",false)));
       // todoCollection.updateOne(new Document("taskstatus","17 Aug 2024"),new Document("$set"),new Document("update"));

     // to fetch the document from collection
        FindIterable<Document> todolist= todoCollection.find();
       // todolist= (ArrayList<Document>)  todoCollection.find();

        for (Document document: todolist){
            System.out.println("task Name "+ document.getString("taskName")+ document.getString("taskName"));

        }
        }
    }
