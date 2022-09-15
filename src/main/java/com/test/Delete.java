package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class Delete {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession();
		
		try(sessionFactory;session) {
			
			session.beginTransaction();
			
			//get the employee that you want to delete
			Employee employee = session.get(Employee.class, 4);
			session.delete(employee);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
