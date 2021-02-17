package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.EmailSendingService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmailSendingService bean = run.getBean(EmailSendingService.class);
		String to="vikas626639@gmail.com";
		String subject="no reply this mail is for testing purpose";
		String text="your account has been trun on for less secure app";
		boolean sendEmail = bean.SendEmail(to, subject, text);
		System.out.println(sendEmail);
	}

}
