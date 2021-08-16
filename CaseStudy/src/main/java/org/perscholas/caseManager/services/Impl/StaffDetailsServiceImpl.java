package org.perscholas.caseManager.services.Impl;

import org.perscholas.caseManager.repositories.StaffRepository;
import org.perscholas.caseManager.security.CurrentStaff;
import org.springframework.stereotype.Service;
import org.perscholas.caseManager.models.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class StaffDetailsServiceImpl implements UserDetailsService{

	@Autowired
	StaffRepository staffRepository;
	
	@Override
	public UserDetails loadUserByUsername(String staffEmail) throws UsernameNotFoundException {
		Staff staff = staffRepository.findByStaffEmail(staffEmail);
		if (staff == null) {
			throw new UsernameNotFoundException("User not found.");
		}
		return new CurrentStaff(staff);
	}

}
