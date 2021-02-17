package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSendingService {
	
	@Autowired
	private JavaMailSender mailsender;

	public boolean SendEmail(String to , String subject,String text){
		boolean condition =false;
		//create object of SimpleMailMessage
		SimpleMailMessage msg=new SimpleMailMessage();
		try {
			msg.setTo(to);
			msg.setSubject(subject);
			msg.setText(text);
			mailsender.send(msg);
			condition =true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return condition;
	}
}
