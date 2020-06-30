package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@RefreshScope
public class EurekaService {

	private static final Logger LOG = LoggerFactory.getLogger(EurekaService.class);

	public static void main(String[] args) {
		LOG.info("BEGIN");
		SpringApplication.run(EurekaService.class, args);
		LOG.info("END");
	}
}
