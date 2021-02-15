package com.PhoneBook;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.PhoneBook.Command.Contect;
import com.PhoneBook.Service.ContectServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		ContectServiceImpl bean = run.getBean(ContectServiceImpl.class);
		bean.getAllContect();
	}

}
