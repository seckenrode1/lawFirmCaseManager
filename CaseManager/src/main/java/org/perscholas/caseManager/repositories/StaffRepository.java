package org.perscholas.caseManager.repositories;

import org.perscholas.caseManager.models.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Integer> {
	Staff findByStaffEmail(String staffEmail);
}
