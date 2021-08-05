package org.perscholas.caseManager.repositories;

import org.perscholas.caseManager.models.Cases;
import org.springframework.data.repository.CrudRepository;


public interface CaseRepository extends CrudRepository<Cases, Integer> {

}
