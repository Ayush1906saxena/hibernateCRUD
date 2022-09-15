package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class Update {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession();
		
		try(sessionFactory;session) {
			
			session.beginTransaction();
			
			//get the employee with id 1 and set the new details
			Employee employee = session.get(Employee.class, 1);
			employee.setEmpSal(17000.0);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
