package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "LMTCLS", schema = "MPR")
public class LMTCLS {

	@Id
	private String CDE_TYPE;
	private int CDE_ID;
	private int SEQ_NBR;
	private String LIMIT_CLS;
	private int LMTCLS_SEQ_NBR;
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
	public String getLIMIT_CLS() {
		return LIMIT_CLS;
	}
	public void setLIMIT_CLS(String lIMIT_CLS) {
		LIMIT_CLS = lIMIT_CLS;
	}
	public int getLMTCLS_SEQ_NBR() {
		return LMTCLS_SEQ_NBR;
	}
	public void setLMTCLS_SEQ_NBR(int lMTCLS_SEQ_NBR) {
		LMTCLS_SEQ_NBR = lMTCLS_SEQ_NBR;
	}
	@Override
	public String toString() {
		return "LMTCLS [CDE_TYPE=" + CDE_TYPE + ", CDE_ID=" + CDE_ID
				+ ", SEQ_NBR=" + SEQ_NBR + ", LIMIT_CLS=" + LIMIT_CLS
				+ ", LMTCLS_SEQ_NBR=" + LMTCLS_SEQ_NBR + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new LMTCLS().getClass().getDeclaredFields();
		int count = 0;

		LMTCLS lmtCls = (LMTCLS) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),lmtCls.getCDE_TYPE())
										.append(fields[count++].getName(), lmtCls.getCDE_ID())
										.append(fields[count++].getName(), lmtCls.getSEQ_NBR())
										.append(fields[count++].getName(), lmtCls.getLIMIT_CLS())
										.append(fields[count++].getName(), lmtCls.getLMTCLS_SEQ_NBR());
		return doc;
	}
}
