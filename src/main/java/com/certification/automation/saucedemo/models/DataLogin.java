package com.certification.automation.saucedemo.models;

public class DataLogin {
    private String userName;
    private String password;
    public DataLogin(String usuario, String contrasena) {
        this.userName = usuario;
        this.password = contrasena;
    }
    public String getUserName() {

        return userName;
    }
    public String getPassword()
    {
        return password;
    }
}
