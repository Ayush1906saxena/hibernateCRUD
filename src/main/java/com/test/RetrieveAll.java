package com.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.utility.HibernateUtil;

public class RetrieveAll {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession();
		
		try(sessionFactory;session) {
			
			@SuppressWarnings("unchecked")
			List<Employee> list = session.createQuery("from Employee").getResultList();
			for(Employee employee : list) {
				System.out.println("Employee with id=1 is : "+employee.toString());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
