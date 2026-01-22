package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class CourseRegistartion {
	@Value("101")
    private int rollno;
	@Value("Hayat")
    private String name;
	@Value("FSAD")
    private String courseName;
	@Value("4")
    private int sem;
     
	public CourseRegistartion(int no,String sname,String cn,int sem) {
		rollno=no;
		name=sname;
		courseName=cn;
		this.sem=sem;
	}
	public void dis() {
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Course Name:"+courseName);
		System.out.println("Semester:"+sem);
	}
}
