package org.perscholas.caseManager.services.Impl;

import java.util.Optional;

import org.perscholas.caseManager.models.Cases;
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
	
	public Cases createCase(Cases case1) {
		return caseRepository.save(case1);
	}
	
	public Cases findCaseByCaseId(int id) {
		Optional<Cases> optCase = caseRepository.findById(id);
		if (optCase.isPresent()) {
			return optCase.get();
		}
		return null;
	}
	
	public void removeCase(Cases case1) {
		caseRepository.delete(case1);
	}
}
