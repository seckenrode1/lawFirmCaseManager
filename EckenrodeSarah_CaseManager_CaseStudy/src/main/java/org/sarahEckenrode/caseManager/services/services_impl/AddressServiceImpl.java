package org.sarahEckenrode.caseManager.services.services_impl;

import java.util.List;
import java.util.Optional;

import org.sarahEckenrode.caseManager.models.Address;
import org.sarahEckenrode.caseManager.models.Cases;
import org.sarahEckenrode.caseManager.models.Contact;
import org.sarahEckenrode.caseManager.repositories.AddressRepository;
import org.sarahEckenrode.caseManager.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{


	private AddressRepository addressRepository;
	
	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
	@Override
	public Address save(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address findById(Integer id) {
		Optional<Address> optAddress = addressRepository.findById(id);
		if (optAddress.isPresent()) {
			return optAddress.get();
		}
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		addressRepository.deleteById(id);
		
	}
	
	@Override
	public List<Address> findAll() {
		return (List<Address>) addressRepository.findAll();
	}

	@Override
	public Address updateAddress(Integer id, Address address) {
		Address a = addressRepository.findById(id).orElse(null);
		a.setStreetAddress(address.getStreetAddress());
		a.setCity(address.getCity());
		a.setState(address.getState());
		a.setZip(address.getZip());
		a.setCountry(address.getCountry());		
		a.setContact(address.getContact());
		return addressRepository.save(a);
	}

	@Override
	public List<Address> findByContactId(Integer id) {
		return addressRepository.findByContactId(id);
	}

	
	
}
