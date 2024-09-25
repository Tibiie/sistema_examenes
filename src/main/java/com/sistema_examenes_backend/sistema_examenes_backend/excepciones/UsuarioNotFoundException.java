package com.sistema_examenes_backend.sistema_examenes_backend.excepciones;

public class UsuarioNotFoundException extends Exception{
    public UsuarioNotFoundException(){
        super("El usuario con ese username no existe, vuelva a intentarlo");
    }

    public UsuarioNotFoundException(String mensaje){
        super(mensaje);
    }
}
