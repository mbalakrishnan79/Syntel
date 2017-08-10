package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "MDLR_SERVICE", schema = "MPR")
public class MDLR_SERVICE {
	
	@Id
	private int SVC_ID;
	private int SEQ_NBR;
	private int CONTR_ID;
	private int CONTR_SEQ;
	private String SVC_CDE;
	private String LST_UPDT_OPR_ID;
	private Timestamp LST_UPDT_TS;
	private String UPDT_NOTES;
	private int PRIORITY_LVL_NBR;
	
	public int getSVC_ID() {
		return SVC_ID;
	}
	public void setSVC_ID(int sVC_ID) {
		SVC_ID = sVC_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public int getCONTR_ID() {
		return CONTR_ID;
	}
	public void setCONTR_ID(int cONTR_ID) {
		CONTR_ID = cONTR_ID;
	}
	public int getCONTR_SEQ() {
		return CONTR_SEQ;
	}
	public void setCONTR_SEQ(int cONTR_SEQ) {
		CONTR_SEQ = cONTR_SEQ;
	}
	public String getSVC_CDE() {
		return SVC_CDE;
	}
	public void setSVC_CDE(String sVC_CDE) {
		SVC_CDE = sVC_CDE;
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
	public int getPRIORITY_LVL_NBR() {
		return PRIORITY_LVL_NBR;
	}
	public void setPRIORITY_LVL_NBR(int pRIORITY_LVL_NBR) {
		PRIORITY_LVL_NBR = pRIORITY_LVL_NBR;
	}
	@Override
	public String toString() {
		return "MDLR_SERVICE [SVC_ID=" + SVC_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", CONTR_ID=" + CONTR_ID + ", CONTR_SEQ=" + CONTR_SEQ
				+ ", SVC_CDE=" + SVC_CDE + ", LST_UPDT_OPR_ID="
				+ LST_UPDT_OPR_ID + ", LST_UPDT_TS=" + LST_UPDT_TS
				+ ", UPDT_NOTES=" + UPDT_NOTES + ", PRIORITY_LVL_NBR="
				+ PRIORITY_LVL_NBR + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new MDLR_SERVICE().getClass().getDeclaredFields();
		int count = 0;

		MDLR_SERVICE mdlrService = (MDLR_SERVICE) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),mdlrService.getSVC_ID())
										.append(fields[count++].getName(), mdlrService.getSEQ_NBR())
										.append(fields[count++].getName(), mdlrService.getCONTR_ID())
										.append(fields[count++].getName(), mdlrService.getCONTR_SEQ())
										.append(fields[count++].getName(), mdlrService.getSVC_CDE())
										.append(fields[count++].getName(), mdlrService.getLST_UPDT_OPR_ID())
										.append(fields[count++].getName(), mdlrService.getLST_UPDT_TS())
										.append(fields[count++].getName(), mdlrService.getUPDT_NOTES())
										.append(fields[count++].getName(), mdlrService.getPRIORITY_LVL_NBR());
		return doc;
	}

}
