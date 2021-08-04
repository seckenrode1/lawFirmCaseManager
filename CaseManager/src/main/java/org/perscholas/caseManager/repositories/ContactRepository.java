package org.perscholas.caseManager.repositories;

import org.perscholas.caseManager.models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
