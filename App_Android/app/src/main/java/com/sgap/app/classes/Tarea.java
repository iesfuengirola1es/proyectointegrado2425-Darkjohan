package com.sgap.app.classes;

// Clase que representa una tarea asignada a un alumno
public class Tarea {
    private String estado;
    private String descripcion;
    private String fechaEntrega;

    public Tarea(String estado, String descripcion, String fechaEntrega) {
        this.estado = estado;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() { return estado; }
    public String getDescripcion() { return descripcion; }
    public String getFechaEntrega() { return fechaEntrega; }
}
