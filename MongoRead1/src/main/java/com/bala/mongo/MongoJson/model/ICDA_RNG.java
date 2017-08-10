package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "ICDA_RNG", schema = "MPR")
public class ICDA_RNG {
	
	@Id
	private int RNG_ID;
	private int SEQ_NBR;
	private String ICDA_TYPE;
	private String RNG_FROM;
	private String RNG_THRU;
	private String ICDA_CLS_CD;
	private String LST_UPDT_OPR_ID;
	private Timestamp LST_UPDT_TS;
	private String UPDT_NOTES;
	private Date EFF_DTE;
	private Date END_DTE;
	public int getRNG_ID() {
		return RNG_ID;
	}
	public void setRNG_ID(int rNG_ID) {
		RNG_ID = rNG_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public String getICDA_TYPE() {
		return ICDA_TYPE;
	}
	public void setICDA_TYPE(String iCDA_TYPE) {
		ICDA_TYPE = iCDA_TYPE;
	}
	public String getRNG_FROM() {
		return RNG_FROM;
	}
	public void setRNG_FROM(String rNG_FROM) {
		RNG_FROM = rNG_FROM;
	}
	public String getRNG_THRU() {
		return RNG_THRU;
	}
	public void setRNG_THRU(String rNG_THRU) {
		RNG_THRU = rNG_THRU;
	}
	public String getICDA_CLS_CD() {
		return ICDA_CLS_CD;
	}
	public void setICDA_CLS_CD(String iCDA_CLS_CD) {
		ICDA_CLS_CD = iCDA_CLS_CD;
	}
	public String getLST_UPDT_OPR_ID() {
		return LST_UPDT_OPR_ID;
	}
	public void setLST_UPDT_OPR_ID(String lST_UPDT_OPR_ID) {
		LST_UPDT_OPR_ID = lST_UPDT_OPR_ID;
	}
	public Timestamp getLST_UPDT_TS() {
		return LST_UPDT_TS;
	}
	public void setLST_UPDT_TS(Timestamp lST_UPDT_TS) {
		LST_UPDT_TS = lST_UPDT_TS;
	}
	public String getUPDT_NOTES() {
		return UPDT_NOTES;
	}
	public void setUPDT_NOTES(String uPDT_NOTES) {
		UPDT_NOTES = uPDT_NOTES;
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
		return "ICDA_RNG [RNG_ID=" + RNG_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", ICDA_TYPE=" + ICDA_TYPE + ", RNG_FROM=" + RNG_FROM
				+ ", RNG_THRU=" + RNG_THRU + ", ICDA_CLS_CD=" + ICDA_CLS_CD
				+ ", LST_UPDT_OPR_ID=" + LST_UPDT_OPR_ID + ", LST_UPDT_TS="
				+ LST_UPDT_TS + ", UPDT_NOTES=" + UPDT_NOTES + ", EFF_DTE="
				+ EFF_DTE + ", END_DTE=" + END_DTE + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new ICDA_RNG().getClass().getDeclaredFields();
		int count = 0;

		ICDA_RNG icdaRng = (ICDA_RNG) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),icdaRng.getRNG_ID())
										.append(fields[count++].getName(), icdaRng.getSEQ_NBR())
										.append(fields[count++].getName(), icdaRng.getICDA_TYPE())
										.append(fields[count++].getName(), icdaRng.getRNG_FROM())
										.append(fields[count++].getName(), icdaRng.getRNG_THRU())
										.append(fields[count++].getName(), icdaRng.getICDA_CLS_CD())
										.append(fields[count++].getName(), icdaRng.getLST_UPDT_OPR_ID())
										.append(fields[count++].getName(), icdaRng.getLST_UPDT_TS())
										.append(fields[count++].getName(), icdaRng.getUPDT_NOTES())
										.append(fields[count++].getName(), icdaRng.getEFF_DTE())
										.append(fields[count++].getName(), icdaRng.getEND_DTE());
		return doc;
	}

}
