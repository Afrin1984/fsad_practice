package com.klu.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController

public class DemoController {
	@GetMapping("/hello")
    public String sayHello() {
    	return "this is spring boot application";
    }
	@GetMapping("/bye")
    public String sayBye() {
    	return "Have a good day!";
    }
}
