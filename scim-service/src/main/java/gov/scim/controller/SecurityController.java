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

import gov.scim.dao.SecurityDao;
import gov.scim.resource.SecurityResource;
import gov.scim.types.SecurityMetadata;

@ResourceType(description = "Security Metadata for User Resources", name ="SecurityMetadata", schema = SecurityResource.class)
@Path("/Security")

public class SecurityController {
	
	@Autowired
	SecurityDao securityDao;
	
	/*@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id") String userId) throws URISyntaxException {
		
	 SecurityResource securityResource = securityDao.getSecurityMetadata(UUID.randomUUID().toString());
		return Response
				.status(Response.Status.OK)
				.entity("Security Metadata: " + securityResource)
				.build();
	}*/
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser() throws URISyntaxException {
		
	 List<SecurityMetadata> securityMetadata = securityDao.findAll();
		return Response
				.status(Response.Status.OK)
				.entity("Security Metadata: " + securityMetadata)
				.build();
	}

	
}
