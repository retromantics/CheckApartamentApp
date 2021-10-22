package com.example.checkapartament_app.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "departamento_table")
public class Departamento {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "proyecto")
    private String proyecto;
    @ColumnInfo(name = "nro_departamento")
    private int nroDepartamento;
    @ColumnInfo(name = "direccion")
    private String direccion;
    @ColumnInfo(name = "terminacionL")
    private List<Terminacion> TerminacionL;
    @ColumnInfo(name = "estado_gral")
    private int estadoGeneral ;

    public Departamento() {
    }

    public Departamento(String proyecto, int nroDepartamento, String direccion, List<Terminacion> terminacionL, int estadoGeneral) {
        this.proyecto = proyecto;
        this.nroDepartamento = nroDepartamento;
        this.direccion = direccion;
        TerminacionL = terminacionL;
        this.estadoGeneral = estadoGeneral;
    }

    public Departamento(int id, String proyecto, int nroDepartamento, String direccion, List<Terminacion> terminacionL, int estadoGeneral) {
        this.id = id;
        this.proyecto = proyecto;
        this.nroDepartamento = nroDepartamento;
        this.direccion = direccion;
        TerminacionL = terminacionL;
        this.estadoGeneral = estadoGeneral;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public int getNroDepartamento() {
        return nroDepartamento;
    }

    public void setNroDepartamento(int nroDepartamento) {
        this.nroDepartamento = nroDepartamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Terminacion> getTerminacionL() {
        return TerminacionL;
    }

    public void setTerminacionL(List<Terminacion> terminacionL) {
        TerminacionL = terminacionL;
    }


    public int getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(int estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

}
