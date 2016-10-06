package com.elitedentalgroup.service.api;

import java.util.List;

import com.elitedentalgroup.dto.BlogDTO;
import com.elitedentalgroup.dto.CaseHistoryDTO;
import com.elitedentalgroup.dto.MediaDTO;

/**
 * 
 * @author Elite Dental Group
 *
 */
public interface ICaseHistoryService {

	Boolean insert(CaseHistoryDTO caseHistory);

	Boolean update(CaseHistoryDTO caseHistory);

	Boolean delete(String caseHistoryId);

	CaseHistoryDTO getCaseHistoryById(String caseHistoryId);

	List<MediaDTO> getMediaCaseHistoryList();
	
	MediaDTO getMediaCaseHistoryById(String caseHistoryId);
}
