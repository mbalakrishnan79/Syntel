package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "NDC_COMM", schema = "MPR")
public class NDC_COMM {

	@Id
	private String NDC;
	private String CDE_HCPCS;
	private Date EFF_DTE;
	private Date END_DTE;
	private String DRUG_NME;
	private Timestamp LST_UPDT_TS;
	
	public String getNDC() {
		return NDC;
	}
	public void setNDC(String nDC) {
		NDC = nDC;
	}
	public String getCDE_HCPCS() {
		return CDE_HCPCS;
	}
	public void setCDE_HCPCS(String cDE_HCPCS) {
		CDE_HCPCS = cDE_HCPCS;
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
	public String getDRUG_NME() {
		return DRUG_NME;
	}
	public void setDRUG_NME(String dRUG_NME) {
		DRUG_NME = dRUG_NME;
	}
	public Timestamp getLST_UPDT_TS() {
		return LST_UPDT_TS;
	}
	public void setLST_UPDT_TS(Timestamp lST_UPDT_TS) {
		LST_UPDT_TS = lST_UPDT_TS;
	}
	
	@Override
	public String toString() {
		return "NDC_COMM [NDC=" + NDC + ", CDE_HCPCS=" + CDE_HCPCS
				+ ", EFF_DTE=" + EFF_DTE + ", END_DTE=" + END_DTE
				+ ", DRUG_NME=" + DRUG_NME + ", LST_UPDT_TS=" + LST_UPDT_TS
				+ "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new NDC_COMM().getClass().getDeclaredFields();
		int count = 0;

		NDC_COMM ndcComm = (NDC_COMM) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),ndcComm.getNDC())
										.append(fields[count++].getName(), ndcComm.getCDE_HCPCS())
										.append(fields[count++].getName(), ndcComm.getEFF_DTE())
										.append(fields[count++].getName(), ndcComm.getEND_DTE())
										.append(fields[count++].getName(), ndcComm.getDRUG_NME())
										.append(fields[count++].getName(), ndcComm.getLST_UPDT_TS());
		return doc;
	}
}
