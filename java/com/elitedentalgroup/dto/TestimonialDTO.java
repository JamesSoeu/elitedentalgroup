package com.elitedentalgroup.dto;

import java.util.Date;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 * 
 */
public class TestimonialDTO {

	private String 	testimonialId;
	private String 	title;
	private Date 	createDate;
	private String 	patientId;

	/**
	 * @return the testimonialId
	 */
	public String getTestimonialId() {
		return testimonialId;
	}

	/**
	 * @param testimonialId
	 *            the testimonialId to set
	 */
	public void setTestimonialId(String testimonialId) {
		this.testimonialId = testimonialId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId
	 *            the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TestimonialDTO [testimonialId=" + testimonialId + ", title=" + title + ", createDate=" + createDate
				+ ", patientId=" + patientId + "]";
	}

}
