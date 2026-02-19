package com.klu.service;
import java.util.List;
import com.klu.model.Student;

	public interface StudentService {
		String getWelcomeMessage();
		Student getStudentById(int id);
		List<Student> getAllStudents();
		Student updateStudent(int id,Student student);
		String delete(int id);
		Student createStudent(Student student);
		List<Student> searchStudent(String name,String course);

	}


