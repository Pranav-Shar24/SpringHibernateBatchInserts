package com.pranav.insertOperations.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@IdClass(StudentId.class)
@Table(name = "StudTable")
public class StudentEntity {
	
	/*
	 * @Id
	 * 
	 * @GeneratedValue private int id;
	 */
	
	@Id
	private Long studentId;
	@Id
	private String courses;
	
	 @Version
	  private Short version;
	
	public StudentEntity() {
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(Long studentId, String courses) {
		this.studentId = studentId;
		this.courses = courses;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public Short getVersion() {
		return version;
	}
	
	
	
}