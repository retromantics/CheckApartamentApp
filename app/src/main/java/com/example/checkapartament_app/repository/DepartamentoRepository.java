package com.example.checkapartament_app.repository;

import android.app.Application;

import com.example.checkapartament_app.model.Departamento;
import com.example.checkapartament_app.model.DeptoTerminacion;
import com.example.checkapartament_app.model.Terminacion;
import com.example.checkapartament_app.room.ProyectoDatabase;

import java.util.List;

public class DepartamentoRepository {

    private ProyectoDatabase db;

    public DepartamentoRepository(Application application){
        this.db= ProyectoDatabase.getInstance(application);
    }

    public void add(Departamento d){
        db.DepartamentoDao().add(d);
    }
    public void update(Departamento d){
        db.DepartamentoDao().update(d);
    }
    public void delete(Departamento d){
        db.DepartamentoDao().delete(d);
    }
    public List<Departamento> list(){
        return db.DepartamentoDao().list();
    }
    public Departamento search(int id){
        return db.DepartamentoDao().search(id);
    }

    //public List<DeptoTerminacion> getTerimnaciones(){return db.DepartamentoDao().getTerminaciones();}

}
