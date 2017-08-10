package com.bala.hibernateTest.HibernateTest;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + PostgreSQL");
		Employee[] emp = App.readFromDB();

	}
	
	public static Employee[] readFromDB() {
		Employee[] emp = null;
		
		Transaction tx = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			List<Employee> empList = null;
			
			Query query = session.createQuery("from Employee");
			query.setFirstResult(0);
			query.setMaxResults(200);
			
			empList = query.list();
			System.out.println("first size = "+empList.size());
			if(empList.size()>0) {
				System.out.println("record exists for 0 to 108");
			}
			
			query.setFirstResult(200);
			query.setMaxResults(300);
			empList = query.list();
			System.out.println("size = "+empList.size());
			if(empList.size()>0){
				System.out.println("record exists for 109 to 200");
			}
		
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emp;
	}
	
	public void writeToDB() {
		Transaction tx = null;
		Session session = null;
		try {

			session = HibernateUtil.getSessionFactory().openSession();

			
			Employee emp=null;
			for (int i = 300; i < 400; i++) {
				emp = new Employee();
				tx = session.beginTransaction();
				emp.setId(i);
				emp.setName("Vijay" + i);
				emp.setCity("coimbatore" + i);
				emp.setDept("mechanical" + i);
				emp.setSkill("CAM" + i);

				session.save(emp);
				tx.commit();

			}
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
