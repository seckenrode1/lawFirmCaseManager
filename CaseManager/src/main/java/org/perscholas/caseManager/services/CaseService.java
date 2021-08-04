package org.perscholas.caseManager.services;

import javax.validation.Valid;

import org.perscholas.caseManager.models.Case;

public interface CaseService {

	public Case createCase(Case case1);
	public Case findCaseByCaseId(int id); 
	public void removeCase(Case case1);
	
}