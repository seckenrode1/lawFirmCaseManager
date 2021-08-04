package org.perscholas.caseManager.repositories;

import org.perscholas.caseManager.models.Case;
import org.springframework.data.repository.CrudRepository;


public interface CaseRepository extends CrudRepository<Case, Integer> {

}
