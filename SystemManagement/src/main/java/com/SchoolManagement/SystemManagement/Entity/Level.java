package com.SchoolManagement.SystemManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Level")
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name", nullable = false)
    private String Name;

    @Column(name = "Type", nullable = false)
    private Enum Type;

    @Column(name = "Master", nullable = false)
    private Enum  Master;



}
