package com.bala.ims.IMSDataConversion.model;

import java.util.Arrays;
import java.util.Date;


public class HDBRCODData {

	private Date HDBRCOD_COMP_CNCL_DTE;
	private int HDBRCOD_SEQ_NBR;
	private HDBRCODCodeGroup[] HDBRCOD_CDE_GRP;   //Array size 30. 
	private String HDBRCOD_LAST_USERID;
	private Date HDBRCOD_LAST_UPDT_DTE;
	
	public HDBRCODData() {
		HDBRCOD_CDE_GRP = new HDBRCODCodeGroup[30];
	}
	
	public Date getHDBRCOD_COMP_CNCL_DTE() {
		return HDBRCOD_COMP_CNCL_DTE;
	}
	public void setHDBRCOD_COMP_CNCL_DTE(Date hDBRCOD_COMP_CNCL_DTE) {
		HDBRCOD_COMP_CNCL_DTE = hDBRCOD_COMP_CNCL_DTE;
	}
	public int getHDBRCOD_SEQ_NBR() {
		return HDBRCOD_SEQ_NBR;
	}
	public void setHDBRCOD_SEQ_NBR(int hDBRCOD_SEQ_NBR) {
		HDBRCOD_SEQ_NBR = hDBRCOD_SEQ_NBR;
	}
	public HDBRCODCodeGroup[] getHDBRCOD_CDE_GRP() {
		return HDBRCOD_CDE_GRP;
	}
	public void setHDBRCOD_CDE_GRP(HDBRCODCodeGroup[] hDBRCOD_CDE_GRP) {
		HDBRCOD_CDE_GRP = hDBRCOD_CDE_GRP;
	}
	public String getHDBRCOD_LAST_USERID() {
		return HDBRCOD_LAST_USERID;
	}
	public void setHDBRCOD_LAST_USERID(String hDBRCOD_LAST_USERID) {
		HDBRCOD_LAST_USERID = hDBRCOD_LAST_USERID;
	}
	public Date getHDBRCOD_LAST_UPDT_DTE() {
		return HDBRCOD_LAST_UPDT_DTE;
	}
	public void setHDBRCOD_LAST_UPDT_DTE(Date hDBRCOD_LAST_UPDT_DTE) {
		HDBRCOD_LAST_UPDT_DTE = hDBRCOD_LAST_UPDT_DTE;
	}
	@Override
	public String toString() {
		return "HDBRCODData [HDBRCOD_COMP_CNCL_DTE=" + HDBRCOD_COMP_CNCL_DTE
				+ ", HDBRCOD_SEQ_NBR=" + HDBRCOD_SEQ_NBR + ", HDBRCOD_CDE_GRP="
				+ Arrays.toString(HDBRCOD_CDE_GRP) + ", HDBRCOD_LAST_USERID="
				+ HDBRCOD_LAST_USERID + ", HDBRCOD_LAST_UPDT_DTE="
				+ HDBRCOD_LAST_UPDT_DTE + "]";
	}
	
	
}
