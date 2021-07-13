package com.pouchen.roy.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.pouchen.roy.springboot.jpa.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
}
