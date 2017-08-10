package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "MDLR_CLM_LINE")
public class MDLR_CLM_LINE implements RDBMSTable, java.io.Serializable {

	@Id
	private int MDLR_CLM_SET_ID;
	@Id
	private int MDLR_CLM_SUBSET_ID;
	@Id
	private long CLM_SQNC_ID;
	@Id
	private long CLM_LINE_SQNC_ID;
	private String CLM_LINE_NBR;
	private String PLACE_OF_SRVC_CD;
	private double BILLD_CHRG_AMT;
	private double CVRD_EXPNS_AMT;
	private String RVNU_CD;
	private String HLTH_SRVC_CD;
	private String HLTH_SRVC_TYPE_CD;
	private Date CLM_LINE_SRVC_STRT_DT;
	private Date CLM_LINE_SRVC_END_DT;
	private String CLM_NASCO_PAR_IND_CD;
	private double BILLD_SRVC_UNIT_CNT;
	private String PROC_MDFR_CD_REPEATING_GRP_CD;
	private Timestamp CREAT_DTM;
	private String CREAT_USER_ID;
	private Timestamp LAST_UPDTD_DTM;
	private String LAST_UPDTD_USER_ID;
	private String NST_SRVC_CTGRY_CD;
	private String NST_SRVC_CTGRY_GRPG_CD;
	private int NST_RM_TERM_APRVL_CD_ID;
	private String SMART_TATTOO_NST_CD;
	private String SMART_TATTOO_RM_ID;
	private int NST_SRVC_CTGRY_GRPG_ID;
	private int NST_PRTY_LVL_NBR;
	private int NST_PRCG_CRTRIA_CD;
	private String PROV_CNTRCT_ID;
	private String PAT_ACCT_NBR;
	private double OLD_BILLD_CHRG_AMT;
	private String FUNDG_CF_CD;
	private String MBU_CF_CD;

	public int getMDLR_CLM_SET_ID() {
		return MDLR_CLM_SET_ID;
	}

	public void setMDLR_CLM_SET_ID(int mDLR_CLM_SET_ID) {
		MDLR_CLM_SET_ID = mDLR_CLM_SET_ID;
	}

	public int getMDLR_CLM_SUBSET_ID() {
		return MDLR_CLM_SUBSET_ID;
	}

	public void setMDLR_CLM_SUBSET_ID(int mDLR_CLM_SUBSET_ID) {
		MDLR_CLM_SUBSET_ID = mDLR_CLM_SUBSET_ID;
	}

	public long getCLM_SQNC_ID() {
		return CLM_SQNC_ID;
	}

	public void setCLM_SQNC_ID(long cLM_SQNC_ID) {
		CLM_SQNC_ID = cLM_SQNC_ID;
	}

	public long getCLM_LINE_SQNC_ID() {
		return CLM_LINE_SQNC_ID;
	}

	public void setCLM_LINE_SQNC_ID(long cLM_LINE_SQNC_ID) {
		CLM_LINE_SQNC_ID = cLM_LINE_SQNC_ID;
	}

	public String getCLM_LINE_NBR() {
		return CLM_LINE_NBR;
	}

	public void setCLM_LINE_NBR(String cLM_LINE_NBR) {
		CLM_LINE_NBR = cLM_LINE_NBR;
	}

	public String getPLACE_OF_SRVC_CD() {
		return PLACE_OF_SRVC_CD;
	}

	public void setPLACE_OF_SRVC_CD(String pLACE_OF_SRVC_CD) {
		PLACE_OF_SRVC_CD = pLACE_OF_SRVC_CD;
	}

	public double getBILLD_CHRG_AMT() {
		return BILLD_CHRG_AMT;
	}

	public void setBILLD_CHRG_AMT(double bILLD_CHRG_AMT) {
		BILLD_CHRG_AMT = bILLD_CHRG_AMT;
	}

	public double getCVRD_EXPNS_AMT() {
		return CVRD_EXPNS_AMT;
	}

	public void setCVRD_EXPNS_AMT(double cVRD_EXPNS_AMT) {
		CVRD_EXPNS_AMT = cVRD_EXPNS_AMT;
	}

	public String getRVNU_CD() {
		return RVNU_CD;
	}

	public void setRVNU_CD(String rVNU_CD) {
		RVNU_CD = rVNU_CD;
	}

	public String getHLTH_SRVC_CD() {
		return HLTH_SRVC_CD;
	}

	public void setHLTH_SRVC_CD(String hLTH_SRVC_CD) {
		HLTH_SRVC_CD = hLTH_SRVC_CD;
	}

	public String getHLTH_SRVC_TYPE_CD() {
		return HLTH_SRVC_TYPE_CD;
	}

	public void setHLTH_SRVC_TYPE_CD(String hLTH_SRVC_TYPE_CD) {
		HLTH_SRVC_TYPE_CD = hLTH_SRVC_TYPE_CD;
	}

	public Date getCLM_LINE_SRVC_STRT_DT() {
		return CLM_LINE_SRVC_STRT_DT;
	}

	public void setCLM_LINE_SRVC_STRT_DT(Date cLM_LINE_SRVC_STRT_DT) {
		CLM_LINE_SRVC_STRT_DT = cLM_LINE_SRVC_STRT_DT;
	}

	public Date getCLM_LINE_SRVC_END_DT() {
		return CLM_LINE_SRVC_END_DT;
	}

	public void setCLM_LINE_SRVC_END_DT(Date cLM_LINE_SRVC_END_DT) {
		CLM_LINE_SRVC_END_DT = cLM_LINE_SRVC_END_DT;
	}

	public String getCLM_NASCO_PAR_IND_CD() {
		return CLM_NASCO_PAR_IND_CD;
	}

	public void setCLM_NASCO_PAR_IND_CD(String cLM_NASCO_PAR_IND_CD) {
		CLM_NASCO_PAR_IND_CD = cLM_NASCO_PAR_IND_CD;
	}

	public double getBILLD_SRVC_UNIT_CNT() {
		return BILLD_SRVC_UNIT_CNT;
	}

	public void setBILLD_SRVC_UNIT_CNT(double bILLD_SRVC_UNIT_CNT) {
		BILLD_SRVC_UNIT_CNT = bILLD_SRVC_UNIT_CNT;
	}

	public String getPROC_MDFR_CD_REPEATING_GRP_CD() {
		return PROC_MDFR_CD_REPEATING_GRP_CD;
	}

	public void setPROC_MDFR_CD_REPEATING_GRP_CD(
			String pROC_MDFR_CD_REPEATING_GRP_CD) {
		PROC_MDFR_CD_REPEATING_GRP_CD = pROC_MDFR_CD_REPEATING_GRP_CD;
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

	public String getNST_SRVC_CTGRY_CD() {
		return NST_SRVC_CTGRY_CD;
	}

	public void setNST_SRVC_CTGRY_CD(String nST_SRVC_CTGRY_CD) {
		NST_SRVC_CTGRY_CD = nST_SRVC_CTGRY_CD;
	}

	public String getNST_SRVC_CTGRY_GRPG_CD() {
		return NST_SRVC_CTGRY_GRPG_CD;
	}

	public void setNST_SRVC_CTGRY_GRPG_CD(String nST_SRVC_CTGRY_GRPG_CD) {
		NST_SRVC_CTGRY_GRPG_CD = nST_SRVC_CTGRY_GRPG_CD;
	}

	public int getNST_RM_TERM_APRVL_CD_ID() {
		return NST_RM_TERM_APRVL_CD_ID;
	}

	public void setNST_RM_TERM_APRVL_CD_ID(int nST_RM_TERM_APRVL_CD_ID) {
		NST_RM_TERM_APRVL_CD_ID = nST_RM_TERM_APRVL_CD_ID;
	}

	public String getSMART_TATTOO_NST_CD() {
		return SMART_TATTOO_NST_CD;
	}

	public void setSMART_TATTOO_NST_CD(String sMART_TATTOO_NST_CD) {
		SMART_TATTOO_NST_CD = sMART_TATTOO_NST_CD;
	}

	public String getSMART_TATTOO_RM_ID() {
		return SMART_TATTOO_RM_ID;
	}

	public void setSMART_TATTOO_RM_ID(String sMART_TATTOO_RM_ID) {
		SMART_TATTOO_RM_ID = sMART_TATTOO_RM_ID;
	}

	public int getNST_SRVC_CTGRY_GRPG_ID() {
		return NST_SRVC_CTGRY_GRPG_ID;
	}

	public void setNST_SRVC_CTGRY_GRPG_ID(int nST_SRVC_CTGRY_GRPG_ID) {
		NST_SRVC_CTGRY_GRPG_ID = nST_SRVC_CTGRY_GRPG_ID;
	}

	public int getNST_PRTY_LVL_NBR() {
		return NST_PRTY_LVL_NBR;
	}

	public void setNST_PRTY_LVL_NBR(int nST_PRTY_LVL_NBR) {
		NST_PRTY_LVL_NBR = nST_PRTY_LVL_NBR;
	}

	public int getNST_PRCG_CRTRIA_CD() {
		return NST_PRCG_CRTRIA_CD;
	}

	public void setNST_PRCG_CRTRIA_CD(int nST_PRCG_CRTRIA_CD) {
		NST_PRCG_CRTRIA_CD = nST_PRCG_CRTRIA_CD;
	}

	public String getPROV_CNTRCT_ID() {
		return PROV_CNTRCT_ID;
	}

	public void setPROV_CNTRCT_ID(String pROV_CNTRCT_ID) {
		PROV_CNTRCT_ID = pROV_CNTRCT_ID;
	}

	public String getPAT_ACCT_NBR() {
		return PAT_ACCT_NBR;
	}

	public void setPAT_ACCT_NBR(String pAT_ACCT_NBR) {
		PAT_ACCT_NBR = pAT_ACCT_NBR;
	}

	public double getOLD_BILLD_CHRG_AMT() {
		return OLD_BILLD_CHRG_AMT;
	}

	public void setOLD_BILLD_CHRG_AMT(double oLD_BILLD_CHRG_AMT) {
		OLD_BILLD_CHRG_AMT = oLD_BILLD_CHRG_AMT;
	}

	public String getFUNDG_CF_CD() {
		return FUNDG_CF_CD;
	}

	public void setFUNDG_CF_CD(String fUNDG_CF_CD) {
		FUNDG_CF_CD = fUNDG_CF_CD;
	}

	public String getMBU_CF_CD() {
		return MBU_CF_CD;
	}

	public void setMBU_CF_CD(String mBU_CF_CD) {
		MBU_CF_CD = mBU_CF_CD;
	}

	public String toString() {
		return (getMDLR_CLM_SET_ID() + ", " + getMDLR_CLM_SUBSET_ID() + ", "
				+ getCLM_SQNC_ID() + ", " + getCLM_LINE_SQNC_ID() + ", "
				+ getCLM_LINE_NBR() + ", " + getPLACE_OF_SRVC_CD() + ", "
				+ getBILLD_CHRG_AMT() + ", " + getCVRD_EXPNS_AMT() + ", "
				+ getRVNU_CD() + ", " + getHLTH_SRVC_CD() + ","
				+ getHLTH_SRVC_TYPE_CD() + ", " + getCLM_LINE_SRVC_STRT_DT()
				+ ", " + getCLM_LINE_SRVC_END_DT() + ", "
				+ getCLM_NASCO_PAR_IND_CD() + ", " + getBILLD_SRVC_UNIT_CNT()
				+ ", " + getPROC_MDFR_CD_REPEATING_GRP_CD() + ", "
				+ getCREAT_DTM() + ", " + getCREAT_USER_ID() + ", "
				+ getLAST_UPDTD_DTM() + ", " + getLAST_UPDTD_USER_ID() + ", "
				+ getNST_SRVC_CTGRY_CD() + ", " + getNST_SRVC_CTGRY_GRPG_CD()
				+ ", " + getNST_RM_TERM_APRVL_CD_ID() + ", "
				+ getSMART_TATTOO_NST_CD() + ", " + getSMART_TATTOO_RM_ID()
				+ ", " + getNST_SRVC_CTGRY_GRPG_ID() + ", "
				+ getNST_PRTY_LVL_NBR() + "," + getNST_PRCG_CRTRIA_CD() + ", "
				+ getPROV_CNTRCT_ID() + ", " + getPAT_ACCT_NBR() + ", "
				+ getOLD_BILLD_CHRG_AMT() + "," + getFUNDG_CF_CD() + "," + getMBU_CF_CD());

	}

	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new MDLR_CLM_LINE().getClass().getDeclaredFields();
		int count = 0;

		MDLR_CLM_LINE mdlrClmLine = (MDLR_CLM_LINE) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(),mdlrClmLine.getMDLR_CLM_SET_ID())
									.append(fields[count++].getName(), mdlrClmLine.getMDLR_CLM_SUBSET_ID())
									.append(fields[count++].getName(), mdlrClmLine.getCLM_SQNC_ID())
									.append(fields[count++].getName(), mdlrClmLine.getCLM_LINE_SQNC_ID())
									.append(fields[count++].getName(), mdlrClmLine.getCLM_LINE_NBR().trim())
									.append(fields[count++].getName(), mdlrClmLine.getPLACE_OF_SRVC_CD().trim())
									.append(fields[count++].getName(), mdlrClmLine.getBILLD_CHRG_AMT())
									.append(fields[count++].getName(), mdlrClmLine.getCVRD_EXPNS_AMT())
									.append(fields[count++].getName(), mdlrClmLine.getRVNU_CD().trim())
									.append(fields[count++].getName(), mdlrClmLine.getHLTH_SRVC_CD().trim())
									.append(fields[count++].getName(), mdlrClmLine.getHLTH_SRVC_TYPE_CD().trim())
									.append(fields[count++].getName(), mdlrClmLine.getCLM_LINE_SRVC_STRT_DT())
									.append(fields[count++].getName(),mdlrClmLine.getCLM_LINE_SRVC_END_DT())
									.append(fields[count++].getName(),mdlrClmLine.getCLM_NASCO_PAR_IND_CD())
									.append(fields[count++].getName(),mdlrClmLine.getBILLD_SRVC_UNIT_CNT())
									.append(fields[count++].getName(),mdlrClmLine.getPROC_MDFR_CD_REPEATING_GRP_CD().trim())
									.append(fields[count++].getName(),mdlrClmLine.getCREAT_DTM())
									.append(fields[count++].getName(),mdlrClmLine.getCREAT_USER_ID())
									.append(fields[count++].getName(),mdlrClmLine.getLAST_UPDTD_DTM())
									.append(fields[count++].getName(),mdlrClmLine.getLAST_UPDTD_USER_ID().trim())
									.append(fields[count++].getName(),mdlrClmLine.getNST_SRVC_CTGRY_CD().trim())
									.append(fields[count++].getName(),mdlrClmLine.getNST_SRVC_CTGRY_GRPG_CD())
									.append(fields[count++].getName(),mdlrClmLine.getNST_RM_TERM_APRVL_CD_ID())
									.append(fields[count++].getName(),mdlrClmLine.getSMART_TATTOO_NST_CD().trim())
									.append(fields[count++].getName(),mdlrClmLine.getSMART_TATTOO_RM_ID())
									.append(fields[count++].getName(),mdlrClmLine.getNST_SRVC_CTGRY_GRPG_ID())
									.append(fields[count++].getName(),mdlrClmLine.getNST_PRTY_LVL_NBR())
									.append(fields[count++].getName(),mdlrClmLine.getNST_PRCG_CRTRIA_CD())
									.append(fields[count++].getName(),mdlrClmLine.getPROV_CNTRCT_ID().trim())
									.append(fields[count++].getName(),mdlrClmLine.getPAT_ACCT_NBR().trim())
									.append(fields[count++].getName(),mdlrClmLine.getOLD_BILLD_CHRG_AMT())
									.append(fields[count++].getName(),mdlrClmLine.getFUNDG_CF_CD())
									.append(fields[count++].getName(),mdlrClmLine.getMBU_CF_CD().trim());

		return doc;
	}
}
