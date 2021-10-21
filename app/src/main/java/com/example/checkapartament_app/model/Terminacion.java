package com.example.checkapartament_app.model;

public class Terminacion {
    private String nombre;
    private int valor;
    private Boolean estado;

    public Terminacion(String nombre, Boolean estado, int valor) {
        this.nombre = nombre;
        this.estado = estado;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
