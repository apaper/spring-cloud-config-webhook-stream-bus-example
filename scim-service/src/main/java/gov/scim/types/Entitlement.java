package gov.scim.types;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.unboundid.scim2.common.annotations.Attribute;
import com.unboundid.scim2.common.types.AttributeDefinition;

import gov.scim.lookup.Organization;
import gov.scim.lookup.EntitlementType;


@Entity
@Table(name="entitlement")
public class Entitlement {
	
	@Attribute(description = "A unique identifier for the Entitlement.", isRequired = true, isCaseExact = false, mutability = AttributeDefinition.Mutability.READ_WRITE, returned = AttributeDefinition.Returned.DEFAULT, uniqueness = AttributeDefinition.Uniqueness.GLOBAL)
	@Id
    @GeneratedValue
	private UUID id;
	
	@Column(name="display_name",nullable=false)
	@Attribute(description = "A human-readable name for the Entitlement.", isRequired = true, isCaseExact = false, mutability = AttributeDefinition.Mutability.READ_WRITE, returned = AttributeDefinition.Returned.DEFAULT, uniqueness = AttributeDefinition.Uniqueness.NONE)
	private String displayName;
	
	@OneToOne()
	@JoinColumn(name = "type_id")
	@Attribute(description = "A label indicating the type of entitlement "
			+ "function.", isRequired = true, isCaseExact = false, mutability = AttributeDefinition.Mutability.READ_WRITE, returned = AttributeDefinition.Returned.DEFAULT, uniqueness = AttributeDefinition.Uniqueness.NONE)
	private EntitlementType type;
	
	@OneToOne()
	@JoinColumn(name = "organization_id")
	@Attribute(description = "A label indicating the user's owning organization ", isRequired = true, isCaseExact = false, mutability = AttributeDefinition.Mutability.READ_ONLY, returned = AttributeDefinition.Returned.DEFAULT, uniqueness = AttributeDefinition.Uniqueness.GLOBAL)
	private Organization organization;
	
	@Column(name="is_active")
	@Attribute(description = "A label indicating if the attribute is active",
			isRequired = true, isCaseExact = false, mutability = AttributeDefinition.Mutability.READ_WRITE, returned = AttributeDefinition.Returned.DEFAULT, uniqueness = AttributeDefinition.Uniqueness.NONE)
	private Boolean active;
	
	public Entitlement() {}

	public Entitlement(UUID id, String displayName, EntitlementType type, Organization organization, Boolean active) {
		super();
		this.id = id;
		this.displayName = displayName;
		this.type = type;
		this.organization = organization;
		this.active = active;
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public String getType() {
		return type.getName();
	}

	public void setType(EntitlementType type) {	
		this.type = type;
	}

	public String getAgency() {
		return organization.getName();
	}

	public void setAgency(Organization organization) {
		this.organization = organization;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
