package com.zensar;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
public static void main(String[] args) throws IOException {
		
		System.out.println("Project Started..");
		// SessionFactory factory = new
		// Configuration().configure().buildSessionFactory();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		// Creating student
		Student st1 = new Student();
		st1.setId(107);
		st1.setName("Utkarsha");
		st1.setCity("Pune");
		
		Certificate certificate = new Certificate();
		certificate.setCourse("Android");
		certificate.setDuration("2 months");
		st1.setCerti(certificate);
		Student st2 = new Student();
		st2.setId(108);
		st2.setName("Pooja");
		st2.setCity("Patna");
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Hibernate");
		certificate1.setDuration("1 months");
		st2.setCerti(certificate1);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st1);
		session.save(st2);

		tx.commit();
		session.close();
		factory.close();
		
		
}
}
