package org.perscholas.caseManager.services.Impl;

import java.util.Optional;

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
	
	public Case createCase(Case case1) {
		return caseRepository.save(case1);
	}
	
	public Case findCaseByCaseId(int id) {
		Optional<Case> optCase = caseRepository.findById(id);
		if (optCase.isPresent()) {
			return optCase.get();
		}
		return null;
	}
	
	public void removeCase(Case case1) {
		caseRepository.delete(case1);
	}
}
