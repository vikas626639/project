package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.service.EmailSendingService;

@Controller
public class EmailSenderController {
	
	@Autowired
	private EmailSendingService service;
	
	@GetMapping("/index")
	private String sendMail() {
		//use service
		String to = "vikas626639@gmail.com";
		String subject = "<h1>This is for testing</h1>";
		String text = "<b>This mail sent from spring boot application</b>";
		boolean sendEmail = service.SendEmail(to, subject, text);
		return "index";
		
	}

}
