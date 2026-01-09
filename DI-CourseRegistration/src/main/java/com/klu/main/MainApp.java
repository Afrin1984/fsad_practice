package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.model.CourseRegistration;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		CourseRegistration cr=(CourseRegistration)con.getBean("courseReg");
        cr.display();
	}

}
