package com.udea.parcial.service;

import com.udea.parcial.dao.IPatientDAO;
import com.udea.parcial.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private IPatientDAO dao;

    public Patient save(Patient patient){
        return dao.save(patient);
    }

    public Optional<Patient> getPatient(String identificationNumber){
        return dao.findByIdentificationNumber(identificationNumber);
    }
}
