package gov.scim.dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Optional;
import java.util.UUID;

import org.hibernate.usertype.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unboundid.scim2.common.types.Meta;
import com.unboundid.scim2.common.types.Name;
import com.unboundid.scim2.common.types.UserResource;

import gov.scim.types.Entitlement;
import gov.scim.util.ResourceType;

@Repository
public class UserDao {
	
	@Autowired
	EntitlementDao entitlementDao;
	
	@Autowired
	SecurityDao securityDao;
	
	public UserResource getUser(String id) throws URISyntaxException {
		
		//id =  UUID.randomUUID();
		
		Long idTest = Long.getLong(UUID.randomUUID().toString());
		UserResource userResource = new UserResource();
		userResource.setActive(true);
		userResource.setDisplayName("Fred Flintstone");
		userResource.setExternalId("CN=Fred Flintstone,CN=admin,DC=gov,DC=US");
		userResource.setId(id);
		userResource.setLocale("EST");
		userResource.setMeta(this.getMetaData(id));
		Name name = new Name();
		name.setFamilyName("Flintstone");
		name.setGivenName("Fred");
		
		userResource.setName(name);
		userResource.setNickName("Yabba Dabba Do");
		userResource.setUserName("flintfred");
		//userResource.setUserType(UserType.INTERNAL);
		Optional<Entitlement> entitlement = entitlementDao.findById(idTest);
	
		//entitlementResource.setExtension(securityDao.getSecurityMetadata(id));
		
		//userResource.setExtension(entitlementResource);
		
		return userResource;
		
	}
	
		private Meta getMetaData(String UUID) throws URISyntaxException {
			Meta meta = new Meta();
			Calendar cal = Calendar.getInstance();
			meta.setCreated(cal);
			meta.setLastModified(cal);
			URI uri = new URI("https://localhost/scim/v2/users/" + UUID);
			meta.setLocation(uri);
			meta.setResourceType(ResourceType.USER);
			meta.setVersion("1.0");
			
			return meta;
		}
		
		

}