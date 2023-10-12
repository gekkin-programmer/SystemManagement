package com.SchoolManagement.SystemManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Instructor")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FirstName", nullable = false)
    private String FirstName;

    @Column(name = "LastName", nullable = false)
    private String LastName;

    @Column(name = "RegistrationNumber", nullable = false)
    private Integer RegistrationNumber;

    @Column(name = "CNI", nullable = false)
    private String CNI;

    @Column(name = "Image", nullable = false)
    private String Image;

    @Column(name = "Email", nullable = false)
    private String Email;

    @Column(name = "PhoneNumber", nullable = false)
    private Integer PhoneNumber;
}
