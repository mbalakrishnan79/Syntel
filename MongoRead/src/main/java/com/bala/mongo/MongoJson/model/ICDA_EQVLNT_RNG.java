package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "ICDA_EQVLNT_RNG", schema = "MPR")
public class ICDA_EQVLNT_RNG {
	
	@Id
	private int RNG_ID;
	private int SEQ_NBR;
	private String EQVLNT_RNG_FROM;
	private String EQVLNT_RNG_THRU;
	private String SUFFIX_IND;
	private char EXCL_INCL_IND;
	private String ICDA_CLS_CD;
	private String ICDA_TYPE;
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
	public String getEQVLNT_RNG_FROM() {
		return EQVLNT_RNG_FROM;
	}
	public void setEQVLNT_RNG_FROM(String eQVLNT_RNG_FROM) {
		EQVLNT_RNG_FROM = eQVLNT_RNG_FROM;
	}
	public String getEQVLNT_RNG_THRU() {
		return EQVLNT_RNG_THRU;
	}
	public void setEQVLNT_RNG_THRU(String eQVLNT_RNG_THRU) {
		EQVLNT_RNG_THRU = eQVLNT_RNG_THRU;
	}
	public String getSUFFIX_IND() {
		return SUFFIX_IND;
	}
	public void setSUFFIX_IND(String sUFFIX_IND) {
		SUFFIX_IND = sUFFIX_IND;
	}
	public char getEXCL_INCL_IND() {
		return EXCL_INCL_IND;
	}
	public void setEXCL_INCL_IND(char eXCL_INCL_IND) {
		EXCL_INCL_IND = eXCL_INCL_IND;
	}
	public String getICDA_CLS_CD() {
		return ICDA_CLS_CD;
	}
	public void setICDA_CLS_CD(String iCDA_CLS_CD) {
		ICDA_CLS_CD = iCDA_CLS_CD;
	}
	public String getICDA_TYPE() {
		return ICDA_TYPE;
	}
	public void setICDA_TYPE(String iCDA_TYPE) {
		ICDA_TYPE = iCDA_TYPE;
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
		return "ICDA_EQVLNT_RNG [RNG_ID=" + RNG_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", EQVLNT_RNG_FROM=" + EQVLNT_RNG_FROM + ", EQVLNT_RNG_THRU="
				+ EQVLNT_RNG_THRU + ", SUFFIX_IND=" + SUFFIX_IND
				+ ", EXCL_INCL_IND=" + EXCL_INCL_IND + ", ICDA_CLS_CD="
				+ ICDA_CLS_CD + ", ICDA_TYPE=" + ICDA_TYPE + ", EFF_DTE="
				+ EFF_DTE + ", END_DTE=" + END_DTE + "]";
	}

	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new ICDA_EQVLNT_RNG().getClass().getDeclaredFields();
		int count = 0;

		ICDA_EQVLNT_RNG rng = (ICDA_EQVLNT_RNG) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),rng.getRNG_ID())
										.append(fields[count++].getName(), rng.getSEQ_NBR())
										.append(fields[count++].getName(), rng.getEQVLNT_RNG_FROM())
										.append(fields[count++].getName(), rng.getEQVLNT_RNG_THRU())
										.append(fields[count++].getName(), rng.getSUFFIX_IND())
										.append(fields[count++].getName(), rng.getEXCL_INCL_IND())
										.append(fields[count++].getName(), rng.getICDA_CLS_CD())
										.append(fields[count++].getName(), rng.getICDA_TYPE())
										.append(fields[count++].getName(), rng.getEFF_DTE())
										.append(fields[count++].getName(), rng.getEND_DTE());
		return doc;
	}
}
