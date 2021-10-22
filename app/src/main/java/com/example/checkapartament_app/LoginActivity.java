package com.example.checkapartament_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.nfc.FormatException;
import android.os.Bundle;
import android.widget.Toast;

import com.example.checkapartament_app.databinding.LoginMainBinding;
import com.example.checkapartament_app.model.User;
import com.google.android.material.textfield.TextInputLayout;

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
                //Toast.makeText(this, "OK", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),SegundoActivity.class);
                startActivity(i);
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
}