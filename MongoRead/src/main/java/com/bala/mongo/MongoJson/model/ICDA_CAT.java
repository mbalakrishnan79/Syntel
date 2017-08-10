package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "ICDA_CAT", schema = "MPR")
public class ICDA_CAT {

	@Id
	private int CDE_ID;
	private int SEQ_NBR;
	private String CDE_TYPE;
	private String CAT_CD;
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
	public String getCDE_TYPE() {
		return CDE_TYPE;
	}
	public void setCDE_TYPE(String cDE_TYPE) {
		CDE_TYPE = cDE_TYPE;
	}
	public String getCAT_CD() {
		return CAT_CD;
	}
	public void setCAT_CD(String cAT_CD) {
		CAT_CD = cAT_CD;
	}
	@Override
	public String toString() {
		return "ICDA_CAT [CDE_ID=" + CDE_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", CDE_TYPE=" + CDE_TYPE + ", CAT_CD=" + CAT_CD + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new ICDA_CAT().getClass().getDeclaredFields();
		int count = 0;

		ICDA_CAT icdaCat = (ICDA_CAT) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),icdaCat.getCDE_ID())
										.append(fields[count++].getName(), icdaCat.getSEQ_NBR())
										.append(fields[count++].getName(), icdaCat.getCDE_TYPE())
										.append(fields[count++].getName(), icdaCat.getCAT_CD());
		return doc;
	}
}
