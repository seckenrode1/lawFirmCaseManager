package org.sarahEckenrode.caseManager.services;

import java.util.List;

import org.sarahEckenrode.caseManager.models.Address;
import org.sarahEckenrode.caseManager.models.Cases;
import org.sarahEckenrode.caseManager.models.Contact;

public interface AddressService {

	Address save(Address address);
	Address findById(Integer id); 
	void deleteById(Integer id);
	Address updateAddress(Integer id, Address address);	
	List<Address> findAll();
	List<Address> findByContactId(Integer id);
}
