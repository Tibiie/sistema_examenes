package com.sistema_examenes_backend.sistema_examenes_backend.modelos;

public class JwtRequest {
    private String username;
    private String password;

    public JwtRequest() {
    }

    public JwtRequest(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
