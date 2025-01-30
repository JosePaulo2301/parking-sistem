package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;


@OpenAPIDefinition(info = @Info(title = "Parking System API",
description = "API para gerenciamento de estacionamento",
version = "1.0",
contact = @Contact(
        name = "José Paulo",
        email = "jose.dev2301@gmail.com",
        url = "https://github.com/josepaulobrandao/parking-system"
),
license = @License(
        name = "springdoc.org",
        url = "https://springdoc.org/"
)
))

@SpringBootApplication
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}

}
