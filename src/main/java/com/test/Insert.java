package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class Insert {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession();
		
		try(sessionFactory;session) {
			
			session.beginTransaction();
			
			Employee employee1 = new Employee("Ayush", "DEV", 15000.0);
			Employee employee2 = new Employee("Anish", "DEV", 5000.0);
			Employee employee3 = new Employee("Hritam", "DEV", 5000.0);
			Employee employee4 = new Employee("Ishita", "DEV", 5000.0);
			
			session.save(employee1);
			session.save(employee2);
			session.save(employee3);
			session.save(employee4);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
