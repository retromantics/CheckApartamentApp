package com.example.checkapartament_app.model;


import android.nfc.FormatException;

public class User {

    private String email;
    private String password ;


    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws FormatException {
        if(!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")){
            throw new FormatException("Email Invalido");
        }else{
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        if(!password.equals("123Pass" )){
            throw new Exception("Contaseña Incorrecta");
        }else{
            this.password = password;
        }
    }
}
