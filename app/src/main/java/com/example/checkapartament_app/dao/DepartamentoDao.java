package com.example.checkapartament_app.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.checkapartament_app.model.Departamento;
import com.example.checkapartament_app.model.DeptoTerminacion;

import java.util.List;

@Dao
public interface DepartamentoDao {
    @Insert
    void add(Departamento d);
    @Update
    void update(Departamento d);
    @Delete
    void delete(Departamento d);
    @Query("select dptoId, proyecto, nro_departamento,  direccion,  terminacionL,  estado_gral from departamento_table")
    List<Departamento> list();
    @Query("select  dptoId, proyecto, nro_departamento,  direccion,  terminacionL,  estado_gral from departamento_table where dptoId= :id")
    Departamento search(int id);
    @Transaction
    @Query("SELECT * FROM departamento_table")
    List<DeptoTerminacion> getTerminaciones();

}
