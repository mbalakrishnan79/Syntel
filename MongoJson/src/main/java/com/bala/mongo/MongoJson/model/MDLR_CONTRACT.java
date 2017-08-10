package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "MDLR_CONTRACT", schema = "MPR")
public class MDLR_CONTRACT {
	
	@Id
	private int CONTR_ID;
	private int SEQ_NBR;
	private String MEDICARE_ID;
	private Date EFF_DTE;
	private Date END_DTE;
	private String CONTR_CDE;
	private String CONTR_VARN;
	private int PROVIDER_ID;
	private String CANCEL_CDE;
	private String LST_UPDT_OPR_ID;
	private Timestamp LST_UPDT_TS;
	private String UPDT_NOTES;
	public int getCONTR_ID() {
		return CONTR_ID;
	}
	public void setCONTR_ID(int cONTR_ID) {
		CONTR_ID = cONTR_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public String getMEDICARE_ID() {
		return MEDICARE_ID;
	}
	public void setMEDICARE_ID(String mEDICARE_ID) {
		MEDICARE_ID = mEDICARE_ID;
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
	public String getCONTR_CDE() {
		return CONTR_CDE;
	}
	public void setCONTR_CDE(String cONTR_CDE) {
		CONTR_CDE = cONTR_CDE;
	}
	public String getCONTR_VARN() {
		return CONTR_VARN;
	}
	public void setCONTR_VARN(String cONTR_VARN) {
		CONTR_VARN = cONTR_VARN;
	}
	public int getPROVIDER_ID() {
		return PROVIDER_ID;
	}
	public void setPROVIDER_ID(int pROVIDER_ID) {
		PROVIDER_ID = pROVIDER_ID;
	}
	public String getCANCEL_CDE() {
		return CANCEL_CDE;
	}
	public void setCANCEL_CDE(String cANCEL_CDE) {
		CANCEL_CDE = cANCEL_CDE;
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
	@Override
	public String toString() {
		return "MDLR_CONTRACT [CONTR_ID=" + CONTR_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", MEDICARE_ID=" + MEDICARE_ID + ", EFF_DTE=" + EFF_DTE
				+ ", END_DTE=" + END_DTE + ", CONTR_CDE=" + CONTR_CDE
				+ ", CONTR_VARN=" + CONTR_VARN + ", PROVIDER_ID=" + PROVIDER_ID
				+ ", CANCEL_CDE=" + CANCEL_CDE + ", LST_UPDT_OPR_ID="
				+ LST_UPDT_OPR_ID + ", LST_UPDT_TS=" + LST_UPDT_TS
				+ ", UPDT_NOTES=" + UPDT_NOTES + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new MDLR_CONTRACT().getClass().getDeclaredFields();
		int count = 0;

		MDLR_CONTRACT mdlrContract = (MDLR_CONTRACT) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),mdlrContract.getCONTR_ID())
										.append(fields[count++].getName(), mdlrContract.getSEQ_NBR())
										.append(fields[count++].getName(), mdlrContract.getMEDICARE_ID())
										.append(fields[count++].getName(), mdlrContract.getEFF_DTE())
										.append(fields[count++].getName(), mdlrContract.getEND_DTE())
										.append(fields[count++].getName(), mdlrContract.getCONTR_CDE())
										.append(fields[count++].getName(), mdlrContract.getCONTR_VARN())
										.append(fields[count++].getName(), mdlrContract.getPROVIDER_ID())
										.append(fields[count++].getName(), mdlrContract.getCANCEL_CDE())
										.append(fields[count++].getName(), mdlrContract.getLST_UPDT_OPR_ID())
										.append(fields[count++].getName(), mdlrContract.getLST_UPDT_TS())
										.append(fields[count++].getName(), mdlrContract.getUPDT_NOTES());
		return doc;
	}

}
