package com.example.signup_signin_functionality;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.dpr.api"})
@ComponentScan(basePackages = {"com.example.service","com.example.storeservice","com.example.relationship.service","com.example.dpr", "com.example.dpr.api.service"})
@EntityScan(basePackages = {"com.example.entity","com.example.storeentity","com.example.relationship.entities","com.example.dpr.api.entity"})
@EnableJpaRepositories(basePackages = {"com.example.repository","com.example.storerepository","com.example.relationship.repositories","com.example.dpr.api.repository"})

public class SignupSigninFunctionalityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignupSigninFunctionalityApplication.class, args);
	}

}
