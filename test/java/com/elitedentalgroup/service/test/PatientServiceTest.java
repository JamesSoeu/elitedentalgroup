package com.elitedentalgroup.service.test;


import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.elitedentalgroup.dto.PatientDTO;
import com.elitedentalgroup.service.api.IPatientSerivce;
import com.elitedentalgroup.util.UniqueNumberUtils;

public class PatientServiceTest extends AbstractTestCase {

	/*@Autowired
	IPatientSerivce patientSerivce;
	
	@Test
	public void insertPatient(){
		
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
		patient.setDob(new Date(1993, 10, 26));
		patient.setCaseHistoryId("001");
		patient.setRegistedDate(new Date());
		
		patientSerivce.insert(patient);
		
	}*/
}