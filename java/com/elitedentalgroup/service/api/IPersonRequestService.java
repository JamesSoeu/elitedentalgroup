package com.elitedentalgroup.service.api;

import java.util.List;

import com.elitedentalgroup.dto.PersonRequestDTO;

/**
 * Date 06-29-2016
 * 
 * @author Elite Dental Group
 *
 */
public interface IPersonRequestService {


	Boolean insert(PersonRequestDTO personRequestDto);

	Boolean delete(String personRequestId);

	Boolean update(PersonRequestDTO personRequestDto);

	PersonRequestDTO getPersonRequestById(String personRequestId);
	
	List<PersonRequestDTO> getPersonRequestList();

}
