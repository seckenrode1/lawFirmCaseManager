package org.sarahEckenrode.caseManager.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cases {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String attorney;
	private String claimNo;
	private String doi;
	private int folio;
	private String injuryDesc;
	private String paralegal;
	private String referral;
	
	@ManyToOne
	@JoinColumn(name = "contact_id")
	private Contact contact;
	
	public Cases() {}

	public Cases(Integer id, String attorney, String claimNo, String doi, int folio, String injuryDesc,
			String paralegal, String referral, Contact contact) {
		super();
		this.id = id;
		this.attorney = attorney;
		this.claimNo = claimNo;
		this.doi = doi;
		this.folio = folio;
		this.injuryDesc = injuryDesc;
		this.paralegal = paralegal;
		this.referral = referral;
		this.contact = contact;
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
	 * @return the attorney
	 */
	public String getAttorney() {
		return attorney;
	}

	/**
	 * @param attorney the attorney to set
	 */
	public void setAttorney(String attorney) {
		this.attorney = attorney;
	}

	/**
	 * @return the claimNo
	 */
	public String getClaimNo() {
		return claimNo;
	}

	/**
	 * @param claimNo the claimNo to set
	 */
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	/**
	 * @return the doi
	 */
	public String getDoi() {
		return doi;
	}

	/**
	 * @param doi the doi to set
	 */
	public void setDoi(String doi) {
		this.doi = doi;
	}

	/**
	 * @return the folio
	 */
	public int getFolio() {
		return folio;
	}

	/**
	 * @param folio the folio to set
	 */
	public void setFolio(int folio) {
		this.folio = folio;
	}

	/**
	 * @return the injuryDesc
	 */
	public String getInjuryDesc() {
		return injuryDesc;
	}

	/**
	 * @param injuryDesc the injuryDesc to set
	 */
	public void setInjuryDesc(String injuryDesc) {
		this.injuryDesc = injuryDesc;
	}

	/**
	 * @return the paralegal
	 */
	public String getParalegal() {
		return paralegal;
	}

	/**
	 * @param paralegal the paralegal to set
	 */
	public void setParalegal(String paralegal) {
		this.paralegal = paralegal;
	}

	/**
	 * @return the referral
	 */
	public String getReferral() {
		return referral;
	}

	/**
	 * @param referral the referral to set
	 */
	public void setReferral(String referral) {
		this.referral = referral;
	}

	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((attorney == null) ? 0 : attorney.hashCode());
//		result = prime * result + ((claimNo == null) ? 0 : claimNo.hashCode());
//		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
//		result = prime * result + ((doi == null) ? 0 : doi.hashCode());
//		result = prime * result + folio;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((injuryDesc == null) ? 0 : injuryDesc.hashCode());
//		result = prime * result + ((paralegal == null) ? 0 : paralegal.hashCode());
//		result = prime * result + ((referral == null) ? 0 : referral.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cases other = (Cases) obj;
//		if (attorney == null) {
//			if (other.attorney != null)
//				return false;
//		} else if (!attorney.equals(other.attorney))
//			return false;
//		if (claimNo == null) {
//			if (other.claimNo != null)
//				return false;
//		} else if (!claimNo.equals(other.claimNo))
//			return false;
//		if (contact == null) {
//			if (other.contact != null)
//				return false;
//		} else if (!contact.equals(other.contact))
//			return false;
//		if (doi == null) {
//			if (other.doi != null)
//				return false;
//		} else if (!doi.equals(other.doi))
//			return false;
//		if (folio != other.folio)
//			return false;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (injuryDesc == null) {
//			if (other.injuryDesc != null)
//				return false;
//		} else if (!injuryDesc.equals(other.injuryDesc))
//			return false;
//		if (paralegal == null) {
//			if (other.paralegal != null)
//				return false;
//		} else if (!paralegal.equals(other.paralegal))
//			return false;
//		if (referral == null) {
//			if (other.referral != null)
//				return false;
//		} else if (!referral.equals(other.referral))
//			return false;
//		return true;
//	}
//	
}
