package com.elitedentalgroup.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.elitedentalgroup.dto.FormRequestDTO;
import com.elitedentalgroup.dto.PersonRequestDTO;
import com.elitedentalgroup.service.api.IFormRequestService;
import com.elitedentalgroup.service.api.IPersonRequestService;
import com.elitedentalgroup.util.DateTimeUtils;
import com.elitedentalgroup.util.UniqueNumberUtils;

@RestController
@RequestMapping("/api/form-request")
public class FormRequestController {

	@Autowired
	IFormRequestService formRequestService;

	@Autowired
	IPersonRequestService personRequestService;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Boolean insert(@RequestBody FormRequestDTO formRequest) {

		/* insert person request form */
		PersonRequestDTO personRequest = formRequest.getPersonRequestDTO();
		personRequest.setPersonRequestId(UniqueNumberUtils.generateAsString());
		if (personRequestService.insert(personRequest)) {
			formRequest.setFormRequestID(UniqueNumberUtils.generateAsString());
			formRequest.setFormCreatedDate(new Date());
			if (formRequestService.insert(formRequest)) {
				return true;
			}
		}
		return false;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<FormRequestDTO> getFormRequest(@RequestParam String startDate, @RequestParam String endDate)
			throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

		Date sDate = formatter.parse(startDate);
		Date eDate = formatter.parse(endDate);
		List<FormRequestDTO> formRequestList = formRequestService.getFormRequestList(sDate, eDate);
		return formRequestList;
	}

	@RequestMapping(value = "/{formId}", method = RequestMethod.GET)
	@ResponseBody
	public FormRequestDTO getFormRequestById(@PathVariable String formId) {

		FormRequestDTO formRequestById = formRequestService.getFormRequestById(formId);
		return formRequestById;
	}

}