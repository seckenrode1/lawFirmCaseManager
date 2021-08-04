package org.perscholas.caseManager.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Case {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int caseId;
	private String attorney;
	private String claimNo;
	private LocalDate doi;
	private int folio;
	private String injuryDesc;
	private String paralegal;
	private String referral;
	
	public Case() {}
	
	public Case(int caseId, String attorney, String claimNo, LocalDate doi, int folio, String injuryDesc,
			String paralegal, String referral) {
		super();
		this.caseId = caseId;
		this.attorney = attorney;
		this.claimNo = claimNo;
		this.doi = doi;
		this.folio = folio;
		this.injuryDesc = injuryDesc;
		this.paralegal = paralegal;
		this.referral = referral;
	}

	/**
	 * @return the caseId
	 */
	public int getCaseId() {
		return caseId;
	}

	/**
	 * @param caseId the caseId to set
	 */
	public void setCaseId(int caseId) {
		this.caseId = caseId;
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
	public LocalDate getDoi() {
		return doi;
	}

	/**
	 * @param doi the doi to set
	 */
	public void setDoi(LocalDate doi) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attorney == null) ? 0 : attorney.hashCode());
		result = prime * result + caseId;
		result = prime * result + ((claimNo == null) ? 0 : claimNo.hashCode());
		result = prime * result + ((doi == null) ? 0 : doi.hashCode());
		result = prime * result + folio;
		result = prime * result + ((injuryDesc == null) ? 0 : injuryDesc.hashCode());
		result = prime * result + ((paralegal == null) ? 0 : paralegal.hashCode());
		result = prime * result + ((referral == null) ? 0 : referral.hashCode());
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
		Case other = (Case) obj;
		if (attorney == null) {
			if (other.attorney != null)
				return false;
		} else if (!attorney.equals(other.attorney))
			return false;
		if (caseId != other.caseId)
			return false;
		if (claimNo == null) {
			if (other.claimNo != null)
				return false;
		} else if (!claimNo.equals(other.claimNo))
			return false;
		if (doi == null) {
			if (other.doi != null)
				return false;
		} else if (!doi.equals(other.doi))
			return false;
		if (folio != other.folio)
			return false;
		if (injuryDesc == null) {
			if (other.injuryDesc != null)
				return false;
		} else if (!injuryDesc.equals(other.injuryDesc))
			return false;
		if (paralegal == null) {
			if (other.paralegal != null)
				return false;
		} else if (!paralegal.equals(other.paralegal))
			return false;
		if (referral == null) {
			if (other.referral != null)
				return false;
		} else if (!referral.equals(other.referral))
			return false;
		return true;
	}
	
}
