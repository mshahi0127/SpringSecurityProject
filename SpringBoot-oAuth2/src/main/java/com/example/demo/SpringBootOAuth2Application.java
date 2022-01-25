package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication

public class SpringBootOAuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOAuth2Application.class, args);
	}

}
