package com.klu.model;

public class CourseRegistration {
	private int rollno;
	private String name;
	private String courseName;
	private int sem;
	
	
	public CourseRegistration(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public void setSem(int sem) {
		this.sem=sem;
	}
	public void display() {
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("CourseName:"+courseName);
		System.out.println("Semester:"+sem);
		
	}

}
