package com.Memoryapp.Memoryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.Memoryapp.Memoryapp.repository.repository;

@EnableMongoRepositories(basePackageClasses = repository.class)
@SpringBootApplication
public class MemoryappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoryappApplication.class, args);
	}

}
