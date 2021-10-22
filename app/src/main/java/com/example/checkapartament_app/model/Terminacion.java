package com.example.checkapartament_app.model;

import java.io.Serializable;

public class Terminacion implements Serializable {
    private String nombre;
    private int valor;
    private Boolean estado;

    public Terminacion(String nombre, int valor,Boolean estado ){
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
