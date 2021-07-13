package com.pouchen.roy.springboot.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.pouchen.roy.springboot.aop.model.Account;
import com.pouchen.roy.springboot.aop.service.AccountService;
import com.pouchen.roy.springboot.aop.service.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopImpl {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AopImpl.class, args);

		AccountService accountService = context.getBean("accountServiceImpl", AccountServiceImpl.class);
		Account account;
		try {
			account = accountService.getAccountByCustomerId("123");//1
			if (account != null)
				System.out.println(account.getAccountNumber() + "\t" + account.getAccountType());
			else {
				System.out.println("None the mapping account...");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
