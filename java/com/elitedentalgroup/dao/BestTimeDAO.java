package com.elitedentalgroup.dao;

import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.BestTimeDTO;

/**
 * Date 06-29-2016
 * 
 * @author Elite Dental Group
 *
 */
@Repository
public interface BestTimeDAO {
	
	Boolean insert(BestTimeDTO bestTimeDto);

	Boolean delete(String bestTimeId);

	Boolean update(BestTimeDTO bestTimeDto);

	BestTimeDTO getBestTimeById(String bestTimeId);

}
