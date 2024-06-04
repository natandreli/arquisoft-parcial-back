package com.udea.parcial.service;

import com.udea.parcial.dao.IMedicalHistoryDAO;
import com.udea.parcial.model.MedicalHistory;
import com.udea.parcial.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicalHistoryService {
    @Autowired
    private IMedicalHistoryDAO dao;

    public MedicalHistory save(MedicalHistory medicalHistory){
        return dao.save(medicalHistory);
    }

    public Iterable<MedicalHistory> getAll(){
        return dao.findAll();
    }

    public Iterable<MedicalHistory> getAllByPatientId(long patientId){
        return dao.findByPatientId(patientId);
    }

}