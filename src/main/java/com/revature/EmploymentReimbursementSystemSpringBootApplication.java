package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.revature")
@EnableJpaRepositories(basePackages = "com.revature")
@SpringBootApplication(scanBasePackages = "com.revature")
public class EmploymentReimbursementSystemSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmploymentReimbursementSystemSpringBootApplication.class, args);
	}
}
