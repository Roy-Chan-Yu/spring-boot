package com.pouchen.roy.springboot.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pouchen.roy.springboot.aop.model.Employee;
import com.pouchen.roy.springboot.aop.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)
	public Employee addEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName) {
		return employeeService.createEmployee(empId,firstName,secondName);
	}
	
	@RequestMapping(value="/del/employee", method = RequestMethod.GET)
	public String deleEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String firstName, @RequestParam("secondName")String secondName) {
		return "Employee removed...";
	}
	
	
}
