package com.pouchen.roy.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pouchen.roy.springboot.exception.StudentNotFoundException;
import com.pouchen.roy.springboot.jpa.Student;
import com.pouchen.roy.springboot.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudent();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		
		Student student = studentService.getStudentById(id);
		
		if(student == null) {
			throw new StudentNotFoundException("Can not find the student id = "+ id);
		}
		return student;
		
	}
	
	@PostMapping("/student")
	public Student saveBook(@Valid @RequestBody Student student) {
		studentService.saveOrUpdate(student);
		return student;
		
	}
}
