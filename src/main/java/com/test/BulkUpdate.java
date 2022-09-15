package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class BulkUpdate {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession();
		
		try(sessionFactory;session) {
			
			session.beginTransaction();
			
			session.createQuery("UPDATE Employee SET empSal=empSal+1000").executeUpdate();
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
