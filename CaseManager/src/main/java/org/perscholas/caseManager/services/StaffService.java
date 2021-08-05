package org.perscholas.caseManager.services;

import org.perscholas.caseManager.models.Staff;

public interface StaffService {
	
	public Staff createStaff(Staff staff);
	public Staff findStaffByStaffId(int staffId);
	public Staff findStaffByStaffEmail(String staffEmail);
	public void removeStaff(Staff staff);
	
}
