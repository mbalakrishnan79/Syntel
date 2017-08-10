package com.bala.mongo.MongoJson.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.bala.mongo.MongoJson.common.DBFactory;
import com.bala.mongo.MongoJson.model.DBDetails;
import com.bala.mongo.MongoJson.model.Employee;
import com.bala.mongo.MongoJson.model.MDLR_CLM;
import com.bala.mongo.MongoJson.model.Person;
import com.bala.mongo.MongoJson.model.RDBMSTable;

public class MongoDBReader {

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
		
		DBDetails dbDetails = new MongoDBReader().readProperties();
		if(dbDetails != null) {
			
			for(String tableName : dbDetails.getTableNames()) {
				System.out.println("table name - "+tableName);
				RDBMSTable table = DBFactory.getTableObject(tableName);
				
				System.out.println("table name = "+tableName);
				MongoDBOperations write = new MongoDBOperations();
				Map<String,Object> whereParams = new HashMap<String,Object>();
				whereParams.put("name", "Bala");

				Person emp = (Person)write.readDataFromMongo(tableName, table, whereParams);
				if(emp != null) {
					System.out.println("output = " + emp.toString());
				}

			}
		}
		else {
			System.out.println("No DB details provided in properties file");
		}
	}
}
