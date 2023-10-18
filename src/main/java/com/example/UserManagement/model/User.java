package com.example.UserManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @NotNull
    @Id
    private Integer userId;
    @NotBlank
    private String userName;
    private String address;

    @Pattern(regexp = "^\\d{2}-\\d{2}\\d{4}$")
    private String dateOfBirth;
    private String email;
    @NotBlank
    @Pattern(regexp = "^(\\+\\d{1,3})?\\d{10}$")
    private String phoneNumber;
    private LocalDate date;
    private LocalTime time;
}
