package com.Ragistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Ragistration.service.PasswordGenerator;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
				PasswordGenerator bean = run.getBean(PasswordGenerator.class);
				String s = bean.genRadamText(5);
				System.out.println(s);
	}

}
