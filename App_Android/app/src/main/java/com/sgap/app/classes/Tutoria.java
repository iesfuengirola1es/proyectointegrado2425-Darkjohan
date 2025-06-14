package com.sgap.app.classes;

// Clase que representa una tutoría entre padre y docente
public class Tutoria {
    private String asignatura;
    private String fecha;
    private String hora;
    private String estado;

    public Tutoria(String asignatura, String fecha, String hora, String estado) {
        this.asignatura = asignatura;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public String getAsignatura() { return asignatura; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getEstado() { return estado; }
}

