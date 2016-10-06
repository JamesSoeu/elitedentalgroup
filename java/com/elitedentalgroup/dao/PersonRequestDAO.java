package com.elitedentalgroup.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.PersonRequestDTO;

/**
 * Date 06-29-2016
 * 
 * @author Elite Dental Group
 *
 */
@Repository
public interface PersonRequestDAO {
	
	Boolean insert(PersonRequestDTO personRequestDto);

	Boolean delete(String personRequestId);

	Boolean update(PersonRequestDTO personRequestDto);

	PersonRequestDTO getPersonRequestById(String personRequestId);
	
	List<PersonRequestDTO> getPersonRequestList();

}
