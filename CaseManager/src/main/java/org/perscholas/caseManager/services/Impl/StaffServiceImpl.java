package org.perscholas.caseManager.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import org.perscholas.caseManager.models.Staff;
import org.perscholas.caseManager.repositories.StaffRepository;
import org.perscholas.caseManager.services.StaffService;


@Service
public class StaffServiceImpl implements StaffService {
	
	private StaffRepository staffRepository;
	
	@Autowired
	public void StaffService(StaffRepository staffRepository) {
		this.staffRepository = staffRepository;
	}

	public Staff createStaff(Staff staff) {
		return staffRepository.save(staff);
	}
	
	public Staff findStaffByStaffId(int staffId) {
		Optional<Staff> optStaff = staffRepository.findById(staffId);
		if (optStaff.isPresent()) {
			return optStaff.get();
		}
		return null;
	}
	
	public Staff findStaffByStaffEmail(String staffEmail) {
		return staffRepository.findByStaffEmail(staffEmail);
	}

	public void removeStaff(Staff staff) {
		staffRepository.delete(staff);
	}
}
