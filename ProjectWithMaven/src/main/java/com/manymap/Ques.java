package com.manymap;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="one_to_many_ques")
public class Ques {
	@Id
	@Column(name = "qid")
	private int questionId;
	private String question;
	@OneToMany(mappedBy = "question")
	private List<Answers> answers;
	public Ques() {
		super();
	}
	public Ques(int questionId, String question, List<Answers> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	
	
	

}
