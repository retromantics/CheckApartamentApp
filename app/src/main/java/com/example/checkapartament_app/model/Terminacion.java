package com.example.checkapartament_app.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "terminacion_table")
public class Terminacion {
    @PrimaryKey(autoGenerate = true)
    private int terminacionId;
    @ColumnInfo(name = "nombre")
    private String nombre;
    @ColumnInfo(name = "valor")
    private int valor;
    @ColumnInfo(name = "estado")
    private Boolean estado;
    @ColumnInfo(name = "dptoId_FK")
    private int dptoId_FK;


    public Terminacion(String nombre, Boolean estado, int valor,int dptoId_FK) {
        this.nombre = nombre;
        this.estado = estado;
        this.valor = valor;
        this.dptoId_FK=dptoId_FK;
    }

    public int getId() {
        return terminacionId;
    }

    public void setId(int id) {
        this.terminacionId = id;
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

    public int getdptoId_FK() {
        return dptoId_FK;
    }

    public void setdptoId_FK(int dptoId_FK) {
        this.dptoId_FK = dptoId_FK;
    }
}
