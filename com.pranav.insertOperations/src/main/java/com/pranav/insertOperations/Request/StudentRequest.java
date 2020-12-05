package com.pranav.insertOperations.Request;

import java.util.List;


public class StudentRequest {

	private Long studentId;
	private List<String> courses;

	public StudentRequest() {
		// TODO Auto-generated constructor stub
	}

	public StudentRequest(Long studentId, List<String> courses) {
		this.studentId = studentId;
		this.courses = courses;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

}