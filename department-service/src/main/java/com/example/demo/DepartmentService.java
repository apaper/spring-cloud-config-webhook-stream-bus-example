package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentService {

	private static final Logger LOG = LoggerFactory.getLogger(DepartmentService.class);

	public static void main(String[] args) {
		LOG.info("BEGIN");
		SpringApplication.run(DepartmentService.class, args);
		LOG.info("END");
	}
}
