package com.SchoolManagement.SystemManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table (name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FirstName", nullable = false)
    private String FirstName;

    @Column(name = "LastName", nullable = false)
    private String LastName;

    @Column(name = "Email", nullable = false)
    private String Email;

    @Column(name = "PhoneNumber", nullable = false)
    private Integer PhoneNUmber;

    @Column(name = "Image", nullable = false)
    private String Image;

    @Column(name = "Updated_At", nullable = false)
    private LocalDateTime Updated_At;

    @Column(name = "Created_At", nullable = false)
    private LocalDateTime Created_At;

}


