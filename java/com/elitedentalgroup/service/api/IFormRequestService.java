package com.elitedentalgroup.service.api;

import java.util.Date;
import java.util.List;

import com.elitedentalgroup.dto.FormRequestDTO;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
public interface IFormRequestService {


	Boolean insert(FormRequestDTO formRequestDTO);

	Boolean delete(String formRequestId);

	Boolean update(FormRequestDTO formRequestDTO);

	FormRequestDTO getFormRequestById(String formRequestId);
	
	List<FormRequestDTO> getFormRequestList(Date startDate, Date endDate);


}
