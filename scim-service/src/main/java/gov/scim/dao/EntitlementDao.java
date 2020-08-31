package gov.scim.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.scim.types.Entitlement;

@Repository
public interface EntitlementDao extends JpaRepository<Entitlement, Long> {
	
	

}
