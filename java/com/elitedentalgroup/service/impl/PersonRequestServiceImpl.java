package com.elitedentalgroup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitedentalgroup.dao.PersonRequestDAO;
import com.elitedentalgroup.dto.PersonRequestDTO;
import com.elitedentalgroup.service.api.IPersonRequestService;

@Service
public class PersonRequestServiceImpl implements IPersonRequestService {

	@Autowired
	PersonRequestDAO personRequestDao;
	
	@Override
	public Boolean insert(PersonRequestDTO personRequestDto) {
		return personRequestDao.insert(personRequestDto);
	}

	@Override
	public Boolean delete(String personRequestId) {
		return personRequestDao.delete(personRequestId);
	}

	@Override
	public Boolean update(PersonRequestDTO personRequestDto) {
		return personRequestDao.update(personRequestDto);
	}

	@Override
	public PersonRequestDTO getPersonRequestById(String personRequestId) {
		return personRequestDao.getPersonRequestById(personRequestId);
	}

	@Override
	public List<PersonRequestDTO> getPersonRequestList() {
		return personRequestDao.getPersonRequestList();
	}

	

}
