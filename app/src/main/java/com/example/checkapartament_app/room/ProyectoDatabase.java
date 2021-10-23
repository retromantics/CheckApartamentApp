package com.example.checkapartament_app.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.checkapartament_app.dao.DepartamentoDao;
import com.example.checkapartament_app.model.Departamento;
import com.example.checkapartament_app.model.Terminacion;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

@Database(entities ={ Departamento.class, Terminacion.class},version=1)
public abstract class ProyectoDatabase extends RoomDatabase {

    public static ProyectoDatabase instance;

    public abstract DepartamentoDao DepartamentoDao();

    public static synchronized ProyectoDatabase getInstance(Context context) {
        if(instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(), ProyectoDatabase.class,"project_db").build();
        }
        return instance;
    }
}
