package com.sistema_examenes_backend.sistema_examenes_backend.excepciones;

public class UsuarioFoundException extends Exception{

    public UsuarioFoundException(){
        super("El usuario con ese username ya existe, vuelva a intentarlo");
    }

    public UsuarioFoundException(String mensaje){
        super(mensaje);
    }
}
