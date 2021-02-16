package com.Ragistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Ragistration.service.PasswordGenerator;

@RestController
public class PasswordRestController {
	//use service
	@Autowired
	private PasswordGenerator service;
	
	@GetMapping("/getpwd/{num}")
	public String getPwd(@PathVariable("num")Integer num) {
		String pwd = service.genRadamText(num);
		
		return "captcha="+pwd;
	}
}
