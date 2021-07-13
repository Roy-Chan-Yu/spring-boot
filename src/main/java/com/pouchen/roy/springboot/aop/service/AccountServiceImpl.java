package com.pouchen.roy.springboot.aop.service;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pouchen.roy.springboot.aop.model.Account;

@Service
public class AccountServiceImpl implements AccountService{

	private static Map<String, Account> map = null;
	
	static {
		map = new HashMap<>();
		map.put("1", new Account("123","Saving-Account"));
		map.put("2", new Account("222","Current-Account"));
	}

	@Override
	public Account getAccountByCustomerId(String customerId) throws Exception {
		
		if (customerId ==null) {
			throw new Exception("Invalid: "+customerId);
		}
		Account account = null;
		
		Set<java.util.Map.Entry<String, Account>> entrySet = map.entrySet();
		
		for(java.util.Map.Entry<String, Account> entry : entrySet) {
			if(entry.getKey().equals(customerId)) {
				account = entry.getValue();
			}
		}
		
		return account;
		//map.entrySet().stream().filter(p-> p.getKey().equals(customerId)).collect(Collectors.toList());
		
	}
}
