package com.elitedentalgroup.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitedentalgroup.dao.FormRequestDAO;
import com.elitedentalgroup.dto.FormRequestDTO;
import com.elitedentalgroup.service.api.IFormRequestService;

@Service
public class FormRequestServiceImpl implements IFormRequestService {

	@Autowired
	private FormRequestDAO formRequestDao;

	@Override
	public Boolean insert(FormRequestDTO formRequestDTO) {
		return formRequestDao.insert(formRequestDTO);
	}

	@Override
	public Boolean delete(String formRequestId) {
		return formRequestDao.delete(formRequestId);
	}

	@Override
	public Boolean update(FormRequestDTO formRequestDTO) {
		return formRequestDao.update(formRequestDTO);
	}

	@Override
	public FormRequestDTO getFormRequestById(String formRequestId) {
		return formRequestDao.getFormRequestById(formRequestId);
	}

	@Override
	public List<FormRequestDTO> getFormRequestList(Date startDate, Date endDate) {
		return formRequestDao.getFormRequestList(startDate, endDate);
	}

}
