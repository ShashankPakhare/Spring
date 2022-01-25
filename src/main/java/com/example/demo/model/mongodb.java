package com.example.demo.model;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@Repository
public class mongodb {

    ConnectionString connectionString = new ConnectionString("mongodb+srv://new-Shashank:ShAsHaNk@cluster0.loytd.mongodb.net");
    CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
    CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
            pojoCodecRegistry);
    MongoClientSettings clientSettings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .codecRegistry(codecRegistry)
            .build();


  MongoClient mongoClient = MongoClients.create(clientSettings);
        MongoDatabase db = mongoClient.getDatabase("<dbname>");
        MongoCollection<Alien> user= db.getCollection("alien", Alien.class);




    public void  save(Alien a)
    {   a.set_id(a.getAid());
        System.out.println("the calue of _id is "+a.get_id());
        System.out.println(user.insertOne(a));

    }


    public List<Alien> findAllAlien()
    {
        List<Alien> newAlien=user.find().into(new ArrayList<Alien>());
        return newAlien;
    }

    public Alien findAlien(int aid)
    {
        Alien a;
        System.out.println(user.find(eq("aid",aid)).toString());
        a = user.find(eq("aid",aid)).first();
        return a;
    }

    public String update(Alien b)
    {
        Document filterByGradeId = new Document("aid", b.getAid());

        FindOneAndReplaceOptions returnDocAfterReplace = new FindOneAndReplaceOptions().returnDocument(ReturnDocument.AFTER);
        Alien updatedGrade = user.findOneAndReplace(filterByGradeId, b, returnDocAfterReplace);

        System.out.println("Grade replaced:\t" + updatedGrade);
        return "success";
    }


    public Alien delete(int aid)
    {   Document a=new Document("aid",aid);
        return  user.findOneAndDelete(a);
    }
}
