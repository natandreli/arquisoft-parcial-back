package com.udea.parcial.dao;

import com.udea.parcial.model.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorDAO extends CrudRepository<Doctor, Long> {
}
