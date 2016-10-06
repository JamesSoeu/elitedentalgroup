package com.elitedentalgroup.dto;

import java.util.Date;

/**
 * Date 06-29-2016
 * 
 * @author Elite Dental Group
 *
 */
public class BestTimeDTO {

	private String 	bestTimeId;
	private String 	bestTimeName;
	private Date 	createdDate;

	/**
	 * @return the bestTimeId
	 */
	public String getBestTimeId() {
		return bestTimeId;
	}

	/**
	 * @param bestTimeId
	 *            the bestTimeId to set
	 */
	public void setBestTimeId(String bestTimeId) {
		this.bestTimeId = bestTimeId;
	}

	/**
	 * @return the bestTimeName
	 */
	public String getBestTimeName() {
		return bestTimeName;
	}

	/**
	 * @param bestTimeName
	 *            the bestTimeName to set
	 */
	public void setBestTimeName(String bestTimeName) {
		this.bestTimeName = bestTimeName;
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
		return "BestTimeDTO [bestTimeId=" + bestTimeId + ", bestTimeName=" + bestTimeName + ", createdDate="
				+ createdDate + "]";
	}

}
