package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.config.AppConfig;
import com.klu.model.CourseRegistartion;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
		CourseRegistartion cr=con.getBean(CourseRegistartion.class);
		cr.dis();

	}

}
