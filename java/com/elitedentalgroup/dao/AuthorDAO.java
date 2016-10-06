package com.elitedentalgroup.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.AuthorDTO;

@Repository
public interface AuthorDAO {

	Boolean insert(AuthorDTO author);

	Boolean update(AuthorDTO author);

	Boolean delete(String authorId);

	AuthorDTO getAuthorById(String authorId);

	List<AuthorDTO> getAuthorList();
}
