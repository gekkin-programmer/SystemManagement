package com.SchoolManagement.SystemManagement.Repository;

import com.SchoolManagement.SystemManagement.Entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, String> {
}
