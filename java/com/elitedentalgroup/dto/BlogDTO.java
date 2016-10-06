package com.elitedentalgroup.dto;

import java.util.Date;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
public class BlogDTO {

	private String blogId;
	private String blogTitle;
	private String blogContent;
	private String blogSubContent;
	private Date createdDate;
	private AuthorDTO authorDto;

	/**
	 * @return the blogId
	 */
	public String getBlogId() {
		return blogId;
	}

	/**
	 * @param blogId
	 *            the blogId to set
	 */
	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	/**
	 * @return the blogTitle
	 */
	public String getBlogTitle() {
		return blogTitle;
	}

	/**
	 * @param blogTitle
	 *            the blogTitle to set
	 */
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	/**
	 * @return the blogContent
	 */
	public String getBlogContent() {
		return blogContent;
	}

	/**
	 * @param blogContent
	 *            the blogContent to set
	 */
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	/**
	 * @return the blogSubContent
	 */
	public String getBlogSubContent() {
		return blogSubContent;
	}

	/**
	 * @param blogSubContent
	 *            the blogSubContent to set
	 */
	public void setBlogSubContent(String blogSubContent) {
		this.blogSubContent = blogSubContent;
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
	 * @return the authorDto
	 */
	public AuthorDTO getAuthorDto() {
		return authorDto;
	}

	/**
	 * @param authorDto
	 *            the authorDto to set
	 */
	public void setAuthorDto(AuthorDTO authorDto) {
		this.authorDto = authorDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BlogDTO [blogId=" + blogId + ", blogTitle=" + blogTitle + ", blogContent=" + blogContent
				+ ", blogSubContent=" + blogSubContent + ", createdDate=" + createdDate + ", authorDto=" + authorDto
				+ "]";
	}

}
