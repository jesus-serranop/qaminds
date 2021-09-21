package com.qaminds;

public abstract class Persona {
    protected String nombre;
    protected String apellidos;

    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    protected String getNombre(){
        return nombre;
    }
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }

    protected String getApellidos(){
        return apellidos;
    }

    protected void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    protected abstract String obtenerNombre();
}
