package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "MDLR_RATE", schema = "MPR")
public class MDLR_RATE {
	
	@Id
	private int RATE_ID;
	private int SEQ_NBR;
	private int SVC_ID;
	private int SVC_SEQ;
	private Date EFF_DTE;
	private Date END_DTE;
	private String CANCEL_CDE;
	private String RULE_CDE;
	private String LST_UPDT_OPR_ID;
	private Timestamp LST_UPDT_TS;
	private String UPDT_NOTES;
	public int getRATE_ID() {
		return RATE_ID;
	}
	public void setRATE_ID(int rATE_ID) {
		RATE_ID = rATE_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public int getSVC_ID() {
		return SVC_ID;
	}
	public void setSVC_ID(int sVC_ID) {
		SVC_ID = sVC_ID;
	}
	public int getSVC_SEQ() {
		return SVC_SEQ;
	}
	public void setSVC_SEQ(int sVC_SEQ) {
		SVC_SEQ = sVC_SEQ;
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
	public String getCANCEL_CDE() {
		return CANCEL_CDE;
	}
	public void setCANCEL_CDE(String cANCEL_CDE) {
		CANCEL_CDE = cANCEL_CDE;
	}
	public String getRULE_CDE() {
		return RULE_CDE;
	}
	public void setRULE_CDE(String rULE_CDE) {
		RULE_CDE = rULE_CDE;
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
		return "MDLR_RATE [RATE_ID=" + RATE_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", SVC_ID=" + SVC_ID + ", SVC_SEQ=" + SVC_SEQ + ", EFF_DTE="
				+ EFF_DTE + ", END_DTE=" + END_DTE + ", CANCEL_CDE="
				+ CANCEL_CDE + ", RULE_CDE=" + RULE_CDE + ", LST_UPDT_OPR_ID="
				+ LST_UPDT_OPR_ID + ", LST_UPDT_TS=" + LST_UPDT_TS
				+ ", UPDT_NOTES=" + UPDT_NOTES + "]";
	}

	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new MDLR_RATE().getClass().getDeclaredFields();
		int count = 0;

		MDLR_RATE mdlrRate = (MDLR_RATE) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),mdlrRate.getRATE_ID())
										.append(fields[count++].getName(), mdlrRate.getSEQ_NBR())
										.append(fields[count++].getName(), mdlrRate.getSVC_ID())
										.append(fields[count++].getName(), mdlrRate.getSVC_SEQ())
										.append(fields[count++].getName(), mdlrRate.getEFF_DTE())
										.append(fields[count++].getName(), mdlrRate.getEND_DTE())
										.append(fields[count++].getName(), mdlrRate.getCANCEL_CDE())
										.append(fields[count++].getName(), mdlrRate.getRULE_CDE())
										.append(fields[count++].getName(), mdlrRate.getLST_UPDT_OPR_ID())
										.append(fields[count++].getName(), mdlrRate.getLST_UPDT_TS())
										.append(fields[count++].getName(), mdlrRate.getUPDT_NOTES());
		return doc;
	}
}
