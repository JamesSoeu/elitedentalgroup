package com.elitedentalgroup.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elitedentalgroup.dto.CaseHistoryDTO;
import com.elitedentalgroup.dto.MediaDTO;
import com.elitedentalgroup.dto.PatientDTO;
import com.elitedentalgroup.service.api.ICaseHistoryService;
import com.elitedentalgroup.service.api.IMediaService;
import com.elitedentalgroup.service.api.IPatientSerivce;
import com.elitedentalgroup.util.FileUploadUtil;
import com.elitedentalgroup.util.MediaTypeEnum;
import com.elitedentalgroup.util.UniqueNumberUtils;

@Controller
@RequestMapping("/api/caseHistory")
public class CaseHistoryController {

	@Autowired
	ICaseHistoryService caseHistoryService;
	
	@Autowired
	IPatientSerivce patientService;

	@Autowired
	IMediaService mediaService;

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Boolean addNew(@ModelAttribute CaseHistoryDTO caseHistory, HttpServletRequest request) throws IllegalStateException, IOException {
		Boolean result = false;
		String caseHistoryId = UniqueNumberUtils.generateAsString();
		caseHistory.setCaseHistoryId(caseHistoryId);
		caseHistory.setCreateDate(new Date());
		
		result = caseHistoryService.insert(caseHistory);
		if ( result ){
			
			PatientDTO patientDto = new PatientDTO();
			patientDto.setPatientId(caseHistory.getPatientId());
			patientDto.setCaseHistoryId(caseHistoryId);
			result = patientService.update(patientDto);
			
			MediaDTO media = new MediaDTO();
			media.setCreatedDate(new Date());
			media.setMediaId(UniqueNumberUtils.generateAsString());
			media.setPath(request.getParameter("videoLink"));
			media.setMediaType(MediaTypeEnum.VIDEO);
			
			media.setCaseHistory(caseHistory);
			result = mediaService.insert(media);
		}
		
		return result;

	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody Boolean update(@ModelAttribute CaseHistoryDTO caseHistory,
			@RequestParam(value = "mediaId", required = false) String mediaId, HttpServletRequest request)
			throws IllegalStateException, IOException {
		Boolean result = false;
		result = caseHistoryService.update(caseHistory);
		if (result) {
			if (!request.getParameter("videoLink").isEmpty() && request.getParameter("videoLink") != null && request.getParameter("mediaOldPath") != null ) {

				// remove old media because this cases one server, one media
				if (request.getParameter("mediaOldPath") != null || !request.getParameter("mediaOldPath").isEmpty()) {
					mediaService.delete(mediaId);
					FileUploadUtil.delete(request.getParameter("mediaOldPath"));
				}
				
				PatientDTO patientDto = new PatientDTO();
				patientDto.setPatientId(caseHistory.getPatientId());
				patientDto.setCaseHistoryId(caseHistory.getCaseHistoryId());
				result = patientService.update(patientDto);
				
				MediaDTO media = new MediaDTO();
				media.setCreatedDate(new Date());
				media.setMediaId(UniqueNumberUtils.generateAsString());
				media.setPath(request.getParameter("videoLink"));
				media.setMediaType(MediaTypeEnum.VIDEO);
				
				media.setCaseHistory(caseHistory);
				result = mediaService.insert(media);
			}
		}

		return result;

	}
	
	@RequestMapping( value = "/delete/{caseHistoryId}" )
	public  String deleteCaseHistory ( @PathVariable String caseHistoryId){
		Boolean deleted = caseHistoryService.delete(caseHistoryId);
		return "caseHistoryList";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<MediaDTO> getMediaCaseHistoryList() {
		return caseHistoryService.getMediaCaseHistoryList();
	}

	@RequestMapping(value = "/{caseHistoryId}", method = RequestMethod.GET)
	public @ResponseBody CaseHistoryDTO getcaseHistoryById(@PathVariable String caseHistoryId) {
		return caseHistoryService.getCaseHistoryById(caseHistoryId);
	}
	

	@RequestMapping(value ="/media-caseHistory/{caseHistoryId}", method = RequestMethod.GET)
	public @ResponseBody MediaDTO getMediaCaseHistory(@PathVariable String caseHistoryId) {
		return caseHistoryService.getMediaCaseHistoryById(caseHistoryId);
	}
}
