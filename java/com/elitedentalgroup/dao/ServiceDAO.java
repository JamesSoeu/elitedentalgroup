package com.elitedentalgroup.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.ServiceDTO;
import com.elitedentalgroup.dto.MediaDTO;

@Repository
public interface ServiceDAO {

	Boolean insert(ServiceDTO serviceDto);

	Boolean update(ServiceDTO serviceDto);

	Boolean delete(String serviceId);

	ServiceDTO getServiceDtoById(String serviceDtoId);

	List<MediaDTO> getMediaServiceDtoList();
	
	MediaDTO getMediaServiceDtoById(String serviceDtoId);
}
