package com.elitedentalgroup.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elitedentalgroup.dto.PatientDTO;
import com.elitedentalgroup.service.api.IPatientSerivce;
import com.elitedentalgroup.util.UniqueNumberUtils;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

	@Autowired
	IPatientSerivce patientSerivce;

	@RequestMapping(method = RequestMethod.POST)
	public Boolean insert(ModelMap model) {

		PatientDTO patient = new PatientDTO();
		patient.setPatientId(UniqueNumberUtils.generateAsString());
		patient.setFirstName("James Chanpov");
		patient.setLastName("Soeu");
		patient.setPhone("9189069103");
		patient.setEmail("james.soeu@gmail.com");
		patient.setAddress("9018 N 121st East Ave. Ste 400");
		patient.setCity("Owasso");
		patient.setState("OK");
		patient.setZip("74055");
		patient.setDob(new Date("1993/12/12"));
		patient.setCaseHistoryId("001");
		patient.setRegistedDate(new Date());

		return patientSerivce.insert(patient);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<PatientDTO> getPatient() {
		
		return patientSerivce.getPatientList();
	}
}
