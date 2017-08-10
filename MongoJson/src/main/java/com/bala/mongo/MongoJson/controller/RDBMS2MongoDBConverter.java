package com.bala.mongo.MongoJson.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import com.bala.mongo.MongoJson.common.DBFactory;
import com.bala.mongo.MongoJson.model.DBDetails;
import com.bala.mongo.MongoJson.model.Employee;
import com.bala.mongo.MongoJson.model.RDBMSTable;

public class RDBMS2MongoDBConverter {

	public DBDetails readProperties() {

		Properties prop = new Properties();
		InputStream input = null;
		DBDetails dbDetails = null;

		try {
			input = getClass().getClassLoader().getResourceAsStream("DBdetails.properties");
			if (input == null) {
				throw new IOException("input stream creation failed");
			}
			prop.load(input);

			dbDetails = new DBDetails();
			dbDetails.setDb(prop.getProperty("db"));
			dbDetails.setHostName(prop.getProperty("host_name"));
			dbDetails.setPortNumber(Integer.parseInt(prop.getProperty("port_number")));
			dbDetails.setUserName(prop.getProperty("user_name"));
			dbDetails.setPassword(prop.getProperty("password"));

			String tableNames = prop.getProperty("table_names");
			dbDetails.setTableNames(Arrays.asList(tableNames.split("\\s*,\\s*")));
		} catch (IOException e) {
			System.out.println("IO exception while reading properties file");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return dbDetails;
	}

	public static void main(String[] args) {
		
		DBDetails dbDetails = new RDBMS2MongoDBConverter().readProperties();
		if(dbDetails != null) {
			
			RDBMSOperations read = new RDBMSOperations();
			
			for(String tableName : dbDetails.getTableNames()) {
				System.out.println("table name - "+tableName);
				RDBMSTable table = DBFactory.getTableObject(tableName);
				
				List<? extends RDBMSTable> tableRecords = read.readFromRDBMS(table); 
				for(RDBMSTable tableRec : tableRecords) {
					System.out.println("parsing the returned value in main");
					System.out.println(tableRec.toString());
				}
	
				MongoDBOperations write = new MongoDBOperations();
				write.writeToMongoDB(tableName, table, tableRecords, dbDetails);
				write.readFromMongoDB(tableName, table, dbDetails);
			}
		}
		else {
			System.out.println("No DB details provided in properties file");
		}
	}
}
