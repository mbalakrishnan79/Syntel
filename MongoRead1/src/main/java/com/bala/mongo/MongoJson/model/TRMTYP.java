package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "TRMTYP", schema = "MPR")
public class TRMTYP {
	
	private String CDE_TYPE;
	@Id
	private int CDE_ID;
	private int SEQ_NBR;
	private String TRMT_TYPE;
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
	public String getTRMT_TYPE() {
		return TRMT_TYPE;
	}
	public void setTRMT_TYPE(String tRMT_TYPE) {
		TRMT_TYPE = tRMT_TYPE;
	}
	
	@Override
	public String toString() {
		return "TRMTYP [CDE_TYPE=" + CDE_TYPE + ", CDE_ID=" + CDE_ID
				+ ", SEQ_NBR=" + SEQ_NBR + ", TRMT_TYPE=" + TRMT_TYPE + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new TRMTYP().getClass().getDeclaredFields();
		int count = 0;

		TRMTYP trmTyp = (TRMTYP) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),trmTyp.getCDE_TYPE().trim())
									.append(fields[count++].getName(), trmTyp.getCDE_ID())
									.append(fields[count++].getName(), trmTyp.getSEQ_NBR())
									.append(fields[count++].getName(), trmTyp.getTRMT_TYPE().trim());
		return doc;
	}
}
