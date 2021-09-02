package com.qaminds;

public class Television {

    private String marca;
    private int tamano;
    private double precio;
    private String tipo;
    Television tv = new Television();

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

    public void setTv(Television tv) {
        this.tv = tv;
    }

    public Television getTv(){
        return this.tv;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setTamano(int tamano){
        this.tamano = tamano;
    }

    public int getTamano(){
        return this.tamano;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }


}
