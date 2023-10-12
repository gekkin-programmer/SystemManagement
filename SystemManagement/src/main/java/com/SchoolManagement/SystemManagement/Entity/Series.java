package com.SchoolManagement.SystemManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.text.DecimalFormat;

@Data
@Entity
@Table(name = "Series")
public class Series {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name", nullable = false)
    private String Name;

    @Column(name = "RegistrationFee", nullable = false)
    private DecimalFormat RegistrationFee;

    @Column(name = "FirstInstalment", nullable = false)
    private DecimalFormat FirstInstalment;

    @Column(name = "SecondInstalment", nullable = false)
    private DecimalFormat SecondInstalment;
}
