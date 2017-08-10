package com.bala.ims.IMSDataConversion.dao.model;

import java.util.Date;

public class HDBPRHCDao {
	private String HDBPRHC_HCPCS_CDE;
	private String filler;
	private String HDBPRHC_DESC_LONG; //Filler is present above. So, skip one more level
	private String HDBPRHC_DESC_SHORT;
	private String HDBPRHC_DESC_SOUNDEX;
	private int HDBPRHC_FOL_DAYS;
	private String HDBPRHC_SVC_CLS_CDE; //Array size of 3
	private String HDBPRHC_PRC_CLS_CDE; //Array size of 2
	private String HDBPRHC_TYPE_TRTMT_CDE; //Array size of 6
	private String HDBPRHC_PLC_TRTMT_CDES;
	private String HDBPRHC_PLC_TRTMT_CDE; //Array of size 7
	private int HDBPRHC_AGE_FROM;
	private int HDBPRHC_AGE_THRU;
	private char HDBPRHC_SEX_CDE;
	private String filler1;
	private Double HDBPRHC_64_UNITS; //Filler is next to HDBPRHC_SEX_CDE. So, skip one more level
	private Double HDBPRHC_64_BA_UNITS;
	private char HDBPRHC_INCDNTL_IND;
	private char HDBPRHC_SSPND_DENY_IND;
	private char HDBPRHC_BLOCK_CDE;
	private char HDBPRHC_ANES_ALLOW_CDE;
	private char HDBPRHC_ASSIST_SRG_ALLOW_CDE;
	private int HDBPRHC_EFF_DTE;
	private int HDBPRHC_END_DTE;
	private int HDBPRHC_LAST_UPDT_DTE;
	private String HDBPRHC_LAST_USERID;
	private char HDBPRHC_UM_APRVL_IND;
	private char HDBPRHC_GMC_REF_IND;
	private int HDBPRHC_ASIS_EFF_DTE;
	private String HDBPRHC_ASIS_EFF_DTE_X;
	private int HDBPRHC_ASIS_END_DTE;
	private String HDBPRHC_ASIS_END_DTE_X;
	private char HDBPRHC_COSURG_IND;
	private char HDBPRHC_RENTAL_IND;
	private char HDBPRHC_COPAY_IND;
	private char HDBPRHC_100_IND;
	private char HDBPRHC_AMBULANCE_IND;
	private String HDBPRHC_LINE_LVL_LIM;
	private int HDBPRHC_LINE_LVL_LIMIT;
	private char HDBPRHC_AS_IS_IND; //Filler is in between. So, here skip one more level from HDBPRHC_LINE_LVL_LIMIT
	private char HDBPRHC_HEALTHY_FAM;
	private char HDBPRHC_POS_EXC_INC_IND;
	private char HDBPRHC_TOT_EXC_INC_IND;
	private char HDBPRHC_AIM_HMO_IND;
	private char HDBPRHC_HMG_MED_IND;
	
	public String getHDBPRHC_HCPCS_CDE() {
		return HDBPRHC_HCPCS_CDE;
	}
	public void setHDBPRHC_HCPCS_CDE(String hDBPRHC_HCPCS_CDE) {
		HDBPRHC_HCPCS_CDE = hDBPRHC_HCPCS_CDE;
	}
	public String getFiller() {
		return filler;
	}
	public void setFiller(String filler) {
		this.filler = filler;
	}
	public String getHDBPRHC_DESC_LONG() {
		return HDBPRHC_DESC_LONG;
	}
	public void setHDBPRHC_DESC_LONG(String hDBPRHC_DESC_LONG) {
		HDBPRHC_DESC_LONG = hDBPRHC_DESC_LONG;
	}
	public String getHDBPRHC_DESC_SHORT() {
		return HDBPRHC_DESC_SHORT;
	}
	public void setHDBPRHC_DESC_SHORT(String hDBPRHC_DESC_SHORT) {
		HDBPRHC_DESC_SHORT = hDBPRHC_DESC_SHORT;
	}
	public String getHDBPRHC_DESC_SOUNDEX() {
		return HDBPRHC_DESC_SOUNDEX;
	}
	public void setHDBPRHC_DESC_SOUNDEX(String hDBPRHC_DESC_SOUNDEX) {
		HDBPRHC_DESC_SOUNDEX = hDBPRHC_DESC_SOUNDEX;
	}
	public int getHDBPRHC_FOL_DAYS() {
		return HDBPRHC_FOL_DAYS;
	}
	public void setHDBPRHC_FOL_DAYS(int hDBPRHC_FOL_DAYS) {
		HDBPRHC_FOL_DAYS = hDBPRHC_FOL_DAYS;
	}
	public String getHDBPRHC_SVC_CLS_CDE() {
		return HDBPRHC_SVC_CLS_CDE;
	}
	public void setHDBPRHC_SVC_CLS_CDE(String hDBPRHC_SVC_CLS_CDE) {
		HDBPRHC_SVC_CLS_CDE = hDBPRHC_SVC_CLS_CDE;
	}
	public String getHDBPRHC_PRC_CLS_CDE() {
		return HDBPRHC_PRC_CLS_CDE;
	}
	public void setHDBPRHC_PRC_CLS_CDE(String hDBPRHC_PRC_CLS_CDE) {
		HDBPRHC_PRC_CLS_CDE = hDBPRHC_PRC_CLS_CDE;
	}
	public String getHDBPRHC_TYPE_TRTMT_CDE() {
		return HDBPRHC_TYPE_TRTMT_CDE;
	}
	public void setHDBPRHC_TYPE_TRTMT_CDE(String hDBPRHC_TYPE_TRTMT_CDE) {
		HDBPRHC_TYPE_TRTMT_CDE = hDBPRHC_TYPE_TRTMT_CDE;
	}
	public String getHDBPRHC_PLC_TRTMT_CDES() {
		return HDBPRHC_PLC_TRTMT_CDES;
	}
	public void setHDBPRHC_PLC_TRTMT_CDES(String hDBPRHC_PLC_TRTMT_CDES) {
		HDBPRHC_PLC_TRTMT_CDES = hDBPRHC_PLC_TRTMT_CDES;
	}
	public String getHDBPRHC_PLC_TRTMT_CDE() {
		return HDBPRHC_PLC_TRTMT_CDE;
	}
	public void setHDBPRHC_PLC_TRTMT_CDE(String hDBPRHC_PLC_TRTMT_CDE) {
		HDBPRHC_PLC_TRTMT_CDE = hDBPRHC_PLC_TRTMT_CDE;
	}
	public int getHDBPRHC_AGE_FROM() {
		return HDBPRHC_AGE_FROM;
	}
	public void setHDBPRHC_AGE_FROM(int hDBPRHC_AGE_FROM) {
		HDBPRHC_AGE_FROM = hDBPRHC_AGE_FROM;
	}
	public int getHDBPRHC_AGE_THRU() {
		return HDBPRHC_AGE_THRU;
	}
	public void setHDBPRHC_AGE_THRU(int hDBPRHC_AGE_THRU) {
		HDBPRHC_AGE_THRU = hDBPRHC_AGE_THRU;
	}
	public char getHDBPRHC_SEX_CDE() {
		return HDBPRHC_SEX_CDE;
	}
	public void setHDBPRHC_SEX_CDE(char hDBPRHC_SEX_CDE) {
		HDBPRHC_SEX_CDE = hDBPRHC_SEX_CDE;
	}
	public String getFiller1() {
		return filler1;
	}
	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}
	public Double getHDBPRHC_64_UNITS() {
		return HDBPRHC_64_UNITS;
	}
	public void setHDBPRHC_64_UNITS(Double hDBPRHC_64_UNITS) {
		HDBPRHC_64_UNITS = hDBPRHC_64_UNITS;
	}
	public Double getHDBPRHC_64_BA_UNITS() {
		return HDBPRHC_64_BA_UNITS;
	}
	public void setHDBPRHC_64_BA_UNITS(Double hDBPRHC_64_BA_UNITS) {
		HDBPRHC_64_BA_UNITS = hDBPRHC_64_BA_UNITS;
	}
	public char getHDBPRHC_INCDNTL_IND() {
		return HDBPRHC_INCDNTL_IND;
	}
	public void setHDBPRHC_INCDNTL_IND(char hDBPRHC_INCDNTL_IND) {
		HDBPRHC_INCDNTL_IND = hDBPRHC_INCDNTL_IND;
	}
	public char getHDBPRHC_SSPND_DENY_IND() {
		return HDBPRHC_SSPND_DENY_IND;
	}
	public void setHDBPRHC_SSPND_DENY_IND(char hDBPRHC_SSPND_DENY_IND) {
		HDBPRHC_SSPND_DENY_IND = hDBPRHC_SSPND_DENY_IND;
	}
	public char getHDBPRHC_BLOCK_CDE() {
		return HDBPRHC_BLOCK_CDE;
	}
	public void setHDBPRHC_BLOCK_CDE(char hDBPRHC_BLOCK_CDE) {
		HDBPRHC_BLOCK_CDE = hDBPRHC_BLOCK_CDE;
	}
	public char getHDBPRHC_ANES_ALLOW_CDE() {
		return HDBPRHC_ANES_ALLOW_CDE;
	}
	public void setHDBPRHC_ANES_ALLOW_CDE(char hDBPRHC_ANES_ALLOW_CDE) {
		HDBPRHC_ANES_ALLOW_CDE = hDBPRHC_ANES_ALLOW_CDE;
	}
	public char getHDBPRHC_ASSIST_SRG_ALLOW_CDE() {
		return HDBPRHC_ASSIST_SRG_ALLOW_CDE;
	}
	public void setHDBPRHC_ASSIST_SRG_ALLOW_CDE(char hDBPRHC_ASSIST_SRG_ALLOW_CDE) {
		HDBPRHC_ASSIST_SRG_ALLOW_CDE = hDBPRHC_ASSIST_SRG_ALLOW_CDE;
	}
	public int getHDBPRHC_EFF_DTE() {
		return HDBPRHC_EFF_DTE;
	}
	public void setHDBPRHC_EFF_DTE(int hDBPRHC_EFF_DTE) {
		HDBPRHC_EFF_DTE = hDBPRHC_EFF_DTE;
	}
	public int getHDBPRHC_END_DTE() {
		return HDBPRHC_END_DTE;
	}
	public void setHDBPRHC_END_DTE(int hDBPRHC_END_DTE) {
		HDBPRHC_END_DTE = hDBPRHC_END_DTE;
	}
	public int getHDBPRHC_LAST_UPDT_DTE() {
		return HDBPRHC_LAST_UPDT_DTE;
	}
	public void setHDBPRHC_LAST_UPDT_DTE(int hDBPRHC_LAST_UPDT_DTE) {
		HDBPRHC_LAST_UPDT_DTE = hDBPRHC_LAST_UPDT_DTE;
	}
	public String getHDBPRHC_LAST_USERID() {
		return HDBPRHC_LAST_USERID;
	}
	public void setHDBPRHC_LAST_USERID(String hDBPRHC_LAST_USERID) {
		HDBPRHC_LAST_USERID = hDBPRHC_LAST_USERID;
	}
	public char getHDBPRHC_UM_APRVL_IND() {
		return HDBPRHC_UM_APRVL_IND;
	}
	public void setHDBPRHC_UM_APRVL_IND(char hDBPRHC_UM_APRVL_IND) {
		HDBPRHC_UM_APRVL_IND = hDBPRHC_UM_APRVL_IND;
	}
	public char getHDBPRHC_GMC_REF_IND() {
		return HDBPRHC_GMC_REF_IND;
	}
	public void setHDBPRHC_GMC_REF_IND(char hDBPRHC_GMC_REF_IND) {
		HDBPRHC_GMC_REF_IND = hDBPRHC_GMC_REF_IND;
	}
	public int getHDBPRHC_ASIS_EFF_DTE() {
		return HDBPRHC_ASIS_EFF_DTE;
	}
	public void setHDBPRHC_ASIS_EFF_DTE(int hDBPRHC_ASIS_EFF_DTE) {
		HDBPRHC_ASIS_EFF_DTE = hDBPRHC_ASIS_EFF_DTE;
	}
	public String getHDBPRHC_ASIS_EFF_DTE_X() {
		return HDBPRHC_ASIS_EFF_DTE_X;
	}
	public void setHDBPRHC_ASIS_EFF_DTE_X(String hDBPRHC_ASIS_EFF_DTE_X) {
		HDBPRHC_ASIS_EFF_DTE_X = hDBPRHC_ASIS_EFF_DTE_X;
	}
	public int getHDBPRHC_ASIS_END_DTE() {
		return HDBPRHC_ASIS_END_DTE;
	}
	public void setHDBPRHC_ASIS_END_DTE(int hDBPRHC_ASIS_END_DTE) {
		HDBPRHC_ASIS_END_DTE = hDBPRHC_ASIS_END_DTE;
	}
	public String getHDBPRHC_ASIS_END_DTE_X() {
		return HDBPRHC_ASIS_END_DTE_X;
	}
	public void setHDBPRHC_ASIS_END_DTE_X(String hDBPRHC_ASIS_END_DTE_X) {
		HDBPRHC_ASIS_END_DTE_X = hDBPRHC_ASIS_END_DTE_X;
	}
	public char getHDBPRHC_COSURG_IND() {
		return HDBPRHC_COSURG_IND;
	}
	public void setHDBPRHC_COSURG_IND(char hDBPRHC_COSURG_IND) {
		HDBPRHC_COSURG_IND = hDBPRHC_COSURG_IND;
	}
	public char getHDBPRHC_RENTAL_IND() {
		return HDBPRHC_RENTAL_IND;
	}
	public void setHDBPRHC_RENTAL_IND(char hDBPRHC_RENTAL_IND) {
		HDBPRHC_RENTAL_IND = hDBPRHC_RENTAL_IND;
	}
	public char getHDBPRHC_COPAY_IND() {
		return HDBPRHC_COPAY_IND;
	}
	public void setHDBPRHC_COPAY_IND(char hDBPRHC_COPAY_IND) {
		HDBPRHC_COPAY_IND = hDBPRHC_COPAY_IND;
	}
	public char getHDBPRHC_100_IND() {
		return HDBPRHC_100_IND;
	}
	public void setHDBPRHC_100_IND(char hDBPRHC_100_IND) {
		HDBPRHC_100_IND = hDBPRHC_100_IND;
	}
	public char getHDBPRHC_AMBULANCE_IND() {
		return HDBPRHC_AMBULANCE_IND;
	}
	public void setHDBPRHC_AMBULANCE_IND(char hDBPRHC_AMBULANCE_IND) {
		HDBPRHC_AMBULANCE_IND = hDBPRHC_AMBULANCE_IND;
	}
	public String getHDBPRHC_LINE_LVL_LIM() {
		return HDBPRHC_LINE_LVL_LIM;
	}
	public void setHDBPRHC_LINE_LVL_LIM(String hDBPRHC_LINE_LVL_LIM) {
		HDBPRHC_LINE_LVL_LIM = hDBPRHC_LINE_LVL_LIM;
	}
	public int getHDBPRHC_LINE_LVL_LIMIT() {
		return HDBPRHC_LINE_LVL_LIMIT;
	}
	public void setHDBPRHC_LINE_LVL_LIMIT(int hDBPRHC_LINE_LVL_LIMIT) {
		HDBPRHC_LINE_LVL_LIMIT = hDBPRHC_LINE_LVL_LIMIT;
	}
	public char getHDBPRHC_AS_IS_IND() {
		return HDBPRHC_AS_IS_IND;
	}
	public void setHDBPRHC_AS_IS_IND(char hDBPRHC_AS_IS_IND) {
		HDBPRHC_AS_IS_IND = hDBPRHC_AS_IS_IND;
	}
	public char getHDBPRHC_HEALTHY_FAM() {
		return HDBPRHC_HEALTHY_FAM;
	}
	public void setHDBPRHC_HEALTHY_FAM(char hDBPRHC_HEALTHY_FAM) {
		HDBPRHC_HEALTHY_FAM = hDBPRHC_HEALTHY_FAM;
	}
	public char getHDBPRHC_POS_EXC_INC_IND() {
		return HDBPRHC_POS_EXC_INC_IND;
	}
	public void setHDBPRHC_POS_EXC_INC_IND(char hDBPRHC_POS_EXC_INC_IND) {
		HDBPRHC_POS_EXC_INC_IND = hDBPRHC_POS_EXC_INC_IND;
	}
	public char getHDBPRHC_TOT_EXC_INC_IND() {
		return HDBPRHC_TOT_EXC_INC_IND;
	}
	public void setHDBPRHC_TOT_EXC_INC_IND(char hDBPRHC_TOT_EXC_INC_IND) {
		HDBPRHC_TOT_EXC_INC_IND = hDBPRHC_TOT_EXC_INC_IND;
	}
	public char getHDBPRHC_AIM_HMO_IND() {
		return HDBPRHC_AIM_HMO_IND;
	}
	public void setHDBPRHC_AIM_HMO_IND(char hDBPRHC_AIM_HMO_IND) {
		HDBPRHC_AIM_HMO_IND = hDBPRHC_AIM_HMO_IND;
	}
	public char getHDBPRHC_HMG_MED_IND() {
		return HDBPRHC_HMG_MED_IND;
	}
	public void setHDBPRHC_HMG_MED_IND(char hDBPRHC_HMG_MED_IND) {
		HDBPRHC_HMG_MED_IND = hDBPRHC_HMG_MED_IND;
	}
	
}
