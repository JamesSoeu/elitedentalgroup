package com.elitedentalgroup.dto;

import java.util.Date;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
public class InterestedDTO {

	private String 	interestedId;
	private String 	interestedName;
	private Date 	createdDate;

	/**
	 * @return the interestedId
	 */
	public String getInterestedId() {
		return interestedId;
	}

	/**
	 * @param interestedId
	 *            the interestedId to set
	 */
	public void setInterestedId(String interestedId) {
		this.interestedId = interestedId;
	}

	/**
	 * @return the interestedName
	 */
	public String getInterestedName() {
		return interestedName;
	}

	/**
	 * @param interestedName
	 *            the interestedName to set
	 */
	public void setInterestedName(String interestedName) {
		this.interestedName = interestedName;
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
		return "InterestedDTO [interestedId=" + interestedId + ", interestedName=" + interestedName + ", createdDate="
				+ createdDate + "]";
	}

}
