package com.example.checkapartament_app.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.checkapartament_app.model.Terminacion;

import java.util.List;

@Dao
public interface TerminacionDao {

    @Insert
    void add(Terminacion t);
    @Update
    void update(Terminacion t);
    @Delete
    void delete(Terminacion t);
    @Query("select terminacionId, nombre,valor,estado from terminacion_table")
    List<Terminacion> listar();
    @Query("select terminacionId,  nombre,valor,estado from terminacion_table where terminacionId= :id")
    Terminacion buscar(int id);

    /*@Insert
    void add(TerminacionSingle t);
    @Update
    void update(TerminacionSingle t);
    @Delete
    void delete(TerminacionSingle t);
    @Query("select id, nombre,valor,estado from Terminacion")
    List<TerminacionSingle> listar();
    @Query("select id,  nombre,valor,estado from Terminacion where id= :id")
    TerminacionSingle buscar(int id);*/

}
