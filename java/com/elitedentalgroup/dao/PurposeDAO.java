package com.elitedentalgroup.dao;

import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.PurposeDTO;

/**
 * Date 06-29-2016
 * 
 * @author Elite Dental Group
 *
 */
@Repository
public interface PurposeDAO {
	
	Boolean insert(PurposeDTO purposeDto);

	Boolean delete(String purposeId);

	Boolean update(PurposeDTO purposeDto);

	PurposeDTO getPurposeById(String purposeId);

}
