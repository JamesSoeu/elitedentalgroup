package com.elitedentalgroup.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.PatientDTO;

/**
 * Date 06-28-2016
 * 
 * @author Elite Dental Group
 *
 */
@Repository
public interface PatientDAO {
	
	Boolean insert(PatientDTO patientDto);

	Boolean delete(String patientId);

	Boolean update(PatientDTO patientDto);

	PatientDTO getPatientById(String patientId);
	
	List<PatientDTO> getPatientList();

}
