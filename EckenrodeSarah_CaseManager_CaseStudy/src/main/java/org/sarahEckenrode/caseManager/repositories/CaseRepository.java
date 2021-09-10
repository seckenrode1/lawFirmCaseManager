package org.sarahEckenrode.caseManager.repositories;


import java.util.List;

import org.sarahEckenrode.caseManager.models.Cases;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CaseRepository extends JpaRepository<Cases, Integer> {

	List<Cases> findByContactId(int contactId);
}
