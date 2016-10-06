package com.elitedentalgroup.service.api;

import java.util.List;

import com.elitedentalgroup.dto.AuthorDTO;

/**
 * 
 * @author Elite Dental Group
 *
 */
public interface IAuthorService {

	Boolean insert(AuthorDTO author);

	Boolean update(AuthorDTO author);

	Boolean delete(String authorId);

	AuthorDTO getAuthorById(String authorId);

	List<AuthorDTO> getAuthorList();
}
