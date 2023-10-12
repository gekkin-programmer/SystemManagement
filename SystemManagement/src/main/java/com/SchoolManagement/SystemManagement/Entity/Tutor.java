package com.SchoolManagement.SystemManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Tutor")
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FullName", nullable = false)
    private String FullName;

    @Column(name = "Type", nullable = false)
    private String Type;

    @Column(name = "Email", nullable = false)
    private String Email;

    @Column(name = "PhoneNumber", nullable = false)
    private Integer PhoneNumber;
}
