package com.microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.microservice1")
@EntityScan("com.microservice1.entity")
@EnableJpaRepositories(basePackages = {"com.microservice1.repository"})
public class MicroserviceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOneApplication.class, args);
	}

}
