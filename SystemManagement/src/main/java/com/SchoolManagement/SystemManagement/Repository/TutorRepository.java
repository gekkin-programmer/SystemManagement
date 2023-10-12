package com.SchoolManagement.SystemManagement.Repository;

import com.SchoolManagement.SystemManagement.Entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, String> {
}
