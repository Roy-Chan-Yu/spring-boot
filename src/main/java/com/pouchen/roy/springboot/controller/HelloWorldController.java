package com.pouchen.roy.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller + @ResponseBody
 * @author Roy.Chan
 *
 */
@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
}
