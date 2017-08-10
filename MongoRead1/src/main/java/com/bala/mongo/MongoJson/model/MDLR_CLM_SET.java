package com.bala.mongo.MongoJson.model;

import java.sql.Timestamp;
import java.util.Date;
import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "MDLR_CLM_SET")
public class MDLR_CLM_SET implements RDBMSTable, java.io.Serializable {

	private int MDLR_CLM_SET_ID;
	private String MLTPL_YEAR_CLM_SET_IND_CD;
	private int CLM_SET_CLM_CNT;
	private int CLM_SET_CLM_LINE_CNT;
	private String CLM_SET_NM;
	private String CLM_SET_DESC;
	private String CLM_SET_RMRK_TXT;
	private Timestamp CREAT_DTM;
	private String CREAT_USER_ID;
	private Timestamp LAST_UPDTD_DTM;
	private String LAST_UPDTD_USER_ID;
	private String MDLR_CLM_SET_STTS_CD;
	private String DUMMYCLAIM_IND;
	private String CLM_ACT_IND;

	public int getMDLR_CLM_SET_ID() {
		return MDLR_CLM_SET_ID;
	}

	public void setMDLR_CLM_SET_ID(int mDLR_CLM_SET_ID) {
		MDLR_CLM_SET_ID = mDLR_CLM_SET_ID;
	}

	public String getMLTPL_YEAR_CLM_SET_IND_CD() {
		return MLTPL_YEAR_CLM_SET_IND_CD;
	}

	public void setMLTPL_YEAR_CLM_SET_IND_CD(String mLTPL_YEAR_CLM_SET_IND_CD) {
		MLTPL_YEAR_CLM_SET_IND_CD = mLTPL_YEAR_CLM_SET_IND_CD;
	}

	public int getCLM_SET_CLM_CNT() {
		return CLM_SET_CLM_CNT;
	}

	public void setCLM_SET_CLM_CNT(int cLM_SET_CLM_CNT) {
		CLM_SET_CLM_CNT = cLM_SET_CLM_CNT;
	}

	public int getCLM_SET_CLM_LINE_CNT() {
		return CLM_SET_CLM_LINE_CNT;
	}

	public void setCLM_SET_CLM_LINE_CNT(int cLM_SET_CLM_LINE_CNT) {
		CLM_SET_CLM_LINE_CNT = cLM_SET_CLM_LINE_CNT;
	}

	public String getCLM_SET_NM() {
		return CLM_SET_NM;
	}

	public void setCLM_SET_NM(String cLM_SET_NM) {
		CLM_SET_NM = cLM_SET_NM;
	}

	public String getCLM_SET_DESC() {
		return CLM_SET_DESC;
	}

	public void setCLM_SET_DESC(String cLM_SET_DESC) {
		CLM_SET_DESC = cLM_SET_DESC;
	}

	public String getCLM_SET_RMRK_TXT() {
		return CLM_SET_RMRK_TXT;
	}

	public void setCLM_SET_RMRK_TXT(String cLM_SET_RMRK_TXT) {
		CLM_SET_RMRK_TXT = cLM_SET_RMRK_TXT;
	}

	public Timestamp getCREAT_DTM() {
		return CREAT_DTM;
	}

	public void setCREAT_DTM(Timestamp cREAT_DTM) {
		CREAT_DTM = cREAT_DTM;
	}

	public String getCREAT_USER_ID() {
		return CREAT_USER_ID;
	}

	public void setCREAT_USER_ID(String cREAT_USER_ID) {
		CREAT_USER_ID = cREAT_USER_ID;
	}

	public Timestamp getLAST_UPDTD_DTM() {
		return LAST_UPDTD_DTM;
	}

	public void setLAST_UPDTD_DTM(Timestamp lAST_UPDTD_DTM) {
		LAST_UPDTD_DTM = lAST_UPDTD_DTM;
	}

	public String getLAST_UPDTD_USER_ID() {
		return LAST_UPDTD_USER_ID;
	}

	public void setLAST_UPDTD_USER_ID(String lAST_UPDTD_USER_ID) {
		LAST_UPDTD_USER_ID = lAST_UPDTD_USER_ID;
	}

	public String getMDLR_CLM_SET_STTS_CD() {
		return MDLR_CLM_SET_STTS_CD;
	}

	public void setMDLR_CLM_SET_STTS_CD(String mDLR_CLM_SET_STTS_CD) {
		MDLR_CLM_SET_STTS_CD = mDLR_CLM_SET_STTS_CD;
	}

	public String getDUMMYCLAIM_IND() {
		return DUMMYCLAIM_IND;
	}

	public void setDUMMYCLAIM_IND(String dUMMYCLAIM_IND) {
		DUMMYCLAIM_IND = dUMMYCLAIM_IND;
	}

	public String getCLM_ACT_IND() {
		return CLM_ACT_IND;
	}

	public void setCLM_ACT_IND(String cLM_ACT_IND) {
		CLM_ACT_IND = cLM_ACT_IND;
	}

	public String toString() {
		return (getMDLR_CLM_SET_ID() + ", " + getMLTPL_YEAR_CLM_SET_IND_CD() + ", "
				+ getCLM_SET_CLM_CNT() + ", " + getCLM_SET_CLM_LINE_CNT() + ", "
				+ getCLM_SET_NM() + ", " + getCLM_SET_DESC() + ", "
				+ getCLM_SET_RMRK_TXT() + ", " + getCREAT_DTM() + ", "
				+ getCREAT_USER_ID() + ", " + getLAST_UPDTD_DTM() + ","
				+ getLAST_UPDTD_USER_ID() + ", " + getMDLR_CLM_SET_STTS_CD() + ", "
				+ getDUMMYCLAIM_IND() + ", " + getCLM_ACT_IND());

	}

	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new MDLR_CLM_SET().getClass().getDeclaredFields();
		int count = 0;
		
		MDLR_CLM_SET mdlrClmSet = (MDLR_CLM_SET)table;
		
        BasicDBObject doc = new BasicDBObject(
				fields[count++].getName(),mdlrClmSet.getMDLR_CLM_SET_ID())
                .append(fields[count++].getName(), mdlrClmSet.getMLTPL_YEAR_CLM_SET_IND_CD())
				.append(fields[count++].getName(), mdlrClmSet.getCLM_SET_CLM_CNT())
				.append(fields[count++].getName(), mdlrClmSet.getCLM_SET_CLM_LINE_CNT())
				.append(fields[count++].getName(), mdlrClmSet.getCLM_SET_NM().trim())
				.append(fields[count++].getName(), mdlrClmSet.getCLM_SET_DESC())
				.append(fields[count++].getName(), mdlrClmSet.getCLM_SET_RMRK_TXT().trim())
				.append(fields[count++].getName(), mdlrClmSet.getCREAT_DTM())
				.append(fields[count++].getName(), mdlrClmSet.getCREAT_USER_ID().trim())
				.append(fields[count++].getName(), mdlrClmSet.getLAST_UPDTD_DTM())
				.append(fields[count++].getName(), mdlrClmSet.getLAST_UPDTD_USER_ID().trim())
				.append(fields[count++].getName(), mdlrClmSet.getMDLR_CLM_SET_STTS_CD().trim())
				.append(fields[count++].getName(), mdlrClmSet.getDUMMYCLAIM_IND().trim())
				.append(fields[count++].getName(), mdlrClmSet.getCLM_ACT_IND().trim());
     
				return doc;
	}
}
