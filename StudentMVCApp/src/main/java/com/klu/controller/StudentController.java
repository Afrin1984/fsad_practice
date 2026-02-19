package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Student;
import com.klu.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentService service;
	
	//1.Simple get
	@GetMapping("/greet")
	public String getWelcomeMessage() {
		return service.getWelcomeMessage();
	}
	// 2️ Path Variable
    @GetMapping("/student/getid/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // 3️ Request Parameters
    @GetMapping("/student/search")
    public List<Student> searchStudent( @RequestParam String name,@RequestParam String course) {

        return service.searchStudent(name,course);
    }

    // 4️ JSON POST
    @PostMapping("/student/add")
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    //getAll
    @GetMapping("/student/getall")
    public List<Student> getAllStudents(){
    	return service.getAllStudents();
    }
    @PutMapping("student/update/{id}")
    public Student updateStudent(@RequestParam int id,@RequestBody Student student) {
    	return service.updateStudent(id, student);
    }
    @DeleteMapping("/student/del/{id}")
    public String deleteStudent(@PathVariable int id) {
    	return service.delete(id);
    }
    
    

}
