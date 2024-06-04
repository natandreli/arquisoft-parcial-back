package com.udea.parcial.controller;

import com.udea.parcial.dto.MedicalHistoryDTO;
import com.udea.parcial.model.MedicalHistory;
import com.udea.parcial.model.Patient;
import com.udea.parcial.service.MedicalHistoryService;
import com.udea.parcial.service.PatientService;
import com.udea.parcial.util.DTOConverter;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicalHistory")
@CrossOrigin("*")
@Tag(name = "", description = "")
public class MedicalHistoryController {
    @Autowired
    MedicalHistoryService medicalService;

    @Autowired
    PatientService patientService;

    @Autowired
    DTOConverter dtoConverter;
    @PostMapping("/save")
    @Operation(summary = "Save medical history")
    public long save(
            @Parameter(description = "", required = true)
            @RequestBody MedicalHistoryDTO medicalHistoryDTO
    ) throws RuntimeException {
        MedicalHistory medicalHistory = dtoConverter.convertToMedicalHistoryEntity(medicalHistoryDTO);
        MedicalHistory savedMedicalHistoryId = medicalService.save(medicalHistory);
        return savedMedicalHistoryId.getMedicalHistoryId();
    }

    @GetMapping("/list/{id}")
    @Operation(summary = "Get medical histories by patient identification number")
    public Iterable<MedicalHistory> listFlightById(
            @Parameter(description = "", required = true)
            @PathVariable("id") String identificationNumber) {
        Patient patient = patientService.getPatient(identificationNumber).get();
        Iterable<MedicalHistory> list = medicalService.getAllByPatientId(patient.getPatientId());
        return list;
    }
}
