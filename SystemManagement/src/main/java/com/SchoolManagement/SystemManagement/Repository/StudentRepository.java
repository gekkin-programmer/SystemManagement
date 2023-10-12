package com.SchoolManagement.SystemManagement.Repository;

import com.SchoolManagement.SystemManagement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
