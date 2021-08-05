package org.perscholas.caseManager.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int contactId;
	private String contactAddress;
	private String contactCity;
	private String contactCountry;
	private String contactEmail;
	private String contactFirstName;
	private String contactLastName;
	private String contactState;
	private int contactZip;
	private LocalDate contactDob;
	private String contactLanguage;
	private String contactMaritalStatus;
	private String contactSsn;
	
	@OneToMany(targetEntity = Cases.class)
	private List<Cases> contactCases;
	
	
	public Contact() {}

	public Contact(int contactId, String contactAddress, String contactCity, String contactCountry, String contactEmail,
			String contactFirstName, String contactLastName, String contactState, int contactZip, LocalDate contactDob,
			String contactLanguage, String contactMaritalStatus, String contactSsn, List<Cases> contactCases) {
		super();
		this.contactId = contactId;
		this.contactAddress = contactAddress;
		this.contactCity = contactCity;
		this.contactCountry = contactCountry;
		this.contactEmail = contactEmail;
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;
		this.contactState = contactState;
		this.contactZip = contactZip;
		this.contactDob = contactDob;
		this.contactLanguage = contactLanguage;
		this.contactMaritalStatus = contactMaritalStatus;
		this.contactSsn = contactSsn;
		this.contactCases = contactCases;
	}

	/**
	 * @return the contactId
	 */
	public int getContactId() {
		return contactId;
	}

	/**
	 * @param contactId the contactId to set
	 */
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	/**
	 * @return the contactAddress
	 */
	public String getContactAddress() {
		return contactAddress;
	}

	/**
	 * @param contactAddress the contactAddress to set
	 */
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	/**
	 * @return the contactCity
	 */
	public String getContactCity() {
		return contactCity;
	}

	/**
	 * @param contactCity the contactCity to set
	 */
	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
	}

	/**
	 * @return the contactCountry
	 */
	public String getContactCountry() {
		return contactCountry;
	}

	/**
	 * @param contactCountry the contactCountry to set
	 */
	public void setContactCountry(String contactCountry) {
		this.contactCountry = contactCountry;
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
	 * @return the contactState
	 */
	public String getContactState() {
		return contactState;
	}

	/**
	 * @param contactState the contactState to set
	 */
	public void setContactState(String contactState) {
		this.contactState = contactState;
	}

	/**
	 * @return the contactZip
	 */
	public int getContactZip() {
		return contactZip;
	}

	/**
	 * @param contactZip the contactZip to set
	 */
	public void setContactZip(int contactZip) {
		this.contactZip = contactZip;
	}

	/**
	 * @return the contactDob
	 */
	public LocalDate getContactDob() {
		return contactDob;
	}

	/**
	 * @param contactDob the contactDob to set
	 */
	public void setContactDob(LocalDate contactDob) {
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

	/**
	 * @return the contactCases
	 */
	public List<Cases> getContactCases() {
		return contactCases;
	}

	/**
	 * @param contactCases the contactCases to set
	 */
	public void setContactCases(List<Cases> contactCases) {
		this.contactCases = contactCases;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contactAddress == null) ? 0 : contactAddress.hashCode());
		result = prime * result + ((contactCases == null) ? 0 : contactCases.hashCode());
		result = prime * result + ((contactCity == null) ? 0 : contactCity.hashCode());
		result = prime * result + ((contactCountry == null) ? 0 : contactCountry.hashCode());
		result = prime * result + ((contactDob == null) ? 0 : contactDob.hashCode());
		result = prime * result + ((contactEmail == null) ? 0 : contactEmail.hashCode());
		result = prime * result + ((contactFirstName == null) ? 0 : contactFirstName.hashCode());
		result = prime * result + contactId;
		result = prime * result + ((contactLanguage == null) ? 0 : contactLanguage.hashCode());
		result = prime * result + ((contactLastName == null) ? 0 : contactLastName.hashCode());
		result = prime * result + ((contactMaritalStatus == null) ? 0 : contactMaritalStatus.hashCode());
		result = prime * result + ((contactSsn == null) ? 0 : contactSsn.hashCode());
		result = prime * result + ((contactState == null) ? 0 : contactState.hashCode());
		result = prime * result + contactZip;
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
		if (contactAddress == null) {
			if (other.contactAddress != null)
				return false;
		} else if (!contactAddress.equals(other.contactAddress))
			return false;
		if (contactCases == null) {
			if (other.contactCases != null)
				return false;
		} else if (!contactCases.equals(other.contactCases))
			return false;
		if (contactCity == null) {
			if (other.contactCity != null)
				return false;
		} else if (!contactCity.equals(other.contactCity))
			return false;
		if (contactCountry == null) {
			if (other.contactCountry != null)
				return false;
		} else if (!contactCountry.equals(other.contactCountry))
			return false;
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
		if (contactId != other.contactId)
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
		if (contactSsn == null) {
			if (other.contactSsn != null)
				return false;
		} else if (!contactSsn.equals(other.contactSsn))
			return false;
		if (contactState == null) {
			if (other.contactState != null)
				return false;
		} else if (!contactState.equals(other.contactState))
			return false;
		if (contactZip != other.contactZip)
			return false;
		return true;
	}
	
	
}
