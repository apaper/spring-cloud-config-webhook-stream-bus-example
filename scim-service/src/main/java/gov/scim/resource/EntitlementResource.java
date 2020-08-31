package gov.scim.resource;

import java.util.List;

import com.unboundid.scim2.common.BaseScimResource;
import com.unboundid.scim2.common.annotations.Attribute;
import com.unboundid.scim2.common.annotations.Schema;
import com.unboundid.scim2.common.types.AttributeDefinition;

import gov.scim.types.Entitlement;

@Schema(id = "urn:ietf:params:scim:schemas:2.0:Extended:Entitlements", name = "Entitlement", description = "Entitlements")

/**
 * An extended resource type for Entitlement resources. The core
 * schema for "{@code Entitlement}" is identified using the URI:
 * "{@code urn:ietf:params:scim:schemas:core:2.0:Entitlement}".
 */
public class EntitlementResource extends BaseScimResource {
	
	List<Entitlement> entitlements;

	public List<Entitlement> getEntitlements() {
		return entitlements;
	}

	public void setEntitlements(List<Entitlement> entitlements) {
		this.entitlements = entitlements;
	}
	
	
	

	
	}