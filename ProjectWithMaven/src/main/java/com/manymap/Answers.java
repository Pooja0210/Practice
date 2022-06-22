package com.manymap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answers {
	@Id
	@Column(name = "aid")
	private int answerId;
	private String answer;
	@ManyToOne
	private Ques question;

	public Answers() {
		super();
	}

	public Answers(int answerId, String answer, Ques question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Ques getQuestion() {
		return question;
	}

	public void setQuestion(Ques question) {
		this.question = question;
	}

}
