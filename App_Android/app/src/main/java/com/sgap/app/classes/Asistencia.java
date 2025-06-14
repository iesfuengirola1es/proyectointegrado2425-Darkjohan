package com.sgap.app.classes;

// Modelo de datos para una falta
public class Asistencia {
    private String fecha;
;
    private String estado;

    public Asistencia(String fecha, String estado) {
        this.fecha = fecha;

        this.estado = estado;
    }

    public String getFecha() { return fecha; }

    public String getEstado() { return estado; }
}
