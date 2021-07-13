package com.pouchen.roy.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pouchen.roy.springboot.jpa.Student;
import com.pouchen.roy.springboot.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<Student>();
		studentRepository.findAll().forEach(student -> students.add(student));
		
		return students;
	}
	
	public Student getStudentById(int id) {
		
		Optional<Student> studentOptional = studentRepository.findById(id);

		return (studentOptional.isPresent()==false)? 
				null:studentOptional.get(); 
	}
	
	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
	}
	
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
	
	public void update(Student student, Integer id) {
		studentRepository.save(student);
	}
}
