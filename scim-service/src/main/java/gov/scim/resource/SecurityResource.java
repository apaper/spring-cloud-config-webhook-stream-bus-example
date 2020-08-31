package gov.scim.resource;

import java.util.Calendar;
import java.util.List;

import com.unboundid.scim2.common.BaseScimResource;
import com.unboundid.scim2.common.annotations.Attribute;
import com.unboundid.scim2.common.annotations.Schema;
import com.unboundid.scim2.common.types.AttributeDefinition;

import gov.scim.types.Entitlement;
import gov.scim.types.SecurityMetadata;

@Schema(id="urn:ietf:params:scim:schemas:2.0:Extended:SecurityMetadata",
name="SecurityMetadata", description = "Security Metadata for Users and Security Metadata for Entitlements")

public class SecurityResource extends BaseScimResource{
	
	
	List<SecurityMetadata> securityMetadata;

	public List<SecurityMetadata> getSecurityMeta() {
		return securityMetadata;
	}

	public void setSecurityMetadata(List<SecurityMetadata> securityMetadata) {
		this.securityMetadata = securityMetadata;
	}

	
}
