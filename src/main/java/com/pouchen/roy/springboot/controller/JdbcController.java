package com.pouchen.roy.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into spring_user(name,email,password) values('Roy','@poc.com','****')");
		return "data inserted successfully...";
	}
}
