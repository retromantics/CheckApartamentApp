package com.example.checkapartament_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.nfc.FormatException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.example.checkapartament_app.databinding.LoginMainBinding;
import com.example.checkapartament_app.model.Departamento;
import com.example.checkapartament_app.model.User;
import com.example.checkapartament_app.repository.DepartamentoRepository;
import com.example.checkapartament_app.ui.ListActivity;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoginActivity extends AppCompatActivity {

    LoginMainBinding b;
    boolean estado=true;
    int intentos =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = LoginMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        b.btnLogin.setOnClickListener(v -> {

            b.txtEmail.setError(null);
            b.txtPass.setError(null);

            String email =  b.txtEmail.getEditText().getText().toString().trim() ;
            String pwd    =   b.txtPass.getEditText().getText().toString().trim();


            User u = new User();

            try {
                u.setEmail(email);
            } catch (FormatException e) {
                b.txtEmail.getEditText().setError(e.getMessage());
                estado=false;
            }

            try {
                u.setPassword(pwd);
            } catch (Exception e) {
                b.txtPass.getEditText().setError(e.getMessage());
                estado=false;
                intentos++;
                validaIntentos();
            }

            if(true){
                ArrayList<Departamento> listado = new ArrayList<>();
                listado.add(new Departamento("p1",23,"los jazmines 222",1));
                listado.add( new Departamento("p2",101,"AV ossa 45",3));
                listado.add( new Departamento("p3",45,"Grecia 1556",2));
                listado.add( new Departamento("p4",56,"Milan 123",1));

                DepartamentoRepository repo = new DepartamentoRepository(getApplication());

                ExecutorService ex = Executors.newSingleThreadExecutor();
                Handler h = new Handler(Looper.getMainLooper());

                ex.execute(()->{
                    for (Departamento d: listado) {
                        repo.add(d);
                    }
                    h.post(()->{
                        Intent i = new Intent(getApplicationContext(), ListActivity.class);
                        startActivity(i);

                    });
                });
            }


        });
    }

    void validaIntentos(){
        if(intentos >=3){
            Toast.makeText(this, "Maximo de intentos excedido. Reinicie la aplicacion " +
                    "e intente nuevamente", Toast.LENGTH_LONG).show();
            b.btnLogin.setEnabled(false);
        }
    }

    void inserta(){
        ArrayList<Departamento> listado = new ArrayList<>();
        listado.add(new Departamento("p1",23,"los jazmines 222",1));
        listado.add( new Departamento("p2",101,"AV ossa 45",3));
        listado.add( new Departamento("p3",45,"Grecia 1556",2));
        listado.add( new Departamento("p4",56,"Milan 123",1));

        DepartamentoRepository repo = new DepartamentoRepository(getApplication());

        ExecutorService ex = Executors.newSingleThreadExecutor();
        Handler h = new Handler(Looper.getMainLooper());

        ex.execute(()->{
            for (Departamento d: listado) {
                repo.add(d);
            }
            h.post(()->{

            });
        });

    }
}