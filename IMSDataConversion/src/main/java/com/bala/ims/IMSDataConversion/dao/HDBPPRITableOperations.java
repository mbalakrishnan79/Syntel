package com.bala.ims.IMSDataConversion.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bala.ims.IMSDataConversion.common.IMSUtil;
import com.bala.ims.IMSDataConversion.dao.common.HibernateUtil;
import com.bala.ims.IMSDataConversion.dao.model.HDBPPRIDao;
import com.bala.ims.IMSDataConversion.model.HDBPPRIData;

public class HDBPPRITableOperations {

	public HDBPPRIData[] fetchFromUDB(String HCPCSCode, String pricngPrdtCde, int effDte) {
		HDBPPRIData[] data = null;
		HDBPPRIDao[] rawData = fetchRawIMSDataFromUDB(HCPCSCode, pricngPrdtCde, effDte);
		
		data = new HDBPPRIData[rawData.length];
		
		int i=0;
		for(HDBPPRIDao rawRecord: rawData) {
			data[i] = generateHDBPPRIData(rawRecord);
			++i;
		}
		return data;
	}
	
	public HDBPPRIData[] fetchFromMongoDB(String HCPCSCode) {
		HDBPPRIData[] data = null;
		
		return data;
	}
	
	public HDBPPRIData[] fetchFromHDFS(String HCPCSCode) {
		HDBPPRIData[] data = null;
		
		return data;
	}
	
	public HDBPPRIData[] fetchFromExadata(String HCPCSCode) {
		HDBPPRIData[] data = null;
		
		return data;
	}
	
	private HDBPPRIDao[] fetchRawIMSDataFromUDB(String HCPCSCode, String pricngPrdtCde, int effDte) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		List<HDBPPRIDao> records = null;
		HDBPPRIDao[] data = null;
		try {
			tx = session.beginTransaction(); 
			Query query = session.createQuery("FROM HDBPPRI WHERE HDBPRHC_HCPCS_CDE = :HCPCSCode AND"
												+ "HDBPPRI_PRICNG_PRDT_CDE = :pricngPrdtCde AND" 
												+ "HDBPPRI_EFF_DTE = :effDte");
			query.setParameter("HCPCSCode", HCPCSCode);
			query.setParameter("pricngPrdtCde", pricngPrdtCde);
			query.setParameter("effDte", effDte);
			
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
	
	private HDBPPRIData generateHDBPPRIData(HDBPPRIDao rawRecord) {
		HDBPPRIData data = new HDBPPRIData();
		
		data.setHDBPPRI_ANES_UNIT_VAL(rawRecord.getHDBPPRI_ANES_UNIT_VAL());
		data.setHDBPPRI_EFF_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPPRI_EFF_DTE())));
		data.setHDBPPRI_END_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPPRI_END_DTE())));
		data.setHDBPPRI_FAC_UNIT_VAL(rawRecord.getHDBPPRI_FAC_UNIT_VAL());
		data.setHDBPPRI_FAMILY_GRP(rawRecord.getHDBPPRI_FAMILY_GRP());
		data.setHDBPPRI_LAST_UPDT_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPPRI_LAST_UPDT_DTE())));
		data.setHDBPPRI_LAST_USERID(rawRecord.getHDBPPRI_LAST_USERID());
		data.setHDBPPRI_PAY_TYPE_IND(rawRecord.getHDBPPRI_PAY_TYPE_IND());
		data.setHDBPPRI_PCU(rawRecord.getHDBPPRI_PCU());
		data.setHDBPPRI_PRICNG_PRDT_CDE(rawRecord.getHDBPPRI_PRICNG_PRDT_CDE());
		data.setHDBPPRI_SVC_UNIT_VAL(rawRecord.getHDBPPRI_SVC_UNIT_VAL());
		data.setHDBPPRI_TCU(rawRecord.getHDBPPRI_TCU());
		data.setHDBPPRI_UNIT_VAL(rawRecord.getHDBPPRI_UNIT_VAL());
		
		return data;
	}

}
