package com.sgap.app.classes;

// Clase que representa una tarea asignada a un alumno
public class Tarea {
    private String asignatura;
    private String descripcion;
    private String fechaEntrega;

    public Tarea(String asignatura, String descripcion, String fechaEntrega) {
        this.asignatura = asignatura;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
    }

    public String getAsignatura() { return asignatura; }
    public String getDescripcion() { return descripcion; }
    public String getFechaEntrega() { return fechaEntrega; }
}
