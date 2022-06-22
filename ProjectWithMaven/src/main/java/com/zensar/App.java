package com.zensar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Project Started..");
		// SessionFactory factory = new
		// Configuration().configure().buildSessionFactory();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		// Creating student
		Student st = new Student();
		st.setId(103);
		st.setName("PRIYA");
		st.setCity("Patna");
		System.out.println(st);

		// Creating object of Address class
		Address ad = new Address();
		ad.setStreet("street1");
		ad.setCity("DELHI");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.2344);
		// Reading image
		FileInputStream fis = new FileInputStream("src/main/java/poojakumari.jpg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(ad);

		tx.commit();
		session.close();
		
		System.out.println("done");
		// System.out.println(factory);
		// System.out.println(factory.isClosed());
	}
}
