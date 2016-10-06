package com.elitedentalgroup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitedentalgroup.dao.ServiceDAO;
import com.elitedentalgroup.dto.MediaDTO;
import com.elitedentalgroup.dto.ServiceDTO;
import com.elitedentalgroup.service.api.IServiceService;

/**
 * 
 * @author Elite Dental Group
 *
 */
@Service
public class ServiceServiceImpl implements IServiceService {

	@Autowired
	private ServiceDAO serviceDao;

	@Override
	public Boolean insert(ServiceDTO serviceDto) {
		return serviceDao.insert(serviceDto);
	}

	@Override
	public Boolean update(ServiceDTO serviceDto) {
		return serviceDao.update(serviceDto);
	}

	@Override
	public Boolean delete(String serviceDtoId) {
		return serviceDao.delete(serviceDtoId);
	}

	@Override
	public ServiceDTO getServiceDtoById(String serviceDtoId) {
		return serviceDao.getServiceDtoById(serviceDtoId);
	}

	@Override
	public List<MediaDTO> getMediaServiceDtoList() {
		return serviceDao.getMediaServiceDtoList();
	}

	@Override
	public MediaDTO getMediaServiceDtoById(String serviceDtoId) {
		return serviceDao.getMediaServiceDtoById(serviceDtoId);
	}

}
