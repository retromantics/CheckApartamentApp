package com.example.checkapartament_app.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.checkapartament_app.model.Departamento;
import com.example.checkapartament_app.model.Terminacion;

import java.util.List;

@Dao
public interface DepartamentoDao {
    @Insert
    void add(Departamento d);
    @Update
    void update(Departamento d);
    @Delete
    void delete(Departamento d);
    @Query("select id, proyecto, nro_departamento,  direccion,  terminacionL,  estado_gral from departamento_table")
    List<Departamento> listar();
    @Query("select  id, proyecto, nro_departamento,  direccion,  terminacionL,  estado_gral from departamento_table where id= :id")
    Departamento buscar(int id);
}
