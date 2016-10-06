package com.elitedentalgroup.dto;

import java.util.Date;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 */
public class CaseHistoryDTO extends PatientDTO{

	private String 	caseHistoryId;
	private String 	caseHistoryTitle;
	private String 	content;
	private String 	subContent;
	private Date 	createdDate;

	/**
	 * @return the caseHistoryId
	 */
	public String getCaseHistoryId() {
		return caseHistoryId;
	}

	/**
	 * @param caseHistoryId
	 *            the caseHistoryId to set
	 */
	public void setCaseHistoryId(String caseHistoryId) {
		this.caseHistoryId = caseHistoryId;
	}

	/**
	 * @return the caseHistoryTitle
	 */
	public String getCaseHistoryTitle() {
		return caseHistoryTitle;
	}

	/**
	 * @param caseHistoryTitle
	 *            the caseHistoryTitle to set
	 */
	public void setCaseHistoryTitle(String caseHistoryTitle) {
		this.caseHistoryTitle = caseHistoryTitle;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the subContent
	 */
	public String getSubContent() {
		return subContent;
	}

	/**
	 * @param subContent
	 *            the subContent to set
	 */
	public void setSubContent(String subContent) {
		this.subContent = subContent;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createdDate;
	}

	/**
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createdDate = createDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CaseHistoryDTO [caseHistoryId=" + caseHistoryId + ", caseHistoryTitle=" + caseHistoryTitle
				+ ", content=" + content + ", subContent=" + subContent + ", createDate=" + createdDate + "]";
	}

}
