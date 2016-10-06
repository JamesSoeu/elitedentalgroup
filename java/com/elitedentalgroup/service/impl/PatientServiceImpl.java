package com.elitedentalgroup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitedentalgroup.dao.PatientDAO;
import com.elitedentalgroup.dto.PatientDTO;
import com.elitedentalgroup.service.api.IPatientSerivce;

@Service
public class PatientServiceImpl implements IPatientSerivce {

	@Autowired
	private PatientDAO patientDao;

	@Override
	public Boolean insert(PatientDTO patientDto) {
		return patientDao.insert(patientDto);
	}

	@Override
	public Boolean delete(String patientId) {
		return patientDao.delete(patientId);
	}

	@Override
	public Boolean update(PatientDTO patientDto) {
		return patientDao.update(patientDto);
	}

	@Override
	public PatientDTO getPatientById(String patientId) {
		return patientDao.getPatientById(patientId);
	}

	@Override
	public List<PatientDTO> getPatientList() {
		return patientDao.getPatientList();
	}

}
