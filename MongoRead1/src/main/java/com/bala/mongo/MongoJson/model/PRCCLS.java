package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "PRCCLS", schema = "MPR")
public class PRCCLS {
	
	@Id
	private String CDE_TYPE;
	private int CDE_ID;
	private int SEQ_NBR;
	private String PRICE_CLASS;
	private Date EFF_DTE;
	private Date END_DTE;
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
	public String getPRICE_CLASS() {
		return PRICE_CLASS;
	}
	public void setPRICE_CLASS(String pRICE_CLASS) {
		PRICE_CLASS = pRICE_CLASS;
	}
	public Date getEFF_DTE() {
		return EFF_DTE;
	}
	public void setEFF_DTE(Date eFF_DTE) {
		EFF_DTE = eFF_DTE;
	}
	public Date getEND_DTE() {
		return END_DTE;
	}
	public void setEND_DTE(Date eND_DTE) {
		END_DTE = eND_DTE;
	}
	
	@Override
	public String toString() {
		return "PRCCLS [CDE_TYPE=" + CDE_TYPE + ", CDE_ID=" + CDE_ID
				+ ", SEQ_NBR=" + SEQ_NBR + ", PRICE_CLASS=" + PRICE_CLASS
				+ ", EFF_DTE=" + EFF_DTE + ", END_DTE=" + END_DTE + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new PRCCLS().getClass().getDeclaredFields();
		int count = 0;

		PRCCLS prcCls = (PRCCLS) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),prcCls.getCDE_TYPE())
										.append(fields[count++].getName(), prcCls.getCDE_ID())
										.append(fields[count++].getName(), prcCls.getSEQ_NBR())
										.append(fields[count++].getName(), prcCls.getPRICE_CLASS())
										.append(fields[count++].getName(), prcCls.getEFF_DTE())
										.append(fields[count++].getName(), prcCls.getEND_DTE());
		return doc;
	}

}
