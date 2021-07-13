package com.pouchen.roy.springboot.aop.aspect;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.pouchen.roy.springboot.aop.model.Employee;

@Aspect
@Component
public class EmployeeServiceAspect {
	
	@Pointcut(value = "execution(* com.pouchen.roy.springboot.aop.service.EmployeeService.*(..)) && args(empId, fname, sname)")
	private void logServiceRating(String empId, String fname, String sname) {
		
	}
	
	@Before(value = "logServiceRating(empId,fname,sname)")
	public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {
		System.out.println("Before method: " + joinPoint.getSignature());
		System.out.println("Employee attributes : "+ empId+" "+fname+" "+sname);
	}
	
	
}
