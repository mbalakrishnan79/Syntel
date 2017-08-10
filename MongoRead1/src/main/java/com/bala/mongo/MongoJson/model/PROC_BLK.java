package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "PROC_BLK", schema = "MPR")
public class PROC_BLK {
	
	@Id
	private int CDE_ID;
	private int SEQ_NBR;
	private String PROCDR_CDE;
	private char PARENT_CHILD_IND;
	private int REPETITION_REDUC;
	private int REPETITION_CNT;
	private String PARENT_PROCDR;
	
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
	public String getPROCDR_CDE() {
		return PROCDR_CDE;
	}
	public void setPROCDR_CDE(String pROCDR_CDE) {
		PROCDR_CDE = pROCDR_CDE;
	}
	public char getPARENT_CHILD_IND() {
		return PARENT_CHILD_IND;
	}
	public void setPARENT_CHILD_IND(char pARENT_CHILD_IND) {
		PARENT_CHILD_IND = pARENT_CHILD_IND;
	}
	public int getREPETITION_REDUC() {
		return REPETITION_REDUC;
	}
	public void setREPETITION_REDUC(int rEPETITION_REDUC) {
		REPETITION_REDUC = rEPETITION_REDUC;
	}
	public int getREPETITION_CNT() {
		return REPETITION_CNT;
	}
	public void setREPETITION_CNT(int rEPETITION_CNT) {
		REPETITION_CNT = rEPETITION_CNT;
	}
	public String getPARENT_PROCDR() {
		return PARENT_PROCDR;
	}
	public void setPARENT_PROCDR(String pARENT_PROCDR) {
		PARENT_PROCDR = pARENT_PROCDR;
	}
	
	@Override
	public String toString() {
		return "PROC_BLK [CDE_ID=" + CDE_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", PROCDR_CDE=" + PROCDR_CDE + ", PARENT_CHILD_IND="
				+ PARENT_CHILD_IND + ", REPETITION_REDUC=" + REPETITION_REDUC
				+ ", REPETITION_CNT=" + REPETITION_CNT + ", PARENT_PROCDR="
				+ PARENT_PROCDR + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new PROC_BLK().getClass().getDeclaredFields();
		int count = 0;

		PROC_BLK procBlk = (PROC_BLK) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),procBlk.getCDE_ID())
										.append(fields[count++].getName(), procBlk.getSEQ_NBR())
										.append(fields[count++].getName(), procBlk.getPROCDR_CDE())
										.append(fields[count++].getName(), procBlk.getPARENT_CHILD_IND())
										.append(fields[count++].getName(), procBlk.getREPETITION_REDUC())
										.append(fields[count++].getName(), procBlk.getREPETITION_CNT())
										.append(fields[count++].getName(), procBlk.getPARENT_PROCDR());
		return doc;
	}
}
