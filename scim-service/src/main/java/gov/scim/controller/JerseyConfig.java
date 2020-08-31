package gov.scim.controller;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

import com.unboundid.scim2.server.resources.ResourceTypesEndpoint;
import com.unboundid.scim2.server.resources.SchemasEndpoint;

@Configuration
@ApplicationPath("/scim/v2")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }
    private void registerEndpoints() {
    	register(UserController.class);
    	register(SchemasEndpoint.class);
    	register(EntitlementController.class);
    	register(ResourceTypesEndpoint.class);
    	register(SecurityController.class);
    	
    }
}
