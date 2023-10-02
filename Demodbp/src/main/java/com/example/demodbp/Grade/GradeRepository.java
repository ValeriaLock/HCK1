package com.example.demodbp.Grade;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface GradeRepository extends JpaRepository<Grade, Id> {
    Optional<Grade> findById(Long id);
}
