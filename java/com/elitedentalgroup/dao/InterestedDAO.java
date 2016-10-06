package com.elitedentalgroup.dao;

import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.InterestedDTO;

/**
 * Date 06-29-2016
 * 
 * @author Elite Dental Group
 *
 */
@Repository
public interface InterestedDAO {
	
	Boolean insert(InterestedDTO interestedDto);

	Boolean delete(String interestedId);

	Boolean update(InterestedDTO interestedDto);

	InterestedDTO getInterestedById(String interestedId);

}
