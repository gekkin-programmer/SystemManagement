package com.SchoolManagement.SystemManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name", nullable = false)
    private String Name;

    @Column(name = "Coef", nullable = false)
    private Integer Coef;
}
