package gov.scim.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.scim.types.SecurityMetadata;


@Repository
public interface SecurityDao extends JpaRepository<SecurityMetadata, Long> {
	
	
}
