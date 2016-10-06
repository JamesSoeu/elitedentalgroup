package com.elitedentalgroup.dto;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
public class PersonRequestDTO {

	private String personRequestId;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;

	/**
	 * @return the personRequestId
	 */
	public String getPersonRequestId() {
		return personRequestId;
	}

	/**
	 * @param personRequestId
	 *            the personRequestId to set
	 */
	public void setPersonRequestId(String personRequestId) {
		this.personRequestId = personRequestId;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonRequestDTO [personRequestId=" + personRequestId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phone=" + phone + ", email=" + email + "]";
	}

}
