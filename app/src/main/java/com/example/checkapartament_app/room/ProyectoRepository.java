package com.example.checkapartament_app.room;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.checkapartament_app.dao.DepartamentoDao;
import com.example.checkapartament_app.model.Departamento;

public abstract class ProyectoRepository extends RoomDatabase {

    public static ProyectoRepository instance;

    public abstract DepartamentoDao DepartamentoDao();

    public static synchronized ProyectoRepository getInstance(Context context) {
        if(instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(),ProyectoRepository.class,"project_db").build();
        }
        return instance;
    }
}
