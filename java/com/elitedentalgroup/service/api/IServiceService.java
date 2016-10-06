package com.elitedentalgroup.service.api;

import java.util.List;

import com.elitedentalgroup.dto.BlogDTO;
import com.elitedentalgroup.dto.CaseHistoryDTO;
import com.elitedentalgroup.dto.MediaDTO;
import com.elitedentalgroup.dto.ServiceDTO;

/**
 * 
 * @author Elite Dental Group
 *
 */
public interface IServiceService {

	Boolean insert(ServiceDTO serviceDto);

	Boolean update(ServiceDTO serviceDto);

	Boolean delete(String serviceDtoId);

	ServiceDTO getServiceDtoById(String serviceDtoId);

	List<MediaDTO> getMediaServiceDtoList();

	MediaDTO getMediaServiceDtoById(String serviceDtoId);
}
