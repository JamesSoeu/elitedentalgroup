package com.elitedentalgroup.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.FormRequestDTO;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
@Repository
public interface FormRequestDAO {
	
	Boolean insert(FormRequestDTO formRequestDTO);

	Boolean delete(String formRequestId);

	Boolean update(FormRequestDTO formRequestDTO);

	FormRequestDTO getFormRequestById(String formRequestId);
	
	List<FormRequestDTO> getFormRequestList(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}
