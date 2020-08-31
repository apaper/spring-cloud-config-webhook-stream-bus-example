package gov.scim.controller;

import java.net.URISyntaxException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.unboundid.scim2.common.types.UserResource;
import com.unboundid.scim2.server.annotations.ResourceType;

import gov.scim.dao.UserDao;


@ResourceType(description = "Access user Resources", name ="User", schema = UserResource.class)
@Path("/Users")

public class UserController {
	@Autowired
	UserDao userDao;
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id") String userId) throws URISyntaxException {
		
		UserResource user = userDao.getUser(userId);
		return Response
				.status(Response.Status.OK)
				.entity("User: " + user)
				.build();
	}

}
