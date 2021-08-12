package com.spring.orm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class student {
	@Id
private int studentId;
	private String sName;
	private String sCity;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public student(int studentId, String sName, String sCity) {
		super();
		this.studentId = studentId;
		this.sName = sName;
		this.sCity = sCity;
	}
	public student(String sName, String sCity) {
		super();
		this.sName = sName;
		this.sCity = sCity;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
