package com.SchoolManagement.SystemManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FirstName", nullable = false)
    private String FirstName;

    @Column(name = "LastName", nullable = false)
    private String LastName;

    @Column(name = "Image", nullable = false)
    private String Image;

    @Column(name = "DateOfBirth", nullable = false)
    private Date DateOfBirth;

    @Column(name = "RegistrationNumber", nullable = false)
    private Integer RegistrationNumber;
}
