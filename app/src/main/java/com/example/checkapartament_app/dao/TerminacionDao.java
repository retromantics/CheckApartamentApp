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
    @Query("select id, nombre,valor,estado from terminacion_table")
    List<Terminacion> listar();
    @Query("select id,  nombre,valor,estado from terminacion_table where id= :id")
    Terminacion buscar(int id);

}
