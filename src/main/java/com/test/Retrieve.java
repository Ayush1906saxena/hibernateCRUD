package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class Retrieve {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession();
		
		try(sessionFactory;session) {
			
			Employee employee = session.get(Employee.class, 1);
			System.out.println("Employee with id=1 is : "+employee.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
