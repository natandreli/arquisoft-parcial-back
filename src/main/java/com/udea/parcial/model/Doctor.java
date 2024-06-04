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
@Schema(description =  "Details of the doctor")
@Entity
public class Doctor implements Serializable {
    @Schema(description = "Autogenerated by the DB")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "doctor_id")
    private long doctorId;

    @Schema(description = "Full name of the doctor")
    @Column(name = "name", nullable = false)
    private String name;

    @Schema(description = "identification_number of the doctor")
    @Column(name = "identification_number", nullable = false, unique = true)
    private String identification_number;

    @Schema(description = "Specialty of the doctor")
    @Column(name = "specialty", nullable = false)
    private String specialty;

    @Schema(description = "Phone number of the doctor")
    @Column(name = "phone", nullable = false)
    private String phone;

    @Schema(description = "Email of the doctor")
    @Column(name = "email", nullable = false)
    private String email;
}