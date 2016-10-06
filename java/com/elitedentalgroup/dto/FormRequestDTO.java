package com.elitedentalgroup.dto;

import java.util.Date;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
public class FormRequestDTO {

	private String 				formRequestId;
	private Date 				formCreatedDate;
	private PurposeDTO 			purposeDto;
	private InterestedDTO 		interestedDto;
	private BestTimeDTO 		bestTimeDto;
	private PersonRequestDTO 	personRequestDto;
	private String 				message;

	/**
	 * @return the formRequestID
	 */
	public String getFormRequestID() {
		return formRequestId;
	}

	/**
	 * @param formRequestID
	 *            the formRequestID to set
	 */
	public void setFormRequestID(String formRequestID) {
		this.formRequestId = formRequestID;
	}

	/**
	 * @return the formCreatedDate
	 */
	public Date getFormCreatedDate() {
		return formCreatedDate;
	}

	/**
	 * @param formCreatedDate
	 *            the formCreatedDate to set
	 */
	public void setFormCreatedDate(Date formCreatedDate) {
		this.formCreatedDate = formCreatedDate;
	}

	/**
	 * @return the purposeDTO
	 */
	public PurposeDTO getPurposeDTO() {
		return purposeDto;
	}

	/**
	 * @param purposeDTO
	 *            the purposeDTO to set
	 */
	public void setPurposeDTO(PurposeDTO purposeDTO) {
		this.purposeDto = purposeDTO;
	}

	/**
	 * @return the interestedDTO
	 */
	public InterestedDTO getInterestedDTO() {
		return interestedDto;
	}

	/**
	 * @param interestedDTO
	 *            the interestedDTO to set
	 */
	public void setInterestedDTO(InterestedDTO interestedDTO) {
		this.interestedDto = interestedDTO;
	}

	/**
	 * @return the bestTimeDTO
	 */
	public BestTimeDTO getBestTimeDTO() {
		return bestTimeDto;
	}

	/**
	 * @param bestTimeDTO
	 *            the bestTimeDTO to set
	 */
	public void setBestTimeDTO(BestTimeDTO bestTimeDTO) {
		this.bestTimeDto = bestTimeDTO;
	}

	/**
	 * @return the personRequestDTO
	 */
	public PersonRequestDTO getPersonRequestDTO() {
		return personRequestDto;
	}

	/**
	 * @param personRequestDTO
	 *            the personRequestDTO to set
	 */
	public void setPersonRequestDTO(PersonRequestDTO personRequestDTO) {
		this.personRequestDto = personRequestDTO;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FormRequestDTO [formRequestID=" + formRequestId + ", formCreatedDate=" + formCreatedDate
				+ ", purposeDTO=" + purposeDto + ", interestedDTO=" + interestedDto + ", bestTimeDTO=" + bestTimeDto
				+ ", personRequestDTO=" + personRequestDto + ", message=" + message + "]";
	}

}
