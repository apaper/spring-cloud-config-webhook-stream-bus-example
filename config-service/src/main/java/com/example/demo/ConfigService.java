package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigService {

	private static final Logger LOG = LoggerFactory.getLogger(ConfigService.class);

	public static void main(String[] args) {
		LOG.info("BEGIN");
		SpringApplication.run(ConfigService.class, args);
		LOG.info("END");
	}
}
