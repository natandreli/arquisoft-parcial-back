package com.udea.parcial.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Schema(description = "Details of the doctor")
public class IDoctorDTO {
    @Schema(description = "Full name of the doctor")
    private String name;

    @Schema(description = "Identification number of the doctor")
    private String identificationNumber;

    @Schema(description = "Specialty of the doctor")
    private String specialty;

    @Schema(description = "Phone number of the doctor")
    private String phone;

    @Schema(description = "Email of the doctor")
    private String email;
}
