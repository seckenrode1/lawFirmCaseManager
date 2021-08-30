package org.sarahEckenrode.caseManager.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String contactFirstName;
	private String contactLastName;
	private String contactEmail;
	private String contactPhone;
	private String contactDob;  //Maybe LocalDate
	private String contactLanguage;
	private String contactMaritalStatus;
	private String contactSsn;
	
	public Contact() {}

	public Contact(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public Contact(Integer id, String contactFirstName, String contactLastName, String contactEmail,
			String contactPhone, String contactDob, String contactLanguage, String contactMaritalStatus,
			String contactSsn) {
		super();
		this.id = id;
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
		this.contactDob = contactDob;
		this.contactLanguage = contactLanguage;
		this.contactMaritalStatus = contactMaritalStatus;
		this.contactSsn = contactSsn;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the contactFirstName
	 */
	public String getContactFirstName() {
		return contactFirstName;
	}

	/**
	 * @param contactFirstName the contactFirstName to set
	 */
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	/**
	 * @return the contactLastName
	 */
	public String getContactLastName() {
		return contactLastName;
	}

	/**
	 * @param contactLastName the contactLastName to set
	 */
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	/**
	 * @return the contactEmail
	 */
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * @param contactEmail the contactEmail to set
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	/**
	 * @return the contactPhone
	 */
	public String getContactPhone() {
		return contactPhone;
	}

	/**
	 * @param contactPhone the contactPhone to set
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	/**
	 * @return the contactDob
	 */
	public String getContactDob() {
		return contactDob;
	}

	/**
	 * @param contactDob the contactDob to set
	 */
	public void setContactDob(String contactDob) {
		this.contactDob = contactDob;
	}

	/**
	 * @return the contactLanguage
	 */
	public String getContactLanguage() {
		return contactLanguage;
	}

	/**
	 * @param contactLanguage the contactLanguage to set
	 */
	public void setContactLanguage(String contactLanguage) {
		this.contactLanguage = contactLanguage;
	}

	/**
	 * @return the contactMaritalStatus
	 */
	public String getContactMaritalStatus() {
		return contactMaritalStatus;
	}

	/**
	 * @param contactMaritalStatus the contactMaritalStatus to set
	 */
	public void setContactMaritalStatus(String contactMaritalStatus) {
		this.contactMaritalStatus = contactMaritalStatus;
	}

	/**
	 * @return the contactSsn
	 */
	public String getContactSsn() {
		return contactSsn;
	}

	/**
	 * @param contactSsn the contactSsn to set
	 */
	public void setContactSsn(String contactSsn) {
		this.contactSsn = contactSsn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contactDob == null) ? 0 : contactDob.hashCode());
		result = prime * result + ((contactEmail == null) ? 0 : contactEmail.hashCode());
		result = prime * result + ((contactFirstName == null) ? 0 : contactFirstName.hashCode());
		result = prime * result + ((contactLanguage == null) ? 0 : contactLanguage.hashCode());
		result = prime * result + ((contactLastName == null) ? 0 : contactLastName.hashCode());
		result = prime * result + ((contactMaritalStatus == null) ? 0 : contactMaritalStatus.hashCode());
		result = prime * result + ((contactPhone == null) ? 0 : contactPhone.hashCode());
		result = prime * result + ((contactSsn == null) ? 0 : contactSsn.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Contact other = (Contact) obj;
		if (contactDob == null) {
			if (other.contactDob != null)
				return false;
		} else if (!contactDob.equals(other.contactDob))
			return false;
		if (contactEmail == null) {
			if (other.contactEmail != null)
				return false;
		} else if (!contactEmail.equals(other.contactEmail))
			return false;
		if (contactFirstName == null) {
			if (other.contactFirstName != null)
				return false;
		} else if (!contactFirstName.equals(other.contactFirstName))
			return false;
		if (contactLanguage == null) {
			if (other.contactLanguage != null)
				return false;
		} else if (!contactLanguage.equals(other.contactLanguage))
			return false;
		if (contactLastName == null) {
			if (other.contactLastName != null)
				return false;
		} else if (!contactLastName.equals(other.contactLastName))
			return false;
		if (contactMaritalStatus == null) {
			if (other.contactMaritalStatus != null)
				return false;
		} else if (!contactMaritalStatus.equals(other.contactMaritalStatus))
			return false;
		if (contactPhone == null) {
			if (other.contactPhone != null)
				return false;
		} else if (!contactPhone.equals(other.contactPhone))
			return false;
		if (contactSsn == null) {
			if (other.contactSsn != null)
				return false;
		} else if (!contactSsn.equals(other.contactSsn))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
