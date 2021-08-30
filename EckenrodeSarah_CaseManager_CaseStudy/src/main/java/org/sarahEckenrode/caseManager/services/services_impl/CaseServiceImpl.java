package org.sarahEckenrode.caseManager.services.services_impl;

import java.util.List;
import java.util.Optional;

import org.sarahEckenrode.caseManager.models.Cases;
import org.sarahEckenrode.caseManager.repositories.CaseRepository;
import org.sarahEckenrode.caseManager.services.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CaseServiceImpl implements CaseService {

	private CaseRepository caseRepository;
	
	@Autowired
	public CaseServiceImpl(CaseRepository caseRepository) {
		this.caseRepository = caseRepository;
	}
	
	public Cases save(Cases case1) {
		return caseRepository.save(case1);
	}
	
	public Cases findByCaseId(Integer id) {
		Optional<Cases> optCase = caseRepository.findById(id);
		if (optCase.isPresent()) {
			return optCase.get();
		}
		return null;
	}
	
	@Override
	public List<Cases> findAll() {
		return (List<Cases>) caseRepository.findAll();
	}
	
	@Override
	public Cases updateCase(Integer id, Cases case1) {
		Cases c = caseRepository.findById(id).orElse(null);
		c.setAttorney(case1.getAttorney());
		c.setClaimNo(case1.getClaimNo());
		c.setDoi(case1.getDoi());
		c.setFolio(case1.getFolio());
		c.setInjuryDesc(case1.getInjuryDesc());		
		c.setParalegal(case1.getParalegal());
		c.setReferral(case1.getReferral());
		c.setContact(case1.getContact());
		return caseRepository.save(c);
	}
	
	@Override
	public void deleteByCaseId(Integer id) {
		caseRepository.deleteById(id);
	}
	
	// Finds List of cases by contactId
//	@Override
//	public List<Cases> getCasesByContactId(int contactId){
//		return caseRepository.findByContactId(contactId);
//	}
}
