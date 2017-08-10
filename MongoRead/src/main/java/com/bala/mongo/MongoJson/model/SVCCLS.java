package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "SVCCLS", schema = "MPR")
public class SVCCLS {
	private String CDE_TYPE;
	private int CDE_ID;
	private int SEQ_NBR;
	private String SVC_CLASS;
	private int SVC_SEQ_NBR;
	
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
	public String getSVC_CLASS() {
		return SVC_CLASS;
	}
	public void setSVC_CLASS(String sVC_CLASS) {
		SVC_CLASS = sVC_CLASS;
	}
	public int getSVC_SEQ_NBR() {
		return SVC_SEQ_NBR;
	}
	public void setSVC_SEQ_NBR(int sVC_SEQ_NBR) {
		SVC_SEQ_NBR = sVC_SEQ_NBR;
	}
	@Override
	public String toString() {
		return "SVCCLS [CDE_TYPE=" + CDE_TYPE + ", CDE_ID=" + CDE_ID
				+ ", SEQ_NBR=" + SEQ_NBR + ", SVC_CLASS=" + SVC_CLASS
				+ ", SVC_SEQ_NBR=" + SVC_SEQ_NBR + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new SVCCLS().getClass().getDeclaredFields();
		int count = 0;

		SVCCLS svcCls = (SVCCLS) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),svcCls.getCDE_TYPE())
										.append(fields[count++].getName(), svcCls.getCDE_ID())
										.append(fields[count++].getName(), svcCls.getSEQ_NBR())
										.append(fields[count++].getName(), svcCls.getSVC_CLASS())
										.append(fields[count++].getName(), svcCls.getSVC_SEQ_NBR());
		
		return doc;
	}
		
}
