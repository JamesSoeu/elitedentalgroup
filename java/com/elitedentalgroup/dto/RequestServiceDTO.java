package com.elitedentalgroup.dto;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
public class RequestServiceDTO extends ServiceDTO {

	private MultipartFile file;

	/**
	 * @return the file
	 */
	public MultipartFile getFile() {
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public void setFile(MultipartFile file) {
		this.file = file;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RequestServiceDTO [file=" + file + "]";
	}

}
