package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "ICDA_CLASS", schema = "MPR")
public class ICDA_CLASS {

	@Id
	private int CDE_ID;
	private String CDE_TYPE;
	private String ICDA_CLS_CD;
	
	public int getCDE_ID() {
		return CDE_ID;
	}
	public void setCDE_ID(int cDE_ID) {
		CDE_ID = cDE_ID;
	}
	public String getCDE_TYPE() {
		return CDE_TYPE;
	}
	public void setCDE_TYPE(String cDE_TYPE) {
		CDE_TYPE = cDE_TYPE;
	}
	public String getICDA_CLS_CD() {
		return ICDA_CLS_CD;
	}
	public void setICDA_CLS_CD(String iCDA_CLS_CD) {
		ICDA_CLS_CD = iCDA_CLS_CD;
	}
	@Override
	public String toString() {
		return "ICDA_CLASS [CDE_ID=" + CDE_ID + ", CDE_TYPE=" + CDE_TYPE
				+ ", ICDA_CLS_CD=" + ICDA_CLS_CD + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new ICDA_CLASS().getClass().getDeclaredFields();
		int count = 0;

		ICDA_CLASS icdaClass = (ICDA_CLASS) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),icdaClass.getCDE_ID())
										.append(fields[count++].getName(), icdaClass.getCDE_TYPE())
										.append(fields[count++].getName(), icdaClass.getICDA_CLS_CD());
		return doc;
	}
	
}
