package com.elitedentalgroup.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.CaseHistoryDTO;
import com.elitedentalgroup.dto.MediaDTO;

@Repository
public interface CaseHistoryDAO {

	Boolean insert(CaseHistoryDTO caseHistory);

	Boolean update(CaseHistoryDTO caseHistory);

	Boolean delete(String caseHistoryId);

	CaseHistoryDTO getCaseHistoryById(String caseHistoryId);

	List<MediaDTO> getMediaCaseHistoryList();
	
	MediaDTO getMediaCaseHistoryById(String caseHistoryId);
}
