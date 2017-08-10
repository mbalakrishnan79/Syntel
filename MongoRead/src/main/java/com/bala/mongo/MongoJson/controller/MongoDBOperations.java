package com.bala.mongo.MongoJson.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.bala.mongo.MongoJson.model.DBDetails;
import com.bala.mongo.MongoJson.model.RDBMSTable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@SuppressWarnings({ "resource", "resource" })
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

		// Now connect to your databases
		@SuppressWarnings("deprecation")
		DB db = mongoClient.getDB(dbDetails.getDb());

		return db;
	}
	
	
	public List<RDBMSTable> readDataFromMongo(String tableName, RDBMSTable table, Map<String, Object> whereParams) {
		List<RDBMSTable> outputList = new ArrayList<RDBMSTable>();
		RDBMSTable output = null;

		DB db = getDB();
		
		BasicDBObject whereQuery = new BasicDBObject();
		for ( Map.Entry<String, Object> entry : whereParams.entrySet()) {
			whereQuery.put(entry.getKey(), entry.getValue());
		}
		System.out.println("whereQuery = "+whereQuery.toString());
		
		DBCursor cursor = db.getCollection(tableName).find(whereQuery);
		
		ObjectMapper mapper = new ObjectMapper();
		while (cursor.hasNext()) {
			String json = cursor.next().toString();

			//try {
				// Get rid of the _id value which was added by MongoDB
				String exactJson = "{" + json.substring(json.indexOf(",")+1).trim();
				exactJson = exactJson.replace(" { \"$date\" : " , "");
				exactJson = exactJson.replace("Z\"}", "Z\"");
								
				System.out.println("exactJson = "+exactJson);
				
				Gson gson = new Gson();
				output = gson.fromJson(exactJson, table.getClass());
				//output = mapper.readValue(exactJson, table.getClass());

				System.out.println("json to java -" + output.toString());
				if(output != null) {
					outputList.add(output);
				}
				
			/*} catch (Exception e) {
				System.out.println("Error while reading and parsing data from MongoDB");
			}*/
		}
		
		return outputList;
	}
}
