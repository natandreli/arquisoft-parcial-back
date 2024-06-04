package com.udea.parcial.dao;

import com.udea.parcial.model.MedicalHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicalHistoryDAO extends CrudRepository<MedicalHistory, Long> {
    Iterable<MedicalHistory> findByPatientId(long patientId);
}