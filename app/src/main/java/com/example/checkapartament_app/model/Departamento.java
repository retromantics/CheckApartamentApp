package com.example.checkapartament_app.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "departamento_table")
public class Departamento {
    @PrimaryKey(autoGenerate = true)
    private int dptoId;
    @ColumnInfo(name = "proyecto")
    private String proyecto;
    @ColumnInfo(name = "nro_departamento")
    private int nroDepartamento;
    @ColumnInfo(name = "direccion")
    private String direccion;
    @ColumnInfo(name = "terminacionL")
    private ArrayList<Terminacion> TerminacionL;
    @ColumnInfo(name = "estado_gral")
    private int estadoGeneral ;

//    @ColumnInfo(name = "terminacionesL")
//    private List<DeptoTerminacion> terminacionesL ;
//
//    public Departamento(String proyecto, int nroDepartamento, String direccion, List<Terminacion> terminacionL, int estadoGeneral, List<DeptoTerminacion> terminacionesL) {
//        this.proyecto = proyecto;
//        this.nroDepartamento = nroDepartamento;
//        this.direccion = direccion;
//        TerminacionL = terminacionL;
//        this.estadoGeneral = estadoGeneral;
//        this.terminacionesL = terminacionesL;
//    }

    @Ignore
    public Departamento(String proyecto, int nroDepartamento, String direccion, int estadoGeneral) {
        this.proyecto = proyecto;
        this.nroDepartamento = nroDepartamento;
        this.direccion = direccion;
        TerminacionL = new ArrayList<Terminacion>() ;
        this.estadoGeneral = estadoGeneral;
    }

    @Ignore
    public Departamento(int dptoId, String proyecto, int nroDepartamento, String direccion, List<Terminacion> terminacionL, int estadoGeneral) {
        this.dptoId = dptoId;
        this.proyecto = proyecto;
        this.nroDepartamento = nroDepartamento;
        this.direccion = direccion;
        TerminacionL = new ArrayList<Terminacion>() ;;
        this.estadoGeneral = estadoGeneral;
    }

    public int getdptoId() {
        return dptoId;
    }

    public void setdptoId(int id) {
        this.dptoId = id;
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

    public void setTerminacionL(ArrayList<Terminacion> terminacionL) {TerminacionL = terminacionL; }


    public int getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(int estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

//    public List<DeptoTerminacion> getTerminacionesL() {
//        return terminacionesL;
//    }
//
//    public void setTerminacionesL(List<DeptoTerminacion> terminacionesL) {
//        this.terminacionesL = terminacionesL;
//    }
}
