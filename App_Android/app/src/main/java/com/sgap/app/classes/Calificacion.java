package com.sgap.app.classes;

public class Calificacion {
    private String asignatura;
    private String nota;

    public Calificacion(String asignatura, String nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getNota() {
        return nota;
    }
}
