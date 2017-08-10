package com.bala.mongo.MongoJson.controller;

import java.util.Arrays;
import java.util.Map;
import com.bala.mongo.MongoJson.model.DBDetails;
import com.bala.mongo.MongoJson.model.RDBMSTable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

public class MongoDBOperations {

	public DB getDB() {
		MongoDBReader mongoDBReader = new MongoDBReader();
		DBDetails dbDetails = mongoDBReader.readProperties();
		
		// To connect to mongodb server
		MongoCredential mongoCredential = MongoCredential
				.createScramSha1Credential(dbDetails.getDb(), dbDetails
						.getUserName(), dbDetails.getPassword().toCharArray());

		MongoClient mongoClient = new MongoClient(new ServerAddress(
				dbDetails.getHostName(), dbDetails.getPortNumber()),
				Arrays.asList(mongoCredential));
		
		DB db = mongoClient.getDB("epedb");
		return db;
	}
	
	
	public RDBMSTable readDataFromMongo(String tableName, RDBMSTable table, Map<String, Object> whereParams) {
		RDBMSTable output = null;

		DBCollection dbCollection =  getDB().getCollection(tableName);
		
		BasicDBObject whereQuery = new BasicDBObject();
		for ( Map.Entry<String, Object> entry : whereParams.entrySet()) {
			whereQuery.put(entry.getKey(), entry.getValue());
			//whereQuery.put(entry.getKey(), new BasicDBObject("$lt",entry.getValue()));
		}

		System.out.println("whereQuery = "+whereQuery.toString());
		
	    DBCursor cursor = dbCollection.find(whereQuery);
		
	    while(cursor.hasNext()) {
	    	  String json = cursor.next().toString();
	          
	    	  System.out.println(json);
	          // Get rid of the _id value which was added by MongoDB
	    	  String exactJson = "{" + json.substring(json.indexOf(",")+1).trim();
	    	  System.out.println("exactJson = "+exactJson);
			
			//Gson gson = new Gson();
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();

			output = gson.fromJson(exactJson, table.getClass());
			//output = mapper.readValue(exactJson, table.getClass());

			System.out.println("json to java -" + output.toString());
	    }
		return output;
	}
}
