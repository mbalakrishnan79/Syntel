package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "MDLR_SURG_GROUP", schema = "MPR")
public class MDLR_SURG_GROUP {

	@Id
	private int SURG_ID;
	private int SEQ_NBR;
	private int SURG_GRP_SEQ;
	private String SURG_GRP;
	public int getSURG_ID() {
		return SURG_ID;
	}
	public void setSURG_ID(int sURG_ID) {
		SURG_ID = sURG_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public int getSURG_GRP_SEQ() {
		return SURG_GRP_SEQ;
	}
	public void setSURG_GRP_SEQ(int sURG_GRP_SEQ) {
		SURG_GRP_SEQ = sURG_GRP_SEQ;
	}
	public String getSURG_GRP() {
		return SURG_GRP;
	}
	public void setSURG_GRP(String sURG_GRP) {
		SURG_GRP = sURG_GRP;
	}
	@Override
	public String toString() {
		return "MDLR_SURG_GROUP [SURG_ID=" + SURG_ID + ", SEQ_NBR=" + SEQ_NBR
				+ ", SURG_GRP_SEQ=" + SURG_GRP_SEQ + ", SURG_GRP=" + SURG_GRP
				+ "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new MDLR_SURG_GROUP().getClass().getDeclaredFields();
		int count = 0;

		MDLR_SURG_GROUP mdlrSurgGroup = (MDLR_SURG_GROUP) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),mdlrSurgGroup.getSURG_ID())
										.append(fields[count++].getName(), mdlrSurgGroup.getSEQ_NBR())
										.append(fields[count++].getName(), mdlrSurgGroup.getSURG_GRP_SEQ())
										.append(fields[count++].getName(), mdlrSurgGroup.getSURG_GRP());
		return doc;
	}
}
