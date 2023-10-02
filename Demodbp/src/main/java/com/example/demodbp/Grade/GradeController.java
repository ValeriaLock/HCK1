package com.example.demodbp.Grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RequestMapping("/grades")
public class GradeController {
    @Autowired
    private GradeRepository gradeRepository;

    @GetMapping
    public List<Grade> obtenerGrades() {
        return gradeRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grade> obtenerGradePorId(@PathVariable Long id) {
        Optional<Grade> grade = gradeRepository.findById(id);
        if (grade.isPresent()) {
            return ResponseEntity.ok(grade.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/alumno/{alumnoId}")
    public List<Grade> obtenerGradesPorAlumno(@PathVariable Long alumnoId) {
        // Implementa la lógica
        return new ArrayList<>(); // Retorna una lista vacía por defecto
    }
}
