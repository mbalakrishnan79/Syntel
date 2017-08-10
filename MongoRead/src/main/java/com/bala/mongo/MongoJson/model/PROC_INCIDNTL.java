package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "PROC_INCIDNTL", schema = "MPR")
public class PROC_INCIDNTL {
	
	@Id
	private int CDE_ID;
	private int SEQ_NBR;
	private String PRCDR_FROM;
	private String PRCDR_THRU;
	private char MRU_IND;
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
	public String getPRCDR_FROM() {
		return PRCDR_FROM;
	}
	public void setPRCDR_FROM(String pRCDR_FROM) {
		PRCDR_FROM = pRCDR_FROM;
	}
	public String getPRCDR_THRU() {
		return PRCDR_THRU;
	}
	public void setPRCDR_THRU(String pRCDR_THRU) {
		PRCDR_THRU = pRCDR_THRU;
	}
	public char getMRU_IND() {
		return MRU_IND;
	}
	public void setMRU_IND(char mRU_IND) {
		MRU_IND = mRU_IND;
	}
	
	@Override
	public String toString() {
		return "PROC_INCIDNTL [CDE_ID=" + CDE_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", PRCDR_FROM=" + PRCDR_FROM + ", PRCDR_THRU=" + PRCDR_THRU
				+ ", MRU_IND=" + MRU_IND + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new PROC_INCIDNTL().getClass().getDeclaredFields();
		int count = 0;

		PROC_INCIDNTL incidntl = (PROC_INCIDNTL) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),incidntl.getCDE_ID())
										.append(fields[count++].getName(), incidntl.getSEQ_NBR())
										.append(fields[count++].getName(), incidntl.getPRCDR_FROM())
										.append(fields[count++].getName(), incidntl.getPRCDR_THRU())
										.append(fields[count++].getName(), incidntl.getMRU_IND());
		return doc;
	}
}
