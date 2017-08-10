package com.bala.mongo.MongoJson.common;

import com.bala.mongo.MongoJson.model.Employee;
import com.bala.mongo.MongoJson.model.MDLR_CLM;
import com.bala.mongo.MongoJson.model.MDLR_CLM_LINE;
import com.bala.mongo.MongoJson.model.MDLR_CLM_SET;
import com.bala.mongo.MongoJson.model.MDLR_CLM_SUBSET;
import com.bala.mongo.MongoJson.model.MyCol;
import com.bala.mongo.MongoJson.model.RDBMSTable;

public class DBFactory {

	public static RDBMSTable getTableObject(String tableName) {
		switch(tableName) {
			case "Employee":
				return new Employee();
			case "mycol":
				return new MyCol();
			case "MDLR_CLM_LINE":
				return new MDLR_CLM_LINE();
			case "MDLR_CLM_SET":
				return new MDLR_CLM_SET();
			case "MDLR_CLM_SUBSET":
				return new MDLR_CLM_SUBSET();
			case "MDLR_CLM":
				return new MDLR_CLM();
			default:
				return null;
		}
		
	}
}
