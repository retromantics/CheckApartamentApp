package com.example.checkapartament_app.model;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.ArrayList;

public class DeptoTerminacion {
    @Embedded
    public Departamento dpto;
    @Relation(
            parentColumn = "dptoId",
            entityColumn = "departamentoID"
    )
    public ArrayList<Terminacion> listadoTerminaciones;
}
