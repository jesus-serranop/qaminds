package com.qaminds;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Empleado empleado =  new Empleado("Jesus", "Serrano");
        empleado.imprimirNombre();
        empleado.aumentaSueldo(800.00);
        empleado.restaDiaVacacion(5);
        empleado.aumentaSueldo(10);
        System.out.println(empleado.toString());


        Empleado empleado2 =  new Empleado("Miguel", "Ruiz", 1200);
        empleado2.imprimirNombre();
        empleado2.restaDiaVacacion(1);
        empleado2.aumentaSueldo(50);
        System.out.println(empleado2.toString());

    }
}
