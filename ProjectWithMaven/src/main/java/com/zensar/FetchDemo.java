package com.zensar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		//get, load
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//get-student:102
		Student student=(Student)session.get(Student.class, 102);
		System.out.println(student.getName());
		
		session.close();
		factory.close();
	}

}
