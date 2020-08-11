package com.example.demo.web;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class WelcomeController {

	private static final Logger LOG = LoggerFactory.getLogger(WelcomeController.class);

	@Value("${app.service-name}")
	private String serviceName;

	@Value("${shared.pseudo.property}")
	private String sharedProperty;

	@Value("${private.pseudo.property}")
	private String privateProperty;

	@Value("${private.db.username}")
	private String username;

	@Value("${private.db.password}")
	private String password;

	@GetMapping("/service")
	public String getServiceName() {
		return "service name [" + this.serviceName + "]";
	}

	@GetMapping("/service/shared/property")
	public String getSharedProperty() {
		return "service name [shared.pseudo.property=" + this.sharedProperty + "]";
	}

	@GetMapping("/service/private/property")
	public String getPrivateProperty() {
		return "service name [private.pseudo.property=" + this.privateProperty + "]";
	}

	@GetMapping("/service/private/db/credentials")
	public String getDatabaseCredentials() {
		return "[private.db.username=" + this.username + ", private.db.password=" + password + "]";
	}

	@PostConstruct
	private void postConstruct() {
		LOG.debug("BEGIN");
		LOG.info(getServiceName());
		LOG.info(getSharedProperty());
		LOG.info(getPrivateProperty());
		LOG.info(getDatabaseCredentials());
		LOG.debug("END");
	}
}
