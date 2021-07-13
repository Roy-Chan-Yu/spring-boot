package com.pouchen.roy.springboot.aop.service;

import com.pouchen.roy.springboot.aop.model.Account;

public interface AccountService {

	public abstract Account getAccountByCustomerId(String customerId) throws Exception;
}
