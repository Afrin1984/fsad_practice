package com.klu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.service.StudentService;

@Service
public class StudentServiceIMPL implements StudentService {
	private List<Student> studentList=new ArrayList<>();
	@Override
	public String getWelcomeMessage() {
		return "Hello jii";
	}
	@Override
	public Student getStudentById(int id) {
		for(Student s:studentList) {
			if(s.getId()==id) {
				return s;
			}
		}
		return null;
	}
	@Override
	public List<Student> searchStudent(String name,String course) {
		List<Student> result=new ArrayList<>();
	for(Student s:studentList) {
		if(s.getName().equalsIgnoreCase(name)&&s.getCourse()==course) {
			result.add(s);
		}
	}
	return result;
	}
	//Normally save  to database
	@Override
    public Student createStudent(Student student) {
        // Normally save to DB
		studentList.add(student);
        return student;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public Student updateStudent(int id,Student student) {
    	for(int i=0;i<studentList.size();i++) {
    		if(studentList.get(i).getId()==id) {
    			student.setId(id);
    			studentList.set(i, student);
    			return student;
    		}
    	}
    	return null;
    }
    
    @Override
    public String delete(int id) {
    	for(Student s:studentList) {
    		if(s.getId()==id) {
    			studentList.remove(s);
    			return "Student record deleted";
    		}
    	}
    	return "student record not found";
    }
}
