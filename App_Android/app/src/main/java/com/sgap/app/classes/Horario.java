package com.sgap.app.classes;


// Modelo de un bloque del horario
public class Horario {
    private String dia;
    private String asignatura;
    private String hora;

    public Horario(String dia, String asignatura, String hora) {
        this.dia = dia;
        this.asignatura = asignatura;
        this.hora = hora;
    }

    public String getDia() { return dia; }
    public String getAsignatura() { return asignatura; }
    public String getHora() { return hora; }
}
