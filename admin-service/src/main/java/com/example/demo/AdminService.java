package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RefreshScope
@EnableAutoConfiguration
@EnableAdminServer
@EnableScheduling
public class AdminService {

	private static final Logger LOG = LoggerFactory.getLogger(AdminService.class);

	public static void main(String[] args) {
		LOG.info("BEGIN");
		SpringApplication.run(AdminService.class, args);
		LOG.info("END");
	}
}
