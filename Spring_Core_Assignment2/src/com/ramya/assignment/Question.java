package com.ramya.assignment;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question 
{
	private int questionId;
	private String question;
	private String answers;
	
	public Question() {
		super();
	}
	public Question(int questionId, String question, String answers)
	{
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	List<Object> answer1;
	Set<Object> answer2;
	Map<Object,Object> answer3;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	public List<Object> getAnswer1() {
		return answer1;
	}
	public void setAnswer1(List<Object> answer1) {
		this.answer1 = answer1;
	}
	public Set<Object> getAnswer2() {
		return answer2;
	}
	public void setAnswer2(Set<Object> answer2) {
		this.answer2 = answer2;
	}
	public Map<Object, Object> getAnswer3() {
		return answer3;
	}
	public void setAnswer3(Map<Object, Object> answer3) {
		this.answer3 = answer3;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	
	
}
