package com.bala.mongo.MongoJson.controller;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bala.mongo.MongoJson.common.HibernateUtil;
import com.bala.mongo.MongoJson.model.Employee;
import com.bala.mongo.MongoJson.model.RDBMSTable;

public class RDBMSOperations {

	public void writeToRDBMS() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			System.out.println("Inside writeToRDBMS");

			tx = session.beginTransaction();
			Employee emp = new Employee();
			emp.setName("ABCD");
			emp.setId(22);
			emp.setCity("coimbatore");
			emp.setDept("mechanical");
			emp.setSkill("CAD");

			session.save(emp);

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public List<? extends RDBMSTable> readFromRDBMS(RDBMSTable table) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		List<? extends RDBMSTable> records = null;
		try {
			tx = session.beginTransaction(); 
			records = session.createQuery("FROM "+table.getClass().getSimpleName()).list();

			for (RDBMSTable tableRecord : records) {
				tableRecord = table.getClass().cast(tableRecord);
			}
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
