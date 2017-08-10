package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "MDLR_VARIABLE", schema = "MPR")
public class MDLR_VARIABLE {
	
	@Id
	private int VRBL_ID;
	private int SEQ_NBR;
	private int VRBL_SEQ;
	private char VRBL_TYPE;
	private Double VRBL_AMT;
	private int VRBL_UNITS;
	private String VRBL_ALPHA;
	
	public int getVRBL_ID() {
		return VRBL_ID;
	}
	public void setVRBL_ID(int vRBL_ID) {
		VRBL_ID = vRBL_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public int getVRBL_SEQ() {
		return VRBL_SEQ;
	}
	public void setVRBL_SEQ(int vRBL_SEQ) {
		VRBL_SEQ = vRBL_SEQ;
	}
	public char getVRBL_TYPE() {
		return VRBL_TYPE;
	}
	public void setVRBL_TYPE(char vRBL_TYPE) {
		VRBL_TYPE = vRBL_TYPE;
	}
	public Double getVRBL_AMT() {
		return VRBL_AMT;
	}
	public void setVRBL_AMT(Double vRBL_AMT) {
		VRBL_AMT = vRBL_AMT;
	}
	public int getVRBL_UNITS() {
		return VRBL_UNITS;
	}
	public void setVRBL_UNITS(int vRBL_UNITS) {
		VRBL_UNITS = vRBL_UNITS;
	}
	public String getVRBL_ALPHA() {
		return VRBL_ALPHA;
	}
	public void setVRBL_ALPHA(String vRBL_ALPHA) {
		VRBL_ALPHA = vRBL_ALPHA;
	}
	
	@Override
	public String toString() {
		return "MDLR_VARIABLE [VRBL_ID=" + VRBL_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", VRBL_SEQ=" + VRBL_SEQ + ", VRBL_TYPE=" + VRBL_TYPE
				+ ", VRBL_AMT=" + VRBL_AMT + ", VRBL_UNITS=" + VRBL_UNITS
				+ ", VRBL_ALPHA=" + VRBL_ALPHA + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new MDLR_VARIABLE().getClass().getDeclaredFields();
		int count = 0;

		MDLR_VARIABLE mdlrVar = (MDLR_VARIABLE) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),mdlrVar.getVRBL_ID())
										.append(fields[count++].getName(), mdlrVar.getSEQ_NBR())
										.append(fields[count++].getName(), mdlrVar.getVRBL_SEQ())
										.append(fields[count++].getName(), mdlrVar.getVRBL_TYPE())
										.append(fields[count++].getName(), mdlrVar.getVRBL_AMT())
										.append(fields[count++].getName(), mdlrVar.getVRBL_UNITS())
										.append(fields[count++].getName(), mdlrVar.getVRBL_ALPHA());
		return doc;
	}
}
