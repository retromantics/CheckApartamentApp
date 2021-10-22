package com.example.checkapartament_app.model;

import android.widget.ArrayAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Departamento implements Serializable {
    private int id;
    private String proyecto;
    private int nroDepartamento;
    private String direccion;

    private ArrayList<Terminacion> TerminacionL;
    private int estadoGeneral ;

    private String img;

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
        setTerminacion();

        this.estadoGeneral = 3;
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

    public int getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(int estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

    public void setTerminacion(){
        ArrayList<Terminacion> terminaciones = new ArrayList<Terminacion>();
        terminaciones.add(new Terminacion("Luces", 10, true));
        terminaciones.add(new Terminacion("Elementos de dormitorio", 20, false));
        terminaciones.add(new Terminacion("Elementos de cocina ", 30, false));
        terminaciones.add(new Terminacion("Elementos de baño", 40, false));
        terminaciones.add(new Terminacion("Estado de terminaciones", 1, false));
        this.setTerminacionL(terminaciones);

    }

    public int calcular(){
        int total =0;
        for (Terminacion t: this.getTerminacionL()) {
            if(t.getEstado()){
                total+= t.getValor();
            }
        }
        total = total * this.estadoGeneral;
        return total;
    }


}
