package com.example.checkapartament_app.model;

import java.util.List;

public class Departamento {
    private int id;
    private String proyecto;
    private int nroDepartamento;
    private String direccion;

    private List<Terminacion> TerminacionL;

    public Departamento() {
    }

    public Departamento(String proyecto, int nroDepartamento, String direccion, List<Terminacion> terminacionL) {
        this.proyecto = proyecto;
        this.nroDepartamento = nroDepartamento;
        this.direccion = direccion;
        TerminacionL = terminacionL;
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
}
