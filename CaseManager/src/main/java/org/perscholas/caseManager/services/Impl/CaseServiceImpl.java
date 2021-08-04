package org.perscholas.caseManager.services.Impl;

import org.perscholas.caseManager.models.Case;
import org.perscholas.caseManager.repositories.CaseRepository;
import org.perscholas.caseManager.services.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseServiceImpl implements CaseService {

	private CaseRepository caseRepository;
	
	@Autowired
	public CaseServiceImpl(CaseRepository caseRepository) {
		this.caseRepository = caseRepository;
	}
	
	@Override
	public Case save(Case book) {
		return caseRepository.save(book);
	}
}
