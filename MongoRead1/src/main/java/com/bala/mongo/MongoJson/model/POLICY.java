package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "POLICY", schema = "MPR")
public class POLICY {
	
	@Id
	private String CDE_TYPE;
	private int CDE_ID;
	private int SEQ_NBR;
	private String TEXT;
	
	public String getCDE_TYPE() {
		return CDE_TYPE;
	}
	public void setCDE_TYPE(String cDE_TYPE) {
		CDE_TYPE = cDE_TYPE;
	}
	public int getCDE_ID() {
		return CDE_ID;
	}
	public void setCDE_ID(int cDE_ID) {
		CDE_ID = cDE_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public String getTEXT() {
		return TEXT;
	}
	public void setTEXT(String tEXT) {
		TEXT = tEXT;
	}
	
	@Override
	public String toString() {
		return "POLICY [CDE_TYPE=" + CDE_TYPE + ", CDE_ID=" + CDE_ID
				+ ", SEQ_NBR=" + SEQ_NBR + ", TEXT=" + TEXT + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new POLICY().getClass().getDeclaredFields();
		int count = 0;

		POLICY policy = (POLICY) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),policy.getCDE_TYPE())
										.append(fields[count++].getName(), policy.getCDE_ID())
										.append(fields[count++].getName(), policy.getSEQ_NBR())
										.append(fields[count++].getName(), policy.getTEXT());
		return doc;
	}

}
