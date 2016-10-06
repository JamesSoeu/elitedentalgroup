package com.elitedentalgroup.dto;

import java.util.Date;

import com.elitedentalgroup.util.MediaTypeEnum;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
public class MediaDTO {
	private String mediaId;
	private String path;
	private Date createdDate;
	private PatientDTO patient;
	private MediaTypeEnum mediaType;
	private CaseHistoryDTO caseHistory;
	private ServiceDTO service;
	private BlogDTO blog;
	private TestimonialDTO testimonial;

	/**
	 * @return the mediaId
	 */
	public String getMediaId() {
		return mediaId;
	}

	/**
	 * @param mediaId
	 *            the mediaId to set
	 */
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
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

	/**
	 * @return the patient
	 */
	public PatientDTO getPatient() {
		return patient;
	}

	/**
	 * @param patient
	 *            the patient to set
	 */
	public void setPatient(PatientDTO patient) {
		this.patient = patient;
	}

	/**
	 * @return the mediaType
	 */
	public MediaTypeEnum getMediaType() {
		return mediaType;
	}

	/**
	 * @param mediaType
	 *            the mediaType to set
	 */
	public void setMediaType(MediaTypeEnum mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * @return the caseHistory
	 */
	public CaseHistoryDTO getCaseHistory() {
		return caseHistory;
	}

	/**
	 * @param caseHistory
	 *            the caseHistory to set
	 */
	public void setCaseHistory(CaseHistoryDTO caseHistory) {
		this.caseHistory = caseHistory;
	}

	/**
	 * @return the service
	 */
	public ServiceDTO getService() {
		return service;
	}

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(ServiceDTO service) {
		this.service = service;
	}

	/**
	 * @return the blog
	 */
	public BlogDTO getBlog() {
		return blog;
	}

	/**
	 * @param blog
	 *            the blog to set
	 */
	public void setBlog(BlogDTO blog) {
		this.blog = blog;
	}

	/**
	 * @return the testimonial
	 */
	public TestimonialDTO getTestimonial() {
		return testimonial;
	}

	/**
	 * @param testimonial
	 *            the testimonial to set
	 */
	public void setTestimonial(TestimonialDTO testimonial) {
		this.testimonial = testimonial;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MediaDTO [mediaId=" + mediaId + ", path=" + path + ", createdDate=" + createdDate + ", patient="
				+ patient + ", mediaType=" + mediaType + ", caseHistory=" + caseHistory + ", service=" + service
				+ ", blog=" + blog + ", testimonial=" + testimonial + "]";
	}

}
