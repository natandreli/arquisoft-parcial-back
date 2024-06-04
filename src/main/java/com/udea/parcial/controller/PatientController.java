package com.udea.parcial.controller;

import com.udea.parcial.dto.MedicalHistoryDTO;
import com.udea.parcial.dto.PatientDTO;
import com.udea.parcial.model.MedicalHistory;
import com.udea.parcial.model.Patient;
import com.udea.parcial.service.PatientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
@CrossOrigin("*")
@Tag(name = "", description = "")
public class PatientController {
//    @Autowired
//    PatientService patientService;
//    @PostMapping("/save")
//    @Operation(summary = "Save patient")
//    public long save(
//            @Parameter(description = "", required = true)
//            @RequestBody PatientDTO patientDTO
//    ) throws RuntimeException {
//
//    }
}