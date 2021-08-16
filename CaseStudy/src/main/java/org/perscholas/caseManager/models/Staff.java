package org.perscholas.caseManager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int staffId;
	private String staffFirstName;
	private String staffLastName;
	private String staffEmail;
	private String staffPassword;
	
	public Staff() {}
	
	public Staff(int staffId, String staffFirstName, String staffLastName, String staffEmail, String staffPassword) {
		super();
		this.staffId = staffId;
		this.staffFirstName = staffFirstName;
		this.staffLastName = staffLastName;
		this.staffEmail = staffEmail;
		this.staffPassword = staffPassword;
	}

	/**
	 * @return the staffId
	 */
	public int getStaffId() {
		return staffId;
	}

	/**
	 * @param staffId the staffId to set
	 */
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	/**
	 * @return the staffFirstName
	 */
	public String getStaffFirstName() {
		return staffFirstName;
	}

	/**
	 * @param staffFirstName the staffFirstName to set
	 */
	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	/**
	 * @return the staffLastName
	 */
	public String getStaffLastName() {
		return staffLastName;
	}

	/**
	 * @param staffLastName the staffLastName to set
	 */
	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	/**
	 * @return the staffEmail
	 */
	public String getStaffEmail() {
		return staffEmail;
	}

	/**
	 * @param staffEmail the staffEmail to set
	 */
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	/**
	 * @return the staffPassword
	 */
	public String getStaffPassword() {
		return staffPassword;
	}

	/**
	 * @param staffPassword the staffPassword to set
	 */
	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((staffEmail == null) ? 0 : staffEmail.hashCode());
		result = prime * result + ((staffFirstName == null) ? 0 : staffFirstName.hashCode());
		result = prime * result + staffId;
		result = prime * result + ((staffLastName == null) ? 0 : staffLastName.hashCode());
		result = prime * result + ((staffPassword == null) ? 0 : staffPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		if (staffEmail == null) {
			if (other.staffEmail != null)
				return false;
		} else if (!staffEmail.equals(other.staffEmail))
			return false;
		if (staffFirstName == null) {
			if (other.staffFirstName != null)
				return false;
		} else if (!staffFirstName.equals(other.staffFirstName))
			return false;
		if (staffId != other.staffId)
			return false;
		if (staffLastName == null) {
			if (other.staffLastName != null)
				return false;
		} else if (!staffLastName.equals(other.staffLastName))
			return false;
		if (staffPassword == null) {
			if (other.staffPassword != null)
				return false;
		} else if (!staffPassword.equals(other.staffPassword))
			return false;
		return true;
	}
	
}
