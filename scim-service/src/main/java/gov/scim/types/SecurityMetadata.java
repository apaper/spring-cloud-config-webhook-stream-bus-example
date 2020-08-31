package gov.scim.types;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.unboundid.scim2.common.annotations.Attribute;
import com.unboundid.scim2.common.types.AttributeDefinition;

@Entity
@Table(name="user_security_metadata")
public class SecurityMetadata {
	
	@Attribute(description = "A unique identifier for the Entitlement.", isRequired = true, isCaseExact = false, mutability = AttributeDefinition.Mutability.READ_WRITE, returned = AttributeDefinition.Returned.DEFAULT, uniqueness = AttributeDefinition.Uniqueness.GLOBAL)
	@Id
    @GeneratedValue
	private UUID id;
	
	@Column(name="create_date",nullable=false)
	@Attribute(description = "Date the securty metadata record was created.", isRequired = true, isCaseExact = false, 
			mutability = AttributeDefinition.Mutability.READ_WRITE, returned = AttributeDefinition.Returned.DEFAULT, 
			uniqueness = AttributeDefinition.Uniqueness.NONE)
	private Calendar createDate;
	
	@Column(name="classification",nullable=false)
	@Attribute(description = "Classification currently assigned to the user.", isRequired = true, isCaseExact = false, mutability = AttributeDefinition.Mutability.READ_ONLY, returned = AttributeDefinition.Returned.ALWAYS, uniqueness = AttributeDefinition.Uniqueness.NONE)
	private String classification;
	
	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinTable(name = "organization", joinColumns = @JoinColumn(name = "secondary_Organization_id"),inverseJoinColumns = @JoinColumn(name = "id"))
	//@JoinColumn(name = "secondary_Organization_id")
	//@Column(name="secondary_Organization_id",nullable=false)
	//@Attribute(description = "Primary organization assigned to the user.", isRequired = true, isCaseExact = false, mutability = AttributeDefinition.Mutability.READ_ONLY, returned = AttributeDefinition.Returned.ALWAYS, uniqueness = AttributeDefinition.Uniqueness.NONE)
	//private List<String> secondaryOrganizations;
	
	@Column(name="primary_Organization_id",nullable=false)
	@Attribute(description = "Secondary organizations assigned to the user, describes all secondary organizations currently assigned to the user.", isRequired = true, isCaseExact = false, mutability = AttributeDefinition.Mutability.READ_ONLY, returned = AttributeDefinition.Returned.ALWAYS, uniqueness = AttributeDefinition.Uniqueness.GLOBAL)
	private String primaryOrganization;
	
	@Column(name="modify_date",nullable=false)
	@Attribute(description = "Date the securty metadata record was modified", isRequired = true, isCaseExact = false, 
			mutability = AttributeDefinition.Mutability.READ_WRITE, returned = AttributeDefinition.Returned.DEFAULT, 
			uniqueness = AttributeDefinition.Uniqueness.NONE)
	private Calendar modifyDate;
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	/*public List<String> getSecondaryOrganizations() {
		return secondaryOrganizations;
	}

	public void setSecondaryOrganizations(List<String> secondaryOrganizations) {
		this.secondaryOrganizations = secondaryOrganizations;
	}*/

	public String getPrimaryOrganization() {
		return primaryOrganization;
	}

	public void setPrimaryOrganization(String primaryOrganization) {
		this.primaryOrganization = primaryOrganization;
	}

	public Calendar getCreated() {
		return createDate;
	}

	public void setCreated(Calendar created) {
		this.createDate = created;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification (String classification) {
		this.classification = classification;
	}

}
