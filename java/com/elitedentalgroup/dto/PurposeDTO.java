package com.elitedentalgroup.dto;

import java.util.Date;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
public class PurposeDTO {
	private String 	purposeId;
	private String 	purposeName;
	private Date 	createdDate;

	/**
	 * @return the purposeId
	 */
	public String getPurposeId() {
		return purposeId;
	}

	/**
	 * @param purposeId
	 *            the purposeId to set
	 */
	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
	}

	/**
	 * @return the purposeName
	 */
	public String getPurposeName() {
		return purposeName;
	}

	/**
	 * @param purposeName
	 *            the purposeName to set
	 */
	public void setPurposeName(String purposeName) {
		this.purposeName = purposeName;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PurposeDTO [purposeId=" + purposeId + ", purposeName=" + purposeName + ", createdDate=" + createdDate
				+ "]";
	}

}
