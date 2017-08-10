package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

import com.mongodb.BasicDBObject;

public class ICDA_DIAGNOSIS {
	
	private int CDE_DXG_ID;
	private int SEQ_NBR;
	private String CDE_ICDA_DIAGNOSIS;
	private char CDE_VERSION;
	private int PRIORITY_LVL;
	private Date EFF_DTE;
	private Date END_DTE;
	private int FROM_AGE;
	private int TO_AGE;
	private char SEX;
	private char PRE_EXIST_IND;
	private char PRE_EXIST_IND_IN;
	private char PRE_EXIST_IND_SG;
	private char HIPAA_COMP_IND;
	private char VLDTY_CD;
	private char ER_LVL_CD;
	private String LST_UPDT_OPR_ID;
	private Timestamp LST_UPDT_TS;
	private String UPDT_NOTES;
	private char CD_FIRST_IND;
	
	public int getCDE_DXG_ID() {
		return CDE_DXG_ID;
	}
	public void setCDE_DXG_ID(int cDE_DXG_ID) {
		CDE_DXG_ID = cDE_DXG_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public String getCDE_ICDA_DIAGNOSIS() {
		return CDE_ICDA_DIAGNOSIS;
	}
	public void setCDE_ICDA_DIAGNOSIS(String cDE_ICDA_DIAGNOSIS) {
		CDE_ICDA_DIAGNOSIS = cDE_ICDA_DIAGNOSIS;
	}
	public char getCDE_VERSION() {
		return CDE_VERSION;
	}
	public void setCDE_VERSION(char cDE_VERSION) {
		CDE_VERSION = cDE_VERSION;
	}
	public int getPRIORITY_LVL() {
		return PRIORITY_LVL;
	}
	public void setPRIORITY_LVL(int pRIORITY_LVL) {
		PRIORITY_LVL = pRIORITY_LVL;
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
	public int getFROM_AGE() {
		return FROM_AGE;
	}
	public void setFROM_AGE(int fROM_AGE) {
		FROM_AGE = fROM_AGE;
	}
	public int getTO_AGE() {
		return TO_AGE;
	}
	public void setTO_AGE(int tO_AGE) {
		TO_AGE = tO_AGE;
	}
	public char getSEX() {
		return SEX;
	}
	public void setSEX(char sEX) {
		SEX = sEX;
	}
	public char getPRE_EXIST_IND() {
		return PRE_EXIST_IND;
	}
	public void setPRE_EXIST_IND(char pRE_EXIST_IND) {
		PRE_EXIST_IND = pRE_EXIST_IND;
	}
	public char getPRE_EXIST_IND_IN() {
		return PRE_EXIST_IND_IN;
	}
	public void setPRE_EXIST_IND_IN(char pRE_EXIST_IND_IN) {
		PRE_EXIST_IND_IN = pRE_EXIST_IND_IN;
	}
	public char getPRE_EXIST_IND_SG() {
		return PRE_EXIST_IND_SG;
	}
	public void setPRE_EXIST_IND_SG(char pRE_EXIST_IND_SG) {
		PRE_EXIST_IND_SG = pRE_EXIST_IND_SG;
	}
	public char getHIPAA_COMP_IND() {
		return HIPAA_COMP_IND;
	}
	public void setHIPAA_COMP_IND(char hIPAA_COMP_IND) {
		HIPAA_COMP_IND = hIPAA_COMP_IND;
	}
	public char getVLDTY_CD() {
		return VLDTY_CD;
	}
	public void setVLDTY_CD(char vLDTY_CD) {
		VLDTY_CD = vLDTY_CD;
	}
	public char getER_LVL_CD() {
		return ER_LVL_CD;
	}
	public void setER_LVL_CD(char eR_LVL_CD) {
		ER_LVL_CD = eR_LVL_CD;
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
	public char getCD_FIRST_IND() {
		return CD_FIRST_IND;
	}
	public void setCD_FIRST_IND(char cD_FIRST_IND) {
		CD_FIRST_IND = cD_FIRST_IND;
	}
	
	@Override
	public String toString() {
		return "ICDA_DIAGNOSIS [CDE_DXG_ID=" + CDE_DXG_ID + ", SEQ_NBR="
				+ SEQ_NBR + ", CDE_ICDA_DIAGNOSIS=" + CDE_ICDA_DIAGNOSIS
				+ ", CDE_VERSION=" + CDE_VERSION + ", PRIORITY_LVL="
				+ PRIORITY_LVL + ", EFF_DTE=" + EFF_DTE + ", END_DTE="
				+ END_DTE + ", FROM_AGE=" + FROM_AGE + ", TO_AGE=" + TO_AGE
				+ ", SEX=" + SEX + ", PRE_EXIST_IND=" + PRE_EXIST_IND
				+ ", PRE_EXIST_IND_IN=" + PRE_EXIST_IND_IN
				+ ", PRE_EXIST_IND_SG=" + PRE_EXIST_IND_SG
				+ ", HIPAA_COMP_IND=" + HIPAA_COMP_IND + ", VLDTY_CD="
				+ VLDTY_CD + ", ER_LVL_CD=" + ER_LVL_CD + ", LST_UPDT_OPR_ID="
				+ LST_UPDT_OPR_ID + ", LST_UPDT_TS=" + LST_UPDT_TS
				+ ", UPDT_NOTES=" + UPDT_NOTES + ", CD_FIRST_IND="
				+ CD_FIRST_IND + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new ICDA_DIAGNOSIS().getClass().getDeclaredFields();
		int count = 0;

		ICDA_DIAGNOSIS icdaDiagnosis = (ICDA_DIAGNOSIS) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),icdaDiagnosis.getCDE_DXG_ID())
										.append(fields[count++].getName(), icdaDiagnosis.getSEQ_NBR())
										.append(fields[count++].getName(), icdaDiagnosis.getCDE_ICDA_DIAGNOSIS())
										.append(fields[count++].getName(), icdaDiagnosis.getCDE_VERSION())
										.append(fields[count++].getName(), icdaDiagnosis.getPRIORITY_LVL())
										.append(fields[count++].getName(), icdaDiagnosis.getEFF_DTE())
										.append(fields[count++].getName(), icdaDiagnosis.getEND_DTE())
										.append(fields[count++].getName(), icdaDiagnosis.getFROM_AGE())
										.append(fields[count++].getName(), icdaDiagnosis.getTO_AGE())
										.append(fields[count++].getName(), icdaDiagnosis.getSEX())
										.append(fields[count++].getName(), icdaDiagnosis.getPRE_EXIST_IND())
										.append(fields[count++].getName(), icdaDiagnosis.getPRE_EXIST_IND_IN())
										.append(fields[count++].getName(), icdaDiagnosis.getPRE_EXIST_IND_SG())
										.append(fields[count++].getName(), icdaDiagnosis.getHIPAA_COMP_IND())
										.append(fields[count++].getName(), icdaDiagnosis.getVLDTY_CD())
										.append(fields[count++].getName(), icdaDiagnosis.getER_LVL_CD())
										.append(fields[count++].getName(), icdaDiagnosis.getLST_UPDT_OPR_ID())
										.append(fields[count++].getName(), icdaDiagnosis.getLST_UPDT_TS())
										.append(fields[count++].getName(), icdaDiagnosis.getUPDT_NOTES())
										.append(fields[count++].getName(), icdaDiagnosis.getCD_FIRST_IND());
		return doc;
	}
}
