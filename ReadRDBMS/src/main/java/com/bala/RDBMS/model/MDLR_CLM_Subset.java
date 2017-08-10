package com.bala.RDBMS.model;

import java.sql.Date;

public class MDLR_CLM_Subset {

	private int MDLR_CLM_SET_ID;
	private int MDLR_CLM_SUBSET_ID;
	private int CLM_SUBSET_YEAR_NBR;
	private Double INPAT_PCTAG_NUM;
	private Double OUTPAT_PCTAG_NUM;
	private Date CREAT_DTM;
	private String CREAT_USER_ID;
	private Date LAST_UPDTD_DTM;
	private String LAST_UPDTD_USER_ID;
	private Double INPAT_INCRS_PCT;
	private Double OUTPAT_INCRS_PCT;
	private Double IMPL_INCRS_PCT;
	private Double ALL_DRG_INCRS_PCT;
	private Double HGH_CST_DRG_INCRS_PCT;
	private String DUMMYCLAIM_IND;
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
	public int getCLM_SUBSET_YEAR_NBR() {
		return CLM_SUBSET_YEAR_NBR;
	}
	public void setCLM_SUBSET_YEAR_NBR(int cLM_SUBSET_YEAR_NBR) {
		CLM_SUBSET_YEAR_NBR = cLM_SUBSET_YEAR_NBR;
	}
	public Double getINPAT_PCTAG_NUM() {
		return INPAT_PCTAG_NUM;
	}
	public void setINPAT_PCTAG_NUM(Double iNPAT_PCTAG_NUM) {
		INPAT_PCTAG_NUM = iNPAT_PCTAG_NUM;
	}
	public Double getOUTPAT_PCTAG_NUM() {
		return OUTPAT_PCTAG_NUM;
	}
	public void setOUTPAT_PCTAG_NUM(Double oUTPAT_PCTAG_NUM) {
		OUTPAT_PCTAG_NUM = oUTPAT_PCTAG_NUM;
	}
	public Date getCREAT_DTM() {
		return CREAT_DTM;
	}
	public void setCREAT_DTM(Date cREAT_DTM) {
		CREAT_DTM = cREAT_DTM;
	}
	public String getCREAT_USER_ID() {
		return CREAT_USER_ID;
	}
	public void setCREAT_USER_ID(String cREAT_USER_ID) {
		CREAT_USER_ID = cREAT_USER_ID;
	}
	public Date getLAST_UPDTD_DTM() {
		return LAST_UPDTD_DTM;
	}
	public void setLAST_UPDTD_DTM(Date lAST_UPDTD_DTM) {
		LAST_UPDTD_DTM = lAST_UPDTD_DTM;
	}
	public String getLAST_UPDTD_USER_ID() {
		return LAST_UPDTD_USER_ID;
	}
	public void setLAST_UPDTD_USER_ID(String lAST_UPDTD_USER_ID) {
		LAST_UPDTD_USER_ID = lAST_UPDTD_USER_ID;
	}
	public Double getINPAT_INCRS_PCT() {
		return INPAT_INCRS_PCT;
	}
	public void setINPAT_INCRS_PCT(Double iNPAT_INCRS_PCT) {
		INPAT_INCRS_PCT = iNPAT_INCRS_PCT;
	}
	public Double getOUTPAT_INCRS_PCT() {
		return OUTPAT_INCRS_PCT;
	}
	public void setOUTPAT_INCRS_PCT(Double oUTPAT_INCRS_PCT) {
		OUTPAT_INCRS_PCT = oUTPAT_INCRS_PCT;
	}
	public Double getIMPL_INCRS_PCT() {
		return IMPL_INCRS_PCT;
	}
	public void setIMPL_INCRS_PCT(Double iMPL_INCRS_PCT) {
		IMPL_INCRS_PCT = iMPL_INCRS_PCT;
	}
	public Double getALL_DRG_INCRS_PCT() {
		return ALL_DRG_INCRS_PCT;
	}
	public void setALL_DRG_INCRS_PCT(Double aLL_DRG_INCRS_PCT) {
		ALL_DRG_INCRS_PCT = aLL_DRG_INCRS_PCT;
	}
	public Double getHGH_CST_DRG_INCRS_PCT() {
		return HGH_CST_DRG_INCRS_PCT;
	}
	public void setHGH_CST_DRG_INCRS_PCT(Double hGH_CST_DRG_INCRS_PCT) {
		HGH_CST_DRG_INCRS_PCT = hGH_CST_DRG_INCRS_PCT;
	}
	public String getDUMMYCLAIM_IND() {
		return DUMMYCLAIM_IND;
	}
	public void setDUMMYCLAIM_IND(String dUMMYCLAIM_IND) {
		DUMMYCLAIM_IND = dUMMYCLAIM_IND;
	}
	
	public String toString() {
		return getMDLR_CLM_SUBSET_ID() +", "+getCREAT_USER_ID();
	}

}
