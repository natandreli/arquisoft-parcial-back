package com.udea.parcial.util;

import com.udea.parcial.dto.MedicalHistoryDTO;
import com.udea.parcial.dto.PatientDTO;
import com.udea.parcial.exception.DoctorNotFoundException;
import com.udea.parcial.exception.PatientNotFoundException;
import com.udea.parcial.model.Doctor;
import com.udea.parcial.model.MedicalHistory;
import com.udea.parcial.model.Patient;
import com.udea.parcial.service.DoctorService;
import com.udea.parcial.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class DTOConverter {
    @Autowired
    PatientService patientService;

    @Autowired
    DoctorService doctorService;

    public MedicalHistory convertToMedicalHistoryEntity(MedicalHistoryDTO medicalHistoryDTO){
        MedicalHistory medicalHistory = new MedicalHistory();

        String identificationNumberPatient = medicalHistoryDTO.getIdentificationNumberPatient();
        Optional<Patient> optionalPatient = patientService.getPatient(identificationNumberPatient);
        Patient patient;

        if (optionalPatient.isPresent()) {
            patient = optionalPatient.get();
        } else {
            throw new PatientNotFoundException("There is no patient in the DB with that identification number");
        }

        String identificationNumberDoctor = medicalHistoryDTO.getIdentificationNumberDoctor();
        Optional<Doctor> optionalDoctor = doctorService.getDoctor(identificationNumberDoctor);
        Doctor doctor;

        if (optionalDoctor.isPresent()) {
            doctor = optionalDoctor.get();
        } else {
            throw new DoctorNotFoundException("There is no doctor in the DB with that identification number");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        medicalHistory.setPatientId(patient.getPatientId());
        medicalHistory.setDoctorId(doctor.getDoctorId());
        medicalHistory.setDateOfRecord(LocalDate.parse(medicalHistoryDTO.getDateOfRecord(), formatter));
        medicalHistory.setDiagnosis(medicalHistoryDTO.getDiagnosis());
        medicalHistory.setTreatment(medicalHistoryDTO.getTreatment());
        medicalHistory.setAdditionalNotes(medicalHistoryDTO.getAdditionalNotes());
        return medicalHistory;
    }

    public Patient convertToPatientEntity(PatientDTO patientDTO){
        Patient patient = new Patient();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        patient.setIdentificationNumber(patientDTO.getIdentificationNumber());
        patient.setName(patientDTO.getName());
        patient.setEmail(patientDTO.getEmail());
        patient.setPhone(patientDTO.getPhone());
        patient.setAddress(patientDTO.getAddress());
        patient.setDateOfBirth(LocalDate.parse(patientDTO.getDateOfBirth(), formatter));

        return patient;
    }
}
