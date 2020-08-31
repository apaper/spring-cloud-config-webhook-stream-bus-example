package gov.scim.controller;

import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.unboundid.scim2.server.annotations.ResourceType;

import gov.scim.dao.EntitlementDao;
import gov.scim.resource.EntitlementResource;
import gov.scim.types.Entitlement;
import org.springframework.web.bind.annotation.RestController;

@ResourceType(description = "Access Entitlements Resources", name ="Entitlements", schema = EntitlementResource.class)
@Path("/Entitlements")
@RestController
public class EntitlementController {
	
	@Autowired
	EntitlementDao entitlementDao;
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser() throws URISyntaxException {
		
		List<Entitlement> entitlements = entitlementDao.findAll();
		EntitlementResource resource = new EntitlementResource();
		resource.setEntitlements(entitlements);
		return Response
				.status(Response.Status.OK)
				.entity("Entitlements: " + resource)
				.build();
	}


}
