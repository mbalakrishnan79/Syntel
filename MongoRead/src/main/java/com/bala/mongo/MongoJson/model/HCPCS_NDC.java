package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "HCPCS_NDC", schema = "MPR")
public class HCPCS_NDC {

	@Id
	private String CDE_HCPCS;
	private int SEQ_NBR;
	private String NDC;
	private Date EFF_DTE;
	private Date END_DTE;
	private String NDC_QUAL;
	private Double NDC_UNT;
	private String LST_UPDT_OPR_ID;
	private Timestamp LST_UPDT_TS;
	private String UPDT_NOTES;
	public String getCDE_HCPCS() {
		return CDE_HCPCS;
	}
	public void setCDE_HCPCS(String cDE_HCPCS) {
		CDE_HCPCS = cDE_HCPCS;
	}
	public int getSEQ_NBR() {
		return SEQ_NBR;
	}
	public void setSEQ_NBR(int sEQ_NBR) {
		SEQ_NBR = sEQ_NBR;
	}
	public String getNDC() {
		return NDC;
	}
	public void setNDC(String nDC) {
		NDC = nDC;
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
	public String getNDC_QUAL() {
		return NDC_QUAL;
	}
	public void setNDC_QUAL(String nDC_QUAL) {
		NDC_QUAL = nDC_QUAL;
	}
	public Double getNDC_UNT() {
		return NDC_UNT;
	}
	public void setNDC_UNT(Double nDC_UNT) {
		NDC_UNT = nDC_UNT;
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
		return "HCPCS_NDC [CDE_HCPCS=" + CDE_HCPCS + ", SEQ_NBR=" + SEQ_NBR
				+ ", NDC=" + NDC + ", EFF_DTE=" + EFF_DTE + ", END_DTE="
				+ END_DTE + ", NDC_QUAL=" + NDC_QUAL + ", NDC_UNT=" + NDC_UNT
				+ ", LST_UPDT_OPR_ID=" + LST_UPDT_OPR_ID + ", LST_UPDT_TS="
				+ LST_UPDT_TS + ", UPDT_NOTES=" + UPDT_NOTES + "]";
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new HCPCS_NDC().getClass().getDeclaredFields();
		int count = 0;

		HCPCS_NDC hcpcsNdc = (HCPCS_NDC) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),hcpcsNdc.getCDE_HCPCS())
										.append(fields[count++].getName(), hcpcsNdc.getSEQ_NBR())
										.append(fields[count++].getName(), hcpcsNdc.getNDC())
										.append(fields[count++].getName(), hcpcsNdc.getEFF_DTE())
										.append(fields[count++].getName(), hcpcsNdc.getEND_DTE())
										.append(fields[count++].getName(), hcpcsNdc.getNDC_QUAL())
										.append(fields[count++].getName(), hcpcsNdc.getNDC_UNT())
										.append(fields[count++].getName(), hcpcsNdc.getLST_UPDT_OPR_ID())
										.append(fields[count++].getName(), hcpcsNdc.getLST_UPDT_TS())
										.append(fields[count++].getName(), hcpcsNdc.getUPDT_NOTES());
		return doc;
	}
	
}
