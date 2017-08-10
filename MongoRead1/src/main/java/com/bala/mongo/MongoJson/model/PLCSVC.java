package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "PLCSVC", schema = "MPR")
public class PLCSVC {

	@Id
	private String CDE_TYPE;
	private int CDE_ID;
	private int SEQ_NBR;
	private String PLC_OF_SVC;
	
	public String getCDE_TYPE() {
		return CDE_TYPE;
	}
	public void setCDE_TYPE(String cDE_TYPE) {
		CDE_TYPE = cDE_TYPE;
	}
	public int getCDE_ID() {
		return CDE_ID;
	}
	public void setCDE_ID(int cDE_ID) {
		CDE_ID = cDE_ID;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public String getPLC_OF_SVC() {
		return PLC_OF_SVC;
	}
	public void setPLC_OF_SVC(String pLC_OF_SVC) {
		PLC_OF_SVC = pLC_OF_SVC;
	}

	@Override
	public String toString() {
		return "PLCSVC [CDE_TYPE=" + CDE_TYPE + ", CDE_ID=" + CDE_ID
				+ ", SEQ_NBR=" + SEQ_NBR + ", PLC_OF_SVC=" + PLC_OF_SVC + "]";
	}
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new PLCSVC().getClass().getDeclaredFields();
		int count = 0;

		PLCSVC plcSvc = (PLCSVC) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),plcSvc.getCDE_TYPE())
										.append(fields[count++].getName(), plcSvc.getCDE_ID())
										.append(fields[count++].getName(), plcSvc.getSEQ_NBR())
										.append(fields[count++].getName(), plcSvc.getPLC_OF_SVC());
		return doc;
	}
}
