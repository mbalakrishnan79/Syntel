package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "SUSPEND", schema = "MPR")
public class SUSPEND {

	private int SUSPEND_ID;
	private int SEQ_NBR;
	private int PRIORITY_LVL;
	private String SUSP_FOR_TYPE;
	private String SUSP_FOR_CDE;
	private String SD_CDE;
	private Date EFF_DTE;
	private Date END_DTE;
	private int DOLLAR_LIMIT;
	private String EOB_CDE;
	private char EOB_MSG_CDE;
	private String LST_UPDT_OP_ID;
	private Timestamp LST_UPDT_TS;
	private String SUSP_TEXT;
	private String SUPRT_REF;
	private String UPDT_NOTES;
	private char LCD_NCD_IND;
	private char THRESHOLD_IND;
	private String CLINICAL_ROUTE_CD;
	
	public int getSUSPEND_ID() {
		return SUSPEND_ID;
	}
	public void setSUSPEND_ID(int sUSPEND_ID) {
		SUSPEND_ID = sUSPEND_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public int getPRIORITY_LVL() {
		return PRIORITY_LVL;
	}
	public void setPRIORITY_LVL(int pRIORITY_LVL) {
		PRIORITY_LVL = pRIORITY_LVL;
	}
	public String getSUSP_FOR_TYPE() {
		return SUSP_FOR_TYPE;
	}
	public void setSUSP_FOR_TYPE(String sUSP_FOR_TYPE) {
		SUSP_FOR_TYPE = sUSP_FOR_TYPE;
	}
	public String getSUSP_FOR_CDE() {
		return SUSP_FOR_CDE;
	}
	public void setSUSP_FOR_CDE(String sUSP_FOR_CDE) {
		SUSP_FOR_CDE = sUSP_FOR_CDE;
	}
	public String getSD_CDE() {
		return SD_CDE;
	}
	public void setSD_CDE(String sD_CDE) {
		SD_CDE = sD_CDE;
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
	public int getDOLLAR_LIMIT() {
		return DOLLAR_LIMIT;
	}
	public void setDOLLAR_LIMIT(int dOLLAR_LIMIT) {
		DOLLAR_LIMIT = dOLLAR_LIMIT;
	}
	public String getEOB_CDE() {
		return EOB_CDE;
	}
	public void setEOB_CDE(String eOB_CDE) {
		EOB_CDE = eOB_CDE;
	}
	public char getEOB_MSG_CDE() {
		return EOB_MSG_CDE;
	}
	public void setEOB_MSG_CDE(char eOB_MSG_CDE) {
		EOB_MSG_CDE = eOB_MSG_CDE;
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
	public String getSUSP_TEXT() {
		return SUSP_TEXT;
	}
	public void setSUSP_TEXT(String sUSP_TEXT) {
		SUSP_TEXT = sUSP_TEXT;
	}
	public String getSUPRT_REF() {
		return SUPRT_REF;
	}
	public void setSUPRT_REF(String sUPRT_REF) {
		SUPRT_REF = sUPRT_REF;
	}
	public String getUPDT_NOTES() {
		return UPDT_NOTES;
	}
	public void setUPDT_NOTES(String uPDT_NOTES) {
		UPDT_NOTES = uPDT_NOTES;
	}
	public char getLCD_NCD_IND() {
		return LCD_NCD_IND;
	}
	public void setLCD_NCD_IND(char lCD_NCD_IND) {
		LCD_NCD_IND = lCD_NCD_IND;
	}
	public char getTHRESHOLD_IND() {
		return THRESHOLD_IND;
	}
	public void setTHRESHOLD_IND(char tHRESHOLD_IND) {
		THRESHOLD_IND = tHRESHOLD_IND;
	}
	public String getCLINICAL_ROUTE_CD() {
		return CLINICAL_ROUTE_CD;
	}
	public void setCLINICAL_ROUTE_CD(String cLINICAL_ROUTE_CD) {
		CLINICAL_ROUTE_CD = cLINICAL_ROUTE_CD;
	}
	@Override
	public String toString() {
		return "SUSPEND [SUSPEND_ID=" + SUSPEND_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", PRIORITY_LVL=" + PRIORITY_LVL + ", SUSP_FOR_TYPE="
				+ SUSP_FOR_TYPE + ", SUSP_FOR_CDE=" + SUSP_FOR_CDE
				+ ", SD_CDE=" + SD_CDE + ", EFF_DTE=" + EFF_DTE + ", END_DTE="
				+ END_DTE + ", DOLLAR_LIMIT=" + DOLLAR_LIMIT + ", EOB_CDE="
				+ EOB_CDE + ", EOB_MSG_CDE=" + EOB_MSG_CDE
				+ ", LST_UPDT_OP_ID=" + LST_UPDT_OP_ID + ", LST_UPDT_TS="
				+ LST_UPDT_TS + ", SUSP_TEXT=" + SUSP_TEXT + ", SUPRT_REF="
				+ SUPRT_REF + ", UPDT_NOTES=" + UPDT_NOTES + ", LCD_NCD_IND="
				+ LCD_NCD_IND + ", THRESHOLD_IND=" + THRESHOLD_IND
				+ ", CLINICAL_ROUTE_CD=" + CLINICAL_ROUTE_CD + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new SUSPEND().getClass().getDeclaredFields();
		int count = 0;

		SUSPEND suspend = (SUSPEND) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),suspend.getSUSPEND_ID())
										.append(fields[count++].getName(), suspend.getSEQ_NBR())
										.append(fields[count++].getName(), suspend.getPRIORITY_LVL())
										.append(fields[count++].getName(), suspend.getSUSP_FOR_TYPE())
										.append(fields[count++].getName(), suspend.getSUSP_FOR_CDE())
										.append(fields[count++].getName(), suspend.getSD_CDE())
										.append(fields[count++].getName(), suspend.getEFF_DTE())
										.append(fields[count++].getName(), suspend.getEND_DTE())
										.append(fields[count++].getName(), suspend.getDOLLAR_LIMIT())
										.append(fields[count++].getName(), suspend.getEOB_CDE())
										.append(fields[count++].getName(), suspend.getEOB_MSG_CDE())
										.append(fields[count++].getName(), suspend.getLST_UPDT_OP_ID())
										.append(fields[count++].getName(), suspend.getLST_UPDT_TS())
										.append(fields[count++].getName(), suspend.getSUSP_TEXT())
										.append(fields[count++].getName(), suspend.getSUPRT_REF())
										.append(fields[count++].getName(), suspend.getUPDT_NOTES())
										.append(fields[count++].getName(), suspend.getLCD_NCD_IND())
										.append(fields[count++].getName(), suspend.getTHRESHOLD_IND())
										.append(fields[count++].getName(), suspend.getCLINICAL_ROUTE_CD());
		return doc;
	}
}
