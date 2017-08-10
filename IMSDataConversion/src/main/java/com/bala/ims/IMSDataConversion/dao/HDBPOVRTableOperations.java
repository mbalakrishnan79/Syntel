package com.bala.ims.IMSDataConversion.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bala.ims.IMSDataConversion.common.IMSUtil;
import com.bala.ims.IMSDataConversion.dao.common.HibernateUtil;
import com.bala.ims.IMSDataConversion.dao.model.HDBPOVRDao;
import com.bala.ims.IMSDataConversion.model.HDBPOVRData;

public class HDBPOVRTableOperations {

	public HDBPOVRData[] fetchFromUDB(String HCPCSCode, String pricngPrdtCde, String prdtVarn,
										String rgnCde, int effDte) {
		HDBPOVRData[] data = null;
		HDBPOVRDao[] rawData = fetchRawIMSDataFromUDB(HCPCSCode, pricngPrdtCde, prdtVarn, rgnCde, effDte);
		
		data = new HDBPOVRData[rawData.length];
		
		int i=0;
		for(HDBPOVRDao rawRecord: rawData) {
			data[i] = generateHDBPOVRData(rawRecord);
			++i;
		}
		return data;
	}
	
	public HDBPOVRData[] fetchFromMongoDB(String HCPCSCode) {
		HDBPOVRData[] data = null;
		
		return data;
	}
	
	public HDBPOVRData[] fetchFromHDFS(String HCPCSCode) {
		HDBPOVRData[] data = null;
		
		return data;
	}
	
	public HDBPOVRData[] fetchFromExadata(String HCPCSCode) {
		HDBPOVRData[] data = null;
		
		return data;
	}
	
	private HDBPOVRDao[] fetchRawIMSDataFromUDB(String HCPCSCode, String pricngPrdtCde, String prdtVarn, 
												String rgnCde, int effDte) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		List<HDBPOVRDao> records = null;
		HDBPOVRDao[] data = null;
		try {
			tx = session.beginTransaction(); 
			Query query = session.createQuery("FROM HDBPOVR WHERE HDBPRHC_HCPCS_CDE = :HCPCSCode AND"
												+ "HDBPPRI_PRICNG_PRDT_CDE = :pricngPrdtCde AND"
												+ "HDBPOVR_PRDT_VARN = :prdtVarn AND"
												+ "HDBPOVR_RGN_CDE = :rgnCde AND" 
												+ "HDBPPRI_EFF_DTE = :effDte");
			query.setParameter("HCPCSCode", HCPCSCode);
			query.setParameter("pricngPrdtCde", pricngPrdtCde);
			query.setParameter("prdtVarn", prdtVarn);
			query.setParameter("rgnCde", rgnCde);
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
	
	private HDBPOVRData generateHDBPOVRData(HDBPOVRDao rawRecord) {
		HDBPOVRData data = new HDBPOVRData();

		data.setHDBPOVR_CNCL_RSN_CDE(rawRecord.getHDBPOVR_CNCL_RSN_CDE());
		data.setHDBPOVR_EFF_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPOVR_EFF_DTE())));
		data.setHDBPOVR_END_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPOVR_END_DTE())));
		data.setHDBPOVR_LAST_UPDT_DTE(IMSUtil.parseDate(Integer.toString(rawRecord.getHDBPOVR_LAST_UPDT_DTE())));
		data.setHDBPOVR_LAST_USERID(rawRecord.getHDBPOVR_LAST_USERID());
		data.setHDBPOVR_OVRIDE_PRC(rawRecord.getHDBPOVR_OVRIDE_PRC());
		data.setHDBPOVR_OVRIDE_PRC_ANES(rawRecord.getHDBPOVR_OVRIDE_PRC_ANES());
		data.setHDBPOVR_OVRIDE_RSN_CDE(rawRecord.getHDBPOVR_OVRIDE_RSN_CDE());
		data.setHDBPOVR_OVRIDE_RSN_TXT(rawRecord.getHDBPOVR_OVRIDE_RSN_TXT());
		data.setHDBPOVR_PRDT_VARN(rawRecord.getHDBPOVR_PRDT_VARN());
		data.setHDBPOVR_RGN_CDE(rawRecord.getHDBPOVR_RGN_CDE());
		
		return data;
	}

}
