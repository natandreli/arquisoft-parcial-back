package com.udea.parcial.dao;

import com.udea.parcial.model.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IDoctorDAO extends CrudRepository<Doctor, Long> {
    Optional<Doctor> findByIdentificationNumber(String identificationNumber);
}
