package com.elitedentalgroup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitedentalgroup.dao.AuthorDAO;
import com.elitedentalgroup.dto.AuthorDTO;
import com.elitedentalgroup.service.api.IAuthorService;
/**
 * 
 * @author Elite Dental Group
 *
 */
@Service
public class AuthorServiceImpl implements IAuthorService{

	@Autowired
	private AuthorDAO authorDao;

	@Override
	public Boolean insert(AuthorDTO author) {
		return authorDao.insert(author);
	}

	@Override
	public Boolean update(AuthorDTO author) {
		return authorDao.update(author);
	}

	@Override
	public Boolean delete(String authorId) {
		return authorDao.delete(authorId);
	}

	@Override
	public AuthorDTO getAuthorById(String authorId) {
		return authorDao.getAuthorById(authorId);
	}

	@Override
	public List<AuthorDTO> getAuthorList() {
		return authorDao.getAuthorList();
	}
	
	
}
