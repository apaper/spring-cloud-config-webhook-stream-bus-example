package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.context.config.annotation.Configuration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RefreshScope
//@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class AdminService {

	public static void main(String[] args) {
		SpringApplication.run(AdminService.class, args);
	}
}
