package com.app.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LoginRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginRegistrationApplication.class, args);
	}

}
