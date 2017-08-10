package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.sql.Date;
import java.sql.Timestamp;
import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "MDLR_CLM")
public class MDLR_CLM implements RDBMSTable, java.io.Serializable {

	private int MDLR_CLM_SET_ID;
	private int MDLR_CLM_SUBSET_ID;
	private long CLM_SQNC_ID;
	private String CLM_NBR;
	private int TOTL_CLM_LINE_CNT;
	private String CLM_SOR_CD;
	private String INPAT_CD;
	private int TOTL_INPAT_DAY_CNT;
	private Double TOTL_BILLD_AMT;
	private Double TOTL_CVRD_EXPNS_AMT;
	private String TYPE_OF_BILL_CD;
	private Date SRVC_STRT_DT;
	private Date SRVC_END_DT;
	private int CVRD_DAYS_CNT;
	private int BILLD_DAYS_CNT;
	private Date ADMT_DT;
	private String SRC_DSCHRG_STTS_CD;
	private String ADMTG_DIAG_CD;
	private String ADMTG_POA_CD;
	private String SRC_ATCHMNT_CD;
	private String TRMA_IND_CD;
	private int ADMSN_HOUR_NBR;
	private int DSCHRG_HOUR_NBR;
	private Date DSCHRG_DT;
	private String COB_IND_CD;
	private Date CLM_ACTN_DT;
	private String ICD_VRSN_CD;
	private String SRC_SPCLTY_CD;
	private String MBRSHP_PROD_ID;
	private String CLM_ITS_HOST_CD;
	private String WLP_LOB_CMPNY_CD;
	private Date SRC_MBR_BRTH_DT;
	private String SRC_MBR_GNDR_CD;
	private String SRC_SBSCRBR_ST_CD;
	private String SRC_GRP_NBR;
	private String SRC_MBR_ZIP_CD;
	private String INN_CD;
	private String APLCTN_USER_UPLD_CLM_IND_CD;
	private Timestamp CREAT_DTM;
	private String CREAT_USER_ID;
	private Timestamp LAST_UPDTD_DTM;
	private String LAST_UPDTD_USER_ID;
	private Double TOTL_ALWD_AMT;
	private String SRC_MEDCR_ID;
	private String PROD_CF_CD;
	private int DRG_VRSN_NBR;
	private String DRG_CD;
	private String LOCAL_PRVD_CD;
	private String DRG_TYPE_CD;
	private String PRCG_SRC_CD;
	private Double OLD_TOTL_BILLD_AMT;
	private String PROFIT_CD;
	
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

	public String getCLM_NBR() {
		return CLM_NBR;
	}

	public void setCLM_NBR(String cLM_NBR) {
		CLM_NBR = cLM_NBR;
	}

	public int getTOTL_CLM_LINE_CNT() {
		return TOTL_CLM_LINE_CNT;
	}

	public void setTOTL_CLM_LINE_CNT(int tOTL_CLM_LINE_CNT) {
		TOTL_CLM_LINE_CNT = tOTL_CLM_LINE_CNT;
	}

	public String getCLM_SOR_CD() {
		return CLM_SOR_CD;
	}

	public void setCLM_SOR_CD(String cLM_SOR_CD) {
		CLM_SOR_CD = cLM_SOR_CD;
	}

	public String getINPAT_CD() {
		return INPAT_CD;
	}

	public void setINPAT_CD(String iNPAT_CD) {
		INPAT_CD = iNPAT_CD;
	}

	public int getTOTL_INPAT_DAY_CNT() {
		return TOTL_INPAT_DAY_CNT;
	}

	public void setTOTL_INPAT_DAY_CNT(int tOTL_INPAT_DAY_CNT) {
		TOTL_INPAT_DAY_CNT = tOTL_INPAT_DAY_CNT;
	}

	public Double getTOTL_BILLD_AMT() {
		return TOTL_BILLD_AMT;
	}

	public void setTOTL_BILLD_AMT(Double tOTL_BILLD_AMT) {
		TOTL_BILLD_AMT = tOTL_BILLD_AMT;
	}

	public Double getTOTL_CVRD_EXPNS_AMT() {
		return TOTL_CVRD_EXPNS_AMT;
	}

	public void setTOTL_CVRD_EXPNS_AMT(Double tOTL_CVRD_EXPNS_AMT) {
		TOTL_CVRD_EXPNS_AMT = tOTL_CVRD_EXPNS_AMT;
	}

	public String getTYPE_OF_BILL_CD() {
		return TYPE_OF_BILL_CD;
	}

	public void setTYPE_OF_BILL_CD(String tYPE_OF_BILL_CD) {
		TYPE_OF_BILL_CD = tYPE_OF_BILL_CD;
	}

	public Date getSRVC_STRT_DT() {
		return SRVC_STRT_DT;
	}

	public void setSRVC_STRT_DT(Date sRVC_STRT_DT) {
		SRVC_STRT_DT = sRVC_STRT_DT;
	}

	public Date getSRVC_END_DT() {
		return SRVC_END_DT;
	}

	public void setSRVC_END_DT(Date sRVC_END_DT) {
		SRVC_END_DT = sRVC_END_DT;
	}

	public int getCVRD_DAYS_CNT() {
		return CVRD_DAYS_CNT;
	}

	public void setCVRD_DAYS_CNT(int cVRD_DAYS_CNT) {
		CVRD_DAYS_CNT = cVRD_DAYS_CNT;
	}

	public int getBILLD_DAYS_CNT() {
		return BILLD_DAYS_CNT;
	}

	public void setBILLD_DAYS_CNT(int bILLD_DAYS_CNT) {
		BILLD_DAYS_CNT = bILLD_DAYS_CNT;
	}

	public Date getADMT_DT() {
		return ADMT_DT;
	}

	public void setADMT_DT(Date aDMT_DT) {
		ADMT_DT = aDMT_DT;
	}

	public String getSRC_DSCHRG_STTS_CD() {
		return SRC_DSCHRG_STTS_CD;
	}

	public void setSRC_DSCHRG_STTS_CD(String sRC_DSCHRG_STTS_CD) {
		SRC_DSCHRG_STTS_CD = sRC_DSCHRG_STTS_CD;
	}

	public String getADMTG_DIAG_CD() {
		return ADMTG_DIAG_CD;
	}

	public void setADMTG_DIAG_CD(String aDMTG_DIAG_CD) {
		ADMTG_DIAG_CD = aDMTG_DIAG_CD;
	}

	public String getADMTG_POA_CD() {
		return ADMTG_POA_CD;
	}

	public void setADMTG_POA_CD(String aDMTG_POA_CD) {
		ADMTG_POA_CD = aDMTG_POA_CD;
	}

	public String getSRC_ATCHMNT_CD() {
		return SRC_ATCHMNT_CD;
	}

	public void setSRC_ATCHMNT_CD(String sRC_ATCHMNT_CD) {
		SRC_ATCHMNT_CD = sRC_ATCHMNT_CD;
	}

	public String getTRMA_IND_CD() {
		return TRMA_IND_CD;
	}

	public void setTRMA_IND_CD(String tRMA_IND_CD) {
		TRMA_IND_CD = tRMA_IND_CD;
	}

	public int getADMSN_HOUR_NBR() {
		return ADMSN_HOUR_NBR;
	}

	public void setADMSN_HOUR_NBR(int aDMSN_HOUR_NBR) {
		ADMSN_HOUR_NBR = aDMSN_HOUR_NBR;
	}

	public int getDSCHRG_HOUR_NBR() {
		return DSCHRG_HOUR_NBR;
	}

	public void setDSCHRG_HOUR_NBR(int dSCHRG_HOUR_NBR) {
		DSCHRG_HOUR_NBR = dSCHRG_HOUR_NBR;
	}

	public Date getDSCHRG_DT() {
		return DSCHRG_DT;
	}

	public void setDSCHRG_DT(Date dSCHRG_DT) {
		DSCHRG_DT = dSCHRG_DT;
	}

	public String getCOB_IND_CD() {
		return COB_IND_CD;
	}

	public void setCOB_IND_CD(String cOB_IND_CD) {
		COB_IND_CD = cOB_IND_CD;
	}

	public Date getCLM_ACTN_DT() {
		return CLM_ACTN_DT;
	}

	public void setCLM_ACTN_DT(Date cLM_ACTN_DT) {
		CLM_ACTN_DT = cLM_ACTN_DT;
	}

	public String getICD_VRSN_CD() {
		return ICD_VRSN_CD;
	}

	public void setICD_VRSN_CD(String iCD_VRSN_CD) {
		ICD_VRSN_CD = iCD_VRSN_CD;
	}

	public String getSRC_SPCLTY_CD() {
		return SRC_SPCLTY_CD;
	}

	public void setSRC_SPCLTY_CD(String sRC_SPCLTY_CD) {
		SRC_SPCLTY_CD = sRC_SPCLTY_CD;
	}

	public String getMBRSHP_PROD_ID() {
		return MBRSHP_PROD_ID;
	}

	public void setMBRSHP_PROD_ID(String mBRSHP_PROD_ID) {
		MBRSHP_PROD_ID = mBRSHP_PROD_ID;
	}

	public String getCLM_ITS_HOST_CD() {
		return CLM_ITS_HOST_CD;
	}

	public void setCLM_ITS_HOST_CD(String cLM_ITS_HOST_CD) {
		CLM_ITS_HOST_CD = cLM_ITS_HOST_CD;
	}

	public String getWLP_LOB_CMPNY_CD() {
		return WLP_LOB_CMPNY_CD;
	}

	public void setWLP_LOB_CMPNY_CD(String wLP_LOB_CMPNY_CD) {
		WLP_LOB_CMPNY_CD = wLP_LOB_CMPNY_CD;
	}

	public Date getSRC_MBR_BRTH_DT() {
		return SRC_MBR_BRTH_DT;
	}

	public void setSRC_MBR_BRTH_DT(Date sRC_MBR_BRTH_DT) {
		SRC_MBR_BRTH_DT = sRC_MBR_BRTH_DT;
	}

	public String getSRC_MBR_GNDR_CD() {
		return SRC_MBR_GNDR_CD;
	}

	public void setSRC_MBR_GNDR_CD(String sRC_MBR_GNDR_CD) {
		SRC_MBR_GNDR_CD = sRC_MBR_GNDR_CD;
	}

	public String getSRC_SBSCRBR_ST_CD() {
		return SRC_SBSCRBR_ST_CD;
	}

	public void setSRC_SBSCRBR_ST_CD(String sRC_SBSCRBR_ST_CD) {
		SRC_SBSCRBR_ST_CD = sRC_SBSCRBR_ST_CD;
	}

	public String getSRC_GRP_NBR() {
		return SRC_GRP_NBR;
	}

	public void setSRC_GRP_NBR(String sRC_GRP_NBR) {
		SRC_GRP_NBR = sRC_GRP_NBR;
	}

	public String getSRC_MBR_ZIP_CD() {
		return SRC_MBR_ZIP_CD;
	}

	public void setSRC_MBR_ZIP_CD(String sRC_MBR_ZIP_CD) {
		SRC_MBR_ZIP_CD = sRC_MBR_ZIP_CD;
	}

	public String getINN_CD() {
		return INN_CD;
	}

	public void setINN_CD(String iNN_CD) {
		INN_CD = iNN_CD;
	}

	public String getAPLCTN_USER_UPLD_CLM_IND_CD() {
		return APLCTN_USER_UPLD_CLM_IND_CD;
	}

	public void setAPLCTN_USER_UPLD_CLM_IND_CD(String aPLCTN_USER_UPLD_CLM_IND_CD) {
		APLCTN_USER_UPLD_CLM_IND_CD = aPLCTN_USER_UPLD_CLM_IND_CD;
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

	public Double getTOTL_ALWD_AMT() {
		return TOTL_ALWD_AMT;
	}

	public void setTOTL_ALWD_AMT(Double tOTL_ALWD_AMT) {
		TOTL_ALWD_AMT = tOTL_ALWD_AMT;
	}

	public String getSRC_MEDCR_ID() {
		return SRC_MEDCR_ID;
	}

	public void setSRC_MEDCR_ID(String sRC_MEDCR_ID) {
		SRC_MEDCR_ID = sRC_MEDCR_ID;
	}

	public String getPROD_CF_CD() {
		return PROD_CF_CD;
	}

	public void setPROD_CF_CD(String pROD_CF_CD) {
		PROD_CF_CD = pROD_CF_CD;
	}

	public int getDRG_VRSN_NBR() {
		return DRG_VRSN_NBR;
	}

	public void setDRG_VRSN_NBR(int dRG_VRSN_NBR) {
		DRG_VRSN_NBR = dRG_VRSN_NBR;
	}

	public String getDRG_CD() {
		return DRG_CD;
	}

	public void setDRG_CD(String dRG_CD) {
		DRG_CD = dRG_CD;
	}

	public String getLOCAL_PRVD_CD() {
		return LOCAL_PRVD_CD;
	}

	public void setLOCAL_PRVD_CD(String lOCAL_PRVD_CD) {
		LOCAL_PRVD_CD = lOCAL_PRVD_CD;
	}

	public String getDRG_TYPE_CD() {
		return DRG_TYPE_CD;
	}

	public void setDRG_TYPE_CD(String dRG_TYPE_CD) {
		DRG_TYPE_CD = dRG_TYPE_CD;
	}

	public String getPRCG_SRC_CD() {
		return PRCG_SRC_CD;
	}

	public void setPRCG_SRC_CD(String pRCG_SRC_CD) {
		PRCG_SRC_CD = pRCG_SRC_CD;
	}

	public Double getOLD_TOTL_BILLD_AMT() {
		return OLD_TOTL_BILLD_AMT;
	}

	public void setOLD_TOTL_BILLD_AMT(Double oLD_TOTL_BILLD_AMT) {
		OLD_TOTL_BILLD_AMT = oLD_TOTL_BILLD_AMT;
	}

	public String getPROFIT_CD() {
		return PROFIT_CD;
	}

	public void setPROFIT_CD(String pROFIT_CD) {
		PROFIT_CD = pROFIT_CD;
	}

	public String toString() {
		return (getMDLR_CLM_SET_ID() + ", " + getMDLR_CLM_SUBSET_ID() + ", "
				+ getCLM_SQNC_ID() + ", " + getCLM_NBR() + ", "
				+ getTOTL_CLM_LINE_CNT() + ", " + getCLM_SOR_CD() + ", "
				+ getINPAT_CD() + ", " + getTOTL_INPAT_DAY_CNT() + ", "
				+ getTOTL_BILLD_AMT() + "' " + getTOTL_CVRD_EXPNS_AMT() + ", "
				+ getTYPE_OF_BILL_CD() + ", " + getSRVC_STRT_DT() + ", "
				+ getSRVC_END_DT() + ", " + getCVRD_DAYS_CNT() + ", "
				+ getBILLD_DAYS_CNT() + "," + getADMT_DT() + ", "
				+ getSRC_DSCHRG_STTS_CD() + " ," + getADMTG_DIAG_CD() + " ,"
				+ getADMTG_POA_CD() + ", " + getSRC_ATCHMNT_CD() + ", "
				+ getTRMA_IND_CD() + ", " + getADMSN_HOUR_NBR() + ", "
				+ getDSCHRG_HOUR_NBR() + " " + getDSCHRG_DT() + " ,"
				+ getCOB_IND_CD() + " ," + getCLM_ACTN_DT() + " ," + getICD_VRSN_CD()
				+ ", " + getSRC_SPCLTY_CD() + ", " + getMBRSHP_PROD_ID() + " ,"
				+ getCLM_ITS_HOST_CD() + ", " + getWLP_LOB_CMPNY_CD() + " ,"
				+ getSRC_MBR_BRTH_DT() + ", " + getSRC_MBR_GNDR_CD() + ", "
				+ getSRC_SBSCRBR_ST_CD() + ", " + getSRC_GRP_NBR() + ", "
				+ getSRC_MBR_ZIP_CD() + ", " + getINN_CD() + ", "
				+ getAPLCTN_USER_UPLD_CLM_IND_CD() + ", " + getCREAT_DTM() + " ,"
				+ getCREAT_USER_ID() + " ," + getLAST_UPDTD_DTM() + ", "
				+ getLAST_UPDTD_USER_ID() + "," + getTOTL_ALWD_AMT() + " ,"
				+ getSRC_MEDCR_ID() + ", " + getPROD_CF_CD() + ", "
				+ getDRG_VRSN_NBR() + ", " + getDRG_CD() + getLOCAL_PRVD_CD() + ", "
				+ getDRG_TYPE_CD() + ", " + getPRCG_SRC_CD() + ", "
				+ getOLD_TOTL_BILLD_AMT() + ", " + getPROFIT_CD());

	}

	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new MDLR_CLM().getClass().getDeclaredFields();
		int count = 0;
		MDLR_CLM mdlrClm = (MDLR_CLM) table;

		BasicDBObject doc = new BasicDBObject(fields[count++].getName(), mdlrClm.getMDLR_CLM_SET_ID())
				.append(fields[count++].getName(), mdlrClm.getMDLR_CLM_SUBSET_ID())
				.append(fields[count++].getName(), mdlrClm.getCLM_SQNC_ID())
				.append(fields[count++].getName(), mdlrClm.getCLM_NBR().trim())
				.append(fields[count++].getName(), mdlrClm.getTOTL_CLM_LINE_CNT())
				.append(fields[count++].getName(), mdlrClm.getCLM_SOR_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getINPAT_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getTOTL_INPAT_DAY_CNT())
				.append(fields[count++].getName(), mdlrClm.getTOTL_BILLD_AMT())
				.append(fields[count++].getName(), mdlrClm.getTOTL_CVRD_EXPNS_AMT())
				.append(fields[count++].getName(), mdlrClm.getTYPE_OF_BILL_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getSRVC_STRT_DT())
				.append(fields[count++].getName(), mdlrClm.getSRVC_END_DT())
				.append(fields[count++].getName(), mdlrClm.getCVRD_DAYS_CNT())
				.append(fields[count++].getName(), mdlrClm.getBILLD_DAYS_CNT())
				.append(fields[count++].getName(), mdlrClm.getADMT_DT())
				.append(fields[count++].getName(), mdlrClm.getSRC_DSCHRG_STTS_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getADMTG_DIAG_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getADMTG_POA_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getSRC_ATCHMNT_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getTRMA_IND_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getADMSN_HOUR_NBR())
				.append(fields[count++].getName(), mdlrClm.getDSCHRG_HOUR_NBR())
				.append(fields[count++].getName(), mdlrClm.getDSCHRG_DT())
				.append(fields[count++].getName(), mdlrClm.getCOB_IND_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getCLM_ACTN_DT())
				.append(fields[count++].getName(), mdlrClm.getICD_VRSN_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getSRC_SPCLTY_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getMBRSHP_PROD_ID().trim())
				.append(fields[count++].getName(), mdlrClm.getCLM_ITS_HOST_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getWLP_LOB_CMPNY_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getSRC_MBR_BRTH_DT())
				.append(fields[count++].getName(), mdlrClm.getSRC_MBR_GNDR_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getSRC_SBSCRBR_ST_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getSRC_GRP_NBR().trim())
				.append(fields[count++].getName(), mdlrClm.getSRC_MBR_ZIP_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getINN_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getAPLCTN_USER_UPLD_CLM_IND_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getCREAT_DTM())
				.append(fields[count++].getName(), mdlrClm.getCREAT_USER_ID().trim())
				.append(fields[count++].getName(), mdlrClm.getLAST_UPDTD_DTM())
				.append(fields[count++].getName(), mdlrClm.getLAST_UPDTD_USER_ID().trim())
				.append(fields[count++].getName(), mdlrClm.getTOTL_ALWD_AMT())
				.append(fields[count++].getName(), mdlrClm.getSRC_MEDCR_ID().trim())
				.append(fields[count++].getName(), mdlrClm.getPROD_CF_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getDRG_VRSN_NBR())
				.append(fields[count++].getName(), mdlrClm.getDRG_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getLOCAL_PRVD_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getDRG_TYPE_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getPRCG_SRC_CD().trim())
				.append(fields[count++].getName(), mdlrClm.getOLD_TOTL_BILLD_AMT())
				.append(fields[count++].getName(), mdlrClm.getPROFIT_CD().trim());

		return doc;
	}
}
