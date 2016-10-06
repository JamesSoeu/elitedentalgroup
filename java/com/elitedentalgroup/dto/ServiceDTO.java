package com.elitedentalgroup.dto;

import java.util.Date;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
public class ServiceDTO {

	private String 	serviceId;
	private String 	serviceName;
	private String 	serviceContent;
	private String 	serviceSubContent;
	private Date 	createdDate;

	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName
	 *            the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the serviceContent
	 */
	public String getServiceContent() {
		return serviceContent;
	}

	/**
	 * @param serviceContent
	 *            the serviceContent to set
	 */
	public void setServiceContent(String serviceContent) {
		this.serviceContent = serviceContent;
	}

	/**
	 * @return the serviceSubContent
	 */
	public String getServiceSubContent() {
		return serviceSubContent;
	}

	/**
	 * @param serviceSubContent
	 *            the serviceSubContent to set
	 */
	public void setServiceSubContent(String serviceSubContent) {
		this.serviceSubContent = serviceSubContent;
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
		return "ServiceDTO [serviceId=" + serviceId + ", serviceName=" + serviceName + ", serviceContent="
				+ serviceContent + ", serviceSubContent=" + serviceSubContent + ", createdDate=" + createdDate + "]";
	}

}
