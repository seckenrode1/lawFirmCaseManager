package org.sarahEckenrode.caseManager.repositories;

import java.util.List;

import org.sarahEckenrode.caseManager.models.Address;
import org.sarahEckenrode.caseManager.models.Cases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	List<Address> findByContactId(Integer id);
}
