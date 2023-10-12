package com.SchoolManagement.SystemManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Created_At", nullable = false)
    private LocalDateTime Created_At;

    @Column(name = "Updated_At", nullable = false)
    private LocalDateTime Updated_At;
}
