package com.elitedentalgroup.service.api;

import java.util.List;

import com.elitedentalgroup.dto.PatientDTO;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
public interface IPatientSerivce {

	Boolean insert(PatientDTO patientDto);

	Boolean delete(String patientId);

	Boolean update(PatientDTO patientDto);

	PatientDTO getPatientById(String patientId);
	
	List<PatientDTO> getPatientList();
}
