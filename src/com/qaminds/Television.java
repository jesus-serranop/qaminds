package com.qaminds;

public class Television {

    public Television(){
        System.out.println("No hay tv");
    }

    public Television(String marca, int tamano, double precio){
        System.out.println("La tv de la marca " + marca + " con el tamano " + tamano + " a el precio de " + precio);
    }

    public Television(String marca, int tamano, double precio, String tipo){
        this(marca,tamano, precio );
        System.out.println("De tipo " + tipo);
    }
}
