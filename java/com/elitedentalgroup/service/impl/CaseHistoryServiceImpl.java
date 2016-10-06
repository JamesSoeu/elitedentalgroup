package com.elitedentalgroup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitedentalgroup.dao.BlogDAO;
import com.elitedentalgroup.dao.CaseHistoryDAO;
import com.elitedentalgroup.dto.BlogDTO;
import com.elitedentalgroup.dto.CaseHistoryDTO;
import com.elitedentalgroup.dto.MediaDTO;
import com.elitedentalgroup.service.api.IBlogService;
import com.elitedentalgroup.service.api.ICaseHistoryService;

/**
 * 
 * @author Elite Dental Group
 *
 */
@Service
public class CaseHistoryServiceImpl implements ICaseHistoryService {

	@Autowired
	private CaseHistoryDAO caseHistoryDao;

	@Override
	public Boolean insert(CaseHistoryDTO caseHistory) {
		return caseHistoryDao.insert(caseHistory);
	}

	@Override
	public Boolean update(CaseHistoryDTO caseHistory) {
		return caseHistoryDao.update(caseHistory);
	}

	@Override
	public Boolean delete(String caseHistoryId) {
		return caseHistoryDao.delete(caseHistoryId);
	}

	@Override
	public CaseHistoryDTO getCaseHistoryById(String caseHistoryId) {
		return caseHistoryDao.getCaseHistoryById(caseHistoryId);
	}

	@Override
	public List<MediaDTO> getMediaCaseHistoryList() {
		return caseHistoryDao.getMediaCaseHistoryList();
	}

	@Override
	public MediaDTO getMediaCaseHistoryById(String caseHistoryId) {
		return caseHistoryDao.getMediaCaseHistoryById(caseHistoryId);
	}

}
