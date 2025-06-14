package com.sgap.app.classes;

// Modelo de datos para una falta
public class Falta {
    private String fecha;
    private String asignatura;
    private String estado;

    public Falta(String fecha, String asignatura, String estado) {
        this.fecha = fecha;
        this.asignatura = asignatura;
        this.estado = estado;
    }

    public String getFecha() { return fecha; }
    public String getAsignatura() { return asignatura; }
    public String getEstado() { return estado; }
}
