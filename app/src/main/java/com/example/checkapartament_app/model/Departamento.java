package com.example.checkapartament_app.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int id;
    private String proyecto;
    private int nroDepartamento;
    private String direccion;

    private ArrayList<Terminacion> TerminacionL;

    public Departamento() {
    }

    public Departamento(int id, String proyecto, int nroDepartamento, String direccion, ArrayList<Terminacion> terminacionL) {
        this.id = id;
        this.proyecto = proyecto;
        this.nroDepartamento = nroDepartamento;
        this.direccion = direccion;
        this.TerminacionL = terminacionL;
    }

    public Departamento(int id, String proyecto, int nroDepartamento, String direccion) {
        this.id = id;
        this.proyecto = proyecto;
        this.nroDepartamento = nroDepartamento;
        this.direccion = direccion;
        this.TerminacionL = new ArrayList<Terminacion>();
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

    public ArrayList<Terminacion> getTerminacionL() {
        return TerminacionL;
    }

    public void setTerminacionL(ArrayList<Terminacion> terminacionL) {
        this.TerminacionL = terminacionL;
    }
}
