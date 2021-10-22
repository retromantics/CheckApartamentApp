package com.example.checkapartament_app.room;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.checkapartament_app.dao.DepartamentoDao;

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
