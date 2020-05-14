package com.springbootdev.springcloud.examples.employeeservice;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class WelcomeController
{
    @Value("${app.service-name}")
    private String serviceName;
    
    @Value("${shared.pseudo.property}")
    private String sharedProperty;
    
    @Value("${private.pseudo.property}")
    private String privateProperty;

    @GetMapping("/service")
    public String getServiceName() {
        return "service name [" + this.serviceName + "]";
    }
    
    @GetMapping("/service/shared/property")
    public String getSharedProperty() {
        return "shared property [shared.pseudo.property=" + this.sharedProperty + "]";
    }
    
    @GetMapping("/service/private/property")
    public String getPrivateProperty() {
        return "private property [private.pseudo.property=" + this.privateProperty + "]";
    }
    
	@PostConstruct
	private void postConstruct() {
		System.out.println("##########################");
		System.out.println(getServiceName());
		System.out.println(getSharedProperty());
		System.out.println(getPrivateProperty());
		System.out.println("##########################");
	}
    
}
