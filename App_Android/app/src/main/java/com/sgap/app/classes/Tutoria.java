package com.sgap.app.classes;

// Clase que representa una tutoría entre padre y docente
public class Tutoria {
    private String motivo;
    private String fecha;
    private String hora;
    private String estado;

    public Tutoria(String motivo, String fecha, String hora, String estado) {
        this.motivo = motivo;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public String getMotivo() { return motivo; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getEstado() { return estado; }
}

