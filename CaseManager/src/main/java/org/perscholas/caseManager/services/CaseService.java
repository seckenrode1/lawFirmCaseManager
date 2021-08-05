package org.perscholas.caseManager.services;

import javax.validation.Valid;

import org.perscholas.caseManager.models.Cases;

public interface CaseService {

	public Cases createCase(Cases case1);
	public Cases findCaseByCaseId(int id); 
	public void removeCase(Cases case1);
	
}