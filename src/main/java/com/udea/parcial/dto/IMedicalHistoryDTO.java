package com.udea.parcial.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Schema(description = "Details of the medical history")
public class IMedicalHistoryDTO {
    @Schema(description = "Identification Number of the associated patient")
    private String identificationNumber;

    @Schema(description = "Identifier of the doctor who recorded the history")
    private long doctorId;

    @Schema(description = "Date when the record was made")
    private LocalDate dateOfRecord;

    @Schema(description = "Diagnosis of the patient")
    private String diagnosis;

    @Schema(description = "Recommended treatment for the patient")
    private String treatment;

    @Schema(description = "Additional notes from the doctor")
    private String additionalNotes;
}
