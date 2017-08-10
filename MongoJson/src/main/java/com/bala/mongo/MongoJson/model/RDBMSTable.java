package com.bala.mongo.MongoJson.model;

import com.mongodb.BasicDBObject;

public interface RDBMSTable {
	
	public String toString();
	public BasicDBObject composeDBObject(RDBMSTable table);
	
}
