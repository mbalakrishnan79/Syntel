package com.bala.mongo.MongoJson.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.bala.mongo.MongoJson.model.DBDetails;
import com.bala.mongo.MongoJson.model.RDBMSTable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@SuppressWarnings({ "resource", "resource" })
public class MongoDBOperations {

	public DB getDB(DBDetails dbDetails) {
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

	public void readFromMongoDB(String tableName, RDBMSTable table,
			DBDetails dbDetails) {

		DB db = getDB(dbDetails);
		DBCursor cursor = db.getCollection(tableName).find();

		ObjectMapper mapper = new ObjectMapper();
		while (cursor.hasNext()) {
			String json = cursor.next().toString();

			try {
				// Get rid of the _id value which was added by MongoDB
				String exactJson = "{" + json.substring(json.indexOf(",")+1).trim();
				RDBMSTable tableObj = mapper.readValue(exactJson, table.getClass());

				System.out.println("json to java -" + tableObj.toString());
			} catch (IOException e) {
				System.out.println("Error while reading and parsing data from MongoDB");
			}
		}
	}

	public void writeToMongoDB(String tableName, RDBMSTable table,
			List<? extends RDBMSTable> records, DBDetails dbDetails) {
		try {
			DB db = getDB(dbDetails);
			DBCollection coll = db.getCollection(tableName);

			for (RDBMSTable record : records) {
				coll.insert(table.composeDBObject(record));
			}

		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}

}
