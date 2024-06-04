package com.udea.parcial.dao;

import com.udea.parcial.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPatientDAO extends CrudRepository<Patient, Long> {
    Optional<Patient> findByIdentificationNumber(String identificationNumber);
}
