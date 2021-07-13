package com.pouchen.roy.springboot.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.pouchen.roy.springboot.aop.model.Account;

@Aspect
@Component
public class AccountAspect {
	
	@AfterReturning(pointcut = "execution(* com.pouchen.roy.springboot.aop.service.AccountServiceImpl.*(..))", returning = "account")
	public void afterReturnAdvice(JoinPoint joinPoint, Account account) {
		System.out.println("After Return method: " + joinPoint.getSignature());
		System.out.println(account);
	}
}
