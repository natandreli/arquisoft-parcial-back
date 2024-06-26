package com.udea.parcial.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Schema(description =  "Details of the medical history")
@Entity
public class MedicalHistory implements Serializable {
    @Schema(description = "Autogenerated by the DB")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "medical_history_id")
    private long medicalHistoryId;

    @Schema(description = "Identifier of the associated patient")
    @Column(name = "patient_id", nullable = false)
    private long patientId;

    @Schema(description = "Identifier of the doctor who recorded the history")
    @Column(name = "id_doctor", nullable = false)
    private long doctorId;

    @Schema(description = "Date when the record was made")
    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_record", nullable = false)
    private LocalDate dateOfRecord;

    @Schema(description = "Diagnosis of the patient")
    @Column(name = "diagnosis", nullable = false, length = 500)
    private String diagnosis;

    @Schema(description = "Recommended treatment for the patient")
    @Column(name = "treatment", nullable = false, length = 500)
    private String treatment;

    @Schema(description = "Additional notes from the doctor")
    @Column(name = "additional_notes", length = 1000)
    private String additionalNotes;
}
