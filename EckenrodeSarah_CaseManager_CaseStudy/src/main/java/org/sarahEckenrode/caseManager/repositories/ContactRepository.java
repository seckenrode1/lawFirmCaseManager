package org.sarahEckenrode.caseManager.repositories;


import java.util.List;

import org.sarahEckenrode.caseManager.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

	@Query(value = "select * from Contact c where c.contactLastName like %:keyword% or c.contactFirstName like %:keyword%", nativeQuery = true)
	List<Contact> findByKeyword(@Param("keyword") String keyword);
	
}
