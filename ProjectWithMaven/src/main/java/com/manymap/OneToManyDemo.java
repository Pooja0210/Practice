package com.manymap;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.manymap.Answers;
import com.manymap.Ques;

public class OneToManyDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// creating Question
		Ques q1 = new Ques();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java?");
		// creating Answer
		Answers a1 = new Answers();
		a1.setAnswerId(343);
		a1.setAnswer("Java is Programming language.");
		a1.setQuestion(q1);
		
		Answers a2 = new Answers();
		a2.setAnswerId(33);
		a2.setAnswer("With the help of java we can create softwares.");
		a2.setQuestion(q1);
		
		Answers a3 = new Answers();
		a3.setAnswerId(353);
		a3.setAnswer("Java has different type of frameworks.");
		a3.setQuestion(q1);
		
		List<Answers> list = new ArrayList<Answers>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		q1.setAnswers(list);
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(q1);
		s.save(a1);
		s.save(a2);
		s.save(a3);
		
		Ques q = (Ques) s.get(Ques.class, 1212);
		System.out.println(q.getQuestion());
		
		for (Answers a: q.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		tx.commit();
		
		
		s.close();
		factory.close();
	}
}
