package com.example.demodbp.Alumno;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlumnoRepository extends JpaRepository<Alumno,Long> {
    Optional<Alumno> findAlumnoBy();
}
