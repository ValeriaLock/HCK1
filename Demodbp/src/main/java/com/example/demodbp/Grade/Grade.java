package com.example.demodbp.Grade;

import com.example.demodbp.Alumno.Alumno;
import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Grade {
    @Id
    private Long id;
    @ManyToOne
    private Alumno alumno;
    private Long score;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
