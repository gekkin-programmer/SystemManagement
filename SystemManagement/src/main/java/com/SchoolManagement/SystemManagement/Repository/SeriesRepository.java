package com.SchoolManagement.SystemManagement.Repository;

import com.SchoolManagement.SystemManagement.Entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, String> {
}
