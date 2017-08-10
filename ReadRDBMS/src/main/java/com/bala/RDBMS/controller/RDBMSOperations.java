package com.bala.RDBMS.controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bala.RDBMS.common.HibernateUtil;
import com.bala.RDBMS.model.MDLR_CLM_Subset;

public class RDBMSOperations {

	@SuppressWarnings("unchecked")
	public List<MDLR_CLM_Subset> readFromRDBMS(MDLR_CLM_Subset table, int setId, int subSetId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		List<MDLR_CLM_Subset> records = null;
		try {
			tx = session.beginTransaction(); 
			Query query = session.createQuery("FROM "+table.getClass().getSimpleName()
							+"WHERE MDLR_CLM_SET_ID = :setId AND MDLR_CLM_SUBSET_ID = :subSetId");
			query.setParameter("setId", setId);
			query.setParameter("subSetId", subSetId);
			
			records = query.list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return records;
		
	}
}
