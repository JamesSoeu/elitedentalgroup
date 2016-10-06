package com.elitedentalgroup.dto;

import java.util.Date;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 * 
 */
public class PatientDTO {

	private String 	patientId;
	private String 	firstName;
	private String 	lastName;
	private String 	phone;
	private String 	email;
	private Date 	dob;
	private Date 	registedDate;
	private String 	address;
	private String 	city;
	private String 	state;
	private String 	zip;
	private String 	caseHistoryId;

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

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the registedDate
	 */
	public Date getRegistedDate() {
		return registedDate;
	}

	/**
	 * @param registedDate
	 *            the registedDate to set
	 */
	public void setRegistedDate(Date registedDate) {
		this.registedDate = registedDate;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip
	 *            the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PatientDTO [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone="
				+ phone + ", email=" + email + ", dob=" + dob + ", registedDate=" + registedDate + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", caseHistoryId=" + caseHistoryId
				+ "]";
	}

}
