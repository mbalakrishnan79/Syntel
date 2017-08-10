package com.bala.ims.IMSDataConversion.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bala.ims.IMSDataConversion.common.IMSUtil;
import com.bala.ims.IMSDataConversion.dao.common.HibernateUtil;
import com.bala.ims.IMSDataConversion.dao.model.HDBPRHCDao;
import com.bala.ims.IMSDataConversion.model.HDBPRHCData;

public class HDBPRHCTableOperations {
	
	public HDBPRHCData[] fetchFromUDB(String HCPCSCode) {
		HDBPRHCData[] data = null;
		HDBPRHCDao[] rawData = fetchRawIMSDataFromUDB(HCPCSCode);
		
		data = new HDBPRHCData[rawData.length];
		
		int i=0;
		for(HDBPRHCDao rawRecord: rawData) {
			data[i] = generateHDBPRHCData(rawRecord);
			++i;
		}
		return data;
	}
	
	public HDBPRHCData[] fetchFromMongoDB(String HCPCSCode) {
		HDBPRHCData[] data = null;
		
		return data;
	}
	
	public HDBPRHCData[] fetchFromHDFS(String HCPCSCode) {
		HDBPRHCData[] data = null;
		
		return data;
	}
	
	public HDBPRHCData[] fetchFromExadata(String HCPCSCode) {
		HDBPRHCData[] data = null;
		
		return data;
	}
	
	private HDBPRHCDao[] fetchRawIMSDataFromUDB(String HCPCSCode) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		List<HDBPRHCDao> records = null;
		HDBPRHCDao[] data = null;
		try {
			tx = session.beginTransaction(); 
			Query query = session.createQuery("FROM HDBPRHC WHERE HDBPRHC_HCPCS_CDE = :HCPCSCode");
			query.setParameter("HCPCSCode", HCPCSCode);
			
			records = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return records.toArray(data);
	}
	
	private HDBPRHCData generateHDBPRHCData(HDBPRHCDao rawRecord) {
		HDBPRHCData data = new HDBPRHCData();
		
		data.setHDBPRHC_HCPCS_CDE(rawRecord.getHDBPRHC_HCPCS_CDE());
		data.setHDBPRHC_100_IND(rawRecord.getHDBPRHC_100_IND());
		data.setHDBPRHC_64_BA_UNITS(rawRecord.getHDBPRHC_64_BA_UNITS());
		data.setHDBPRHC_64_UNITS(rawRecord.getHDBPRHC_64_UNITS());
		data.setHDBPRHC_AGE_FROM(rawRecord.getHDBPRHC_AGE_FROM());
		data.setHDBPRHC_AGE_THRU(rawRecord.getHDBPRHC_AGE_THRU());
		data.setHDBPRHC_AIM_HMO_IND(rawRecord.getHDBPRHC_AIM_HMO_IND());
		data.setHDBPRHC_AMBULANCE_IND(rawRecord.getHDBPRHC_AMBULANCE_IND());
		data.setHDBPRHC_ANES_ALLOW_CDE(rawRecord.getHDBPRHC_ANES_ALLOW_CDE());
		data.setHDBPRHC_AS_IS_IND(rawRecord.getHDBPRHC_AS_IS_IND());
		data.setHDBPRHC_ASIS_EFF_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPRHC_ASIS_EFF_DTE())));
		data.setHDBPRHC_ASIS_EFF_DTE_X(rawRecord.getHDBPRHC_ASIS_EFF_DTE_X());
		data.setHDBPRHC_ASIS_END_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPRHC_ASIS_END_DTE())));
		data.setHDBPRHC_ASIS_END_DTE_X(rawRecord.getHDBPRHC_ASIS_END_DTE_X());
		data.setHDBPRHC_ASSIST_SRG_ALLOW_CDE(rawRecord.getHDBPRHC_ASSIST_SRG_ALLOW_CDE());
		data.setHDBPRHC_BLOCK_CDE(rawRecord.getHDBPRHC_BLOCK_CDE());
		data.setHDBPRHC_COPAY_IND(rawRecord.getHDBPRHC_COPAY_IND());
		data.setHDBPRHC_COSURG_IND(rawRecord.getHDBPRHC_COSURG_IND());
		data.setHDBPRHC_DESC_LONG(rawRecord.getHDBPRHC_DESC_LONG());
		data.setHDBPRHC_DESC_SHORT(rawRecord.getHDBPRHC_DESC_SHORT());
		data.setHDBPRHC_DESC_SOUNDEX(rawRecord.getHDBPRHC_DESC_SOUNDEX());
		data.setHDBPRHC_EFF_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPRHC_EFF_DTE())));
		data.setHDBPRHC_END_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPRHC_END_DTE())));
		data.setHDBPRHC_FOL_DAYS(rawRecord.getHDBPRHC_FOL_DAYS());
		data.setHDBPRHC_GMC_REF_IND(rawRecord.getHDBPRHC_GMC_REF_IND());
		data.setHDBPRHC_HEALTHY_FAM(rawRecord.getHDBPRHC_HEALTHY_FAM());
		data.setHDBPRHC_HMG_MED_IND(rawRecord.getHDBPRHC_HMG_MED_IND());
		data.setHDBPRHC_INCDNTL_IND(rawRecord.getHDBPRHC_INCDNTL_IND());
		data.setHDBPRHC_LAST_UPDT_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPRHC_LAST_UPDT_DTE())));
		data.setHDBPRHC_LAST_USERID(rawRecord.getHDBPRHC_LAST_USERID());
		data.setHDBPRHC_LINE_LVL_LIM(rawRecord.getHDBPRHC_LINE_LVL_LIM());
		data.setHDBPRHC_LINE_LVL_LIMIT(rawRecord.getHDBPRHC_LINE_LVL_LIMIT());
		data.setHDBPRHC_PLC_TRTMT_CDES(rawRecord.getHDBPRHC_PLC_TRTMT_CDES());
		data.setHDBPRHC_POS_EXC_INC_IND(rawRecord.getHDBPRHC_POS_EXC_INC_IND());
		data.setHDBPRHC_RENTAL_IND(rawRecord.getHDBPRHC_RENTAL_IND());
		data.setHDBPRHC_SEX_CDE(rawRecord.getHDBPRHC_SEX_CDE());
		data.setHDBPRHC_SSPND_DENY_IND(rawRecord.getHDBPRHC_SSPND_DENY_IND());
		data.setHDBPRHC_TOT_EXC_INC_IND(rawRecord.getHDBPRHC_TOT_EXC_INC_IND());
		data.setHDBPRHC_UM_APRVL_IND(rawRecord.getHDBPRHC_UM_APRVL_IND());
		data.setHDBPRHC_PLC_TRTMT_CDE(rawRecord.getHDBPRHC_PLC_TRTMT_CDE().toCharArray());
		
		char[] subField = rawRecord.getHDBPRHC_PRC_CLS_CDE().toCharArray();
		String[] prcClsCde = new String[2];
		
		int count = 0;
		for(int i=0; i<2; i++) {
			prcClsCde[i] = new StringBuilder().append(subField[count++]).append(subField[count++])
								.append(subField[count++]).toString().trim();
		}
		data.setHDBPRHC_PRC_CLS_CDE(prcClsCde);
				
		subField = rawRecord.getHDBPRHC_SVC_CLS_CDE().toCharArray();
		String[] svcClsCde = new String[3];
		count = 0;
		for(int i=0; i<3; i++) {
			svcClsCde[i] = new StringBuilder().append(subField[count++]).append(subField[count++])
					.append(subField[count++]).toString().trim();
		}
		data.setHDBPRHC_SVC_CLS_CDE(svcClsCde);
		
		subField = rawRecord.getHDBPRHC_TYPE_TRTMT_CDE().toCharArray();
		String[] typeTrtmtCde = new String[6];
		count = 0;
		for(int i=0; i<6; i++) {
			typeTrtmtCde[i] = new StringBuilder().append(subField[count++]).append(subField[count++]).toString().trim();
		}
		data.setHDBPRHC_TYPE_TRTMT_CDE(typeTrtmtCde);
		
		return data;
	}
}
