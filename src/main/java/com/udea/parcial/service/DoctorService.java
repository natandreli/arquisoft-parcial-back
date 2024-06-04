package com.udea.parcial.service;

import com.udea.parcial.dao.IDoctorDAO;
import com.udea.parcial.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private IDoctorDAO dao;

    public Doctor save(Doctor doctor){
        return dao.save(doctor);
    }

    public Optional<Doctor> getDoctor(String identificationNumber){
        return dao.findByIdentificationNumber(identificationNumber);
    }
}