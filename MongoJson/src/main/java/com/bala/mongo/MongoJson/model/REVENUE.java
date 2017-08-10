package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "REVENUE", schema = "MPR")
public class REVENUE {
	
	@Id
	private int REV_CDE_ID;
	private int SEQ_NBR;
	private String REVENUE_CDE;
	private Date EFF_DTE;
	private int PRIORITY_LVL;
	private Date END_DTE;
	private char POS_EXCL_INCL_IND;
	private char TOT_EXCL_INCL_IND;
	private int FROM_AGE;
	private int TO_AGE;
	private char SEX;
	private String LST_UPDT_OP_ID;
	private Timestamp LST_UPDT_TS;
	private char HIPAA_COMP_IND;
	private String UPDT_NOTES;
	private String REVENUE_TXT;
	private char HLTHY_FMLY_REF_IND;
	private char MED_REF_IND;
	private char AIM_HMO_AUTH_IND;
	private char TX_AUTH_IND;
	private char SC_AUTH_IND;
	private char KS_AUTH_IND;
	private char WV_AUTH_IND;
	private char IN_AUTH_IND;
	private char MA_AUTH_IND;
	
	public int getREV_CDE_ID() {
		return REV_CDE_ID;
	}
	public void setREV_CDE_ID(int rEV_CDE_ID) {
		REV_CDE_ID = rEV_CDE_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public String getREVENUE_CDE() {
		return REVENUE_CDE;
	}
	public void setREVENUE_CDE(String rEVENUE_CDE) {
		REVENUE_CDE = rEVENUE_CDE;
	}
	public Date getEFF_DTE() {
		return EFF_DTE;
	}
	public void setEFF_DTE(Date eFF_DTE) {
		EFF_DTE = eFF_DTE;
	}
	public int getPRIORITY_LVL() {
		return PRIORITY_LVL;
	}
	public void setPRIORITY_LVL(int pRIORITY_LVL) {
		PRIORITY_LVL = pRIORITY_LVL;
	}
	public Date getEND_DTE() {
		return END_DTE;
	}
	public void setEND_DTE(Date eND_DTE) {
		END_DTE = eND_DTE;
	}
	public char getPOS_EXCL_INCL_IND() {
		return POS_EXCL_INCL_IND;
	}
	public void setPOS_EXCL_INCL_IND(char pOS_EXCL_INCL_IND) {
		POS_EXCL_INCL_IND = pOS_EXCL_INCL_IND;
	}
	public char getTOT_EXCL_INCL_IND() {
		return TOT_EXCL_INCL_IND;
	}
	public void setTOT_EXCL_INCL_IND(char tOT_EXCL_INCL_IND) {
		TOT_EXCL_INCL_IND = tOT_EXCL_INCL_IND;
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
	public String getLST_UPDT_OP_ID() {
		return LST_UPDT_OP_ID;
	}
	public void setLST_UPDT_OP_ID(String lST_UPDT_OP_ID) {
		LST_UPDT_OP_ID = lST_UPDT_OP_ID;
	}
	public Timestamp getLST_UPDT_TS() {
		return LST_UPDT_TS;
	}
	public void setLST_UPDT_TS(Timestamp lST_UPDT_TS) {
		LST_UPDT_TS = lST_UPDT_TS;
	}
	public char getHIPAA_COMP_IND() {
		return HIPAA_COMP_IND;
	}
	public void setHIPAA_COMP_IND(char hIPAA_COMP_IND) {
		HIPAA_COMP_IND = hIPAA_COMP_IND;
	}
	public String getUPDT_NOTES() {
		return UPDT_NOTES;
	}
	public void setUPDT_NOTES(String uPDT_NOTES) {
		UPDT_NOTES = uPDT_NOTES;
	}
	public String getREVENUE_TXT() {
		return REVENUE_TXT;
	}
	public void setREVENUE_TXT(String rEVENUE_TXT) {
		REVENUE_TXT = rEVENUE_TXT;
	}
	public char getHLTHY_FMLY_REF_IND() {
		return HLTHY_FMLY_REF_IND;
	}
	public void setHLTHY_FMLY_REF_IND(char hLTHY_FMLY_REF_IND) {
		HLTHY_FMLY_REF_IND = hLTHY_FMLY_REF_IND;
	}
	public char getMED_REF_IND() {
		return MED_REF_IND;
	}
	public void setMED_REF_IND(char mED_REF_IND) {
		MED_REF_IND = mED_REF_IND;
	}
	public char getAIM_HMO_AUTH_IND() {
		return AIM_HMO_AUTH_IND;
	}
	public void setAIM_HMO_AUTH_IND(char aIM_HMO_AUTH_IND) {
		AIM_HMO_AUTH_IND = aIM_HMO_AUTH_IND;
	}
	public char getTX_AUTH_IND() {
		return TX_AUTH_IND;
	}
	public void setTX_AUTH_IND(char tX_AUTH_IND) {
		TX_AUTH_IND = tX_AUTH_IND;
	}
	public char getSC_AUTH_IND() {
		return SC_AUTH_IND;
	}
	public void setSC_AUTH_IND(char sC_AUTH_IND) {
		SC_AUTH_IND = sC_AUTH_IND;
	}
	public char getKS_AUTH_IND() {
		return KS_AUTH_IND;
	}
	public void setKS_AUTH_IND(char kS_AUTH_IND) {
		KS_AUTH_IND = kS_AUTH_IND;
	}
	public char getWV_AUTH_IND() {
		return WV_AUTH_IND;
	}
	public void setWV_AUTH_IND(char wV_AUTH_IND) {
		WV_AUTH_IND = wV_AUTH_IND;
	}
	public char getIN_AUTH_IND() {
		return IN_AUTH_IND;
	}
	public void setIN_AUTH_IND(char iN_AUTH_IND) {
		IN_AUTH_IND = iN_AUTH_IND;
	}
	public char getMA_AUTH_IND() {
		return MA_AUTH_IND;
	}
	public void setMA_AUTH_IND(char mA_AUTH_IND) {
		MA_AUTH_IND = mA_AUTH_IND;
	}
	
	@Override
	public String toString() {
		return "REVENUE [REV_CDE_ID=" + REV_CDE_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", REVENUE_CDE=" + REVENUE_CDE + ", EFF_DTE=" + EFF_DTE
				+ ", PRIORITY_LVL=" + PRIORITY_LVL + ", END_DTE=" + END_DTE
				+ ", POS_EXCL_INCL_IND=" + POS_EXCL_INCL_IND
				+ ", TOT_EXCL_INCL_IND=" + TOT_EXCL_INCL_IND + ", FROM_AGE="
				+ FROM_AGE + ", TO_AGE=" + TO_AGE + ", SEX=" + SEX
				+ ", LST_UPDT_OP_ID=" + LST_UPDT_OP_ID + ", LST_UPDT_TS="
				+ LST_UPDT_TS + ", HIPAA_COMP_IND=" + HIPAA_COMP_IND
				+ ", UPDT_NOTES=" + UPDT_NOTES + ", REVENUE_TXT=" + REVENUE_TXT
				+ ", HLTHY_FMLY_REF_IND=" + HLTHY_FMLY_REF_IND
				+ ", MED_REF_IND=" + MED_REF_IND + ", AIM_HMO_AUTH_IND="
				+ AIM_HMO_AUTH_IND + ", TX_AUTH_IND=" + TX_AUTH_IND
				+ ", SC_AUTH_IND=" + SC_AUTH_IND + ", KS_AUTH_IND="
				+ KS_AUTH_IND + ", WV_AUTH_IND=" + WV_AUTH_IND
				+ ", IN_AUTH_IND=" + IN_AUTH_IND + ", MA_AUTH_IND="
				+ MA_AUTH_IND + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new REVENUE().getClass().getDeclaredFields();
		int count = 0;

		REVENUE revenue = (REVENUE) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),revenue.getREV_CDE_ID())
										.append(fields[count++].getName(), revenue.getSEQ_NBR())
										.append(fields[count++].getName(), revenue.getREVENUE_CDE())
										.append(fields[count++].getName(), revenue.getEFF_DTE())
										.append(fields[count++].getName(), revenue.getPRIORITY_LVL())
										.append(fields[count++].getName(), revenue.getEND_DTE())
										.append(fields[count++].getName(), revenue.getPOS_EXCL_INCL_IND())
										.append(fields[count++].getName(), revenue.getTOT_EXCL_INCL_IND())
										.append(fields[count++].getName(), revenue.getFROM_AGE())
										.append(fields[count++].getName(), revenue.getTO_AGE())
										.append(fields[count++].getName(), revenue.getSEX())
										.append(fields[count++].getName(), revenue.getLST_UPDT_OP_ID())
										.append(fields[count++].getName(), revenue.getLST_UPDT_TS())
										.append(fields[count++].getName(), revenue.getHIPAA_COMP_IND())
										.append(fields[count++].getName(), revenue.getUPDT_NOTES())
										.append(fields[count++].getName(), revenue.getREVENUE_TXT())
										.append(fields[count++].getName(), revenue.getHLTHY_FMLY_REF_IND())
										.append(fields[count++].getName(), revenue.getMED_REF_IND())
										.append(fields[count++].getName(), revenue.getAIM_HMO_AUTH_IND())
										.append(fields[count++].getName(), revenue.getTX_AUTH_IND())
										.append(fields[count++].getName(), revenue.getSC_AUTH_IND())
										.append(fields[count++].getName(), revenue.getKS_AUTH_IND())
										.append(fields[count++].getName(), revenue.getWV_AUTH_IND())
										.append(fields[count++].getName(), revenue.getIN_AUTH_IND())
										.append(fields[count++].getName(), revenue.getMA_AUTH_IND());
		return doc;
	}
}
