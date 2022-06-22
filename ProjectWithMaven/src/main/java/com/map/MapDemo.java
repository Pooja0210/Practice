package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// creating Question
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java?");
		// creating Answer
		Answer a1 = new Answer();
		a1.setAnswerId(343);
		a1.setAnswer("Java is Programming language.");
		q1.setAnswer(a1);
		a1.setQuestion(q1);
		// creating Question
		Question q2 = new Question();
		q2.setQuestionId(242);
		q2.setQuestion("What is Collection?");
		// creating Answer
		Answer a2 = new Answer();
		a2.setAnswerId(344);
		a2.setAnswer("API to work with objects in java.");
		q2.setAnswer(a2);
		a2.setQuestion(q2);
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(q1);
		s.save(a1);
		s.save(q2);
		s.save(a2);
		tx.commit();
		//fetching...
		Question q = (Question) s.get(Question.class, 1212);
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswer().getAnswer());

		s.close();
		factory.close();

	}

}
