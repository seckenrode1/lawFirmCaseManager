package org.sarahEckenrode.caseManager.services;

import java.util.List;

import org.sarahEckenrode.caseManager.models.Cases;

public interface CaseService {

	Cases save(Cases case1);
	Cases findByCaseId(Integer id); 
	void deleteByCaseId(Integer id);
	Cases updateCase(Integer id, Cases case1);
	List<Cases> findAll();
//	List<Cases> getCasesByContactId(int contactId);
	
}