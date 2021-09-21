package com.qaminds;

public class Empleado extends Persona implements DatosEmpleado {
    public int diasVacaciones;
    private double sueldo;

    public Empleado(String nombre, String apellidos){
       super(nombre, apellidos);
       this.diasVacaciones = DatosEmpleado.DIAS_VACACIONES;
       this.sueldo = DatosEmpleado.SUELDO_BASE_POR_DIA;
    }

    public Empleado(String nombre, String apellidos, float sueldo){
       this(nombre, apellidos);
       this.sueldo = sueldo;
    }

    public void imprimirNombre(){
        System.out.println("El nombre del empleado es: " + obtenerNombre());
    }

    @Override
    protected String obtenerNombre() {
        return this.getNombre() + " " + this.getApellidos();
    }

    @Override
    public void aumentaSueldo(double nuevoSueldo) {
        if(nuevoSueldo > this.sueldo){
            this.sueldo = nuevoSueldo;
            System.out.println("El empleado " + obtenerNombre() + " tuvo un aumento de sueldo, nuevo sueldo " + obtenSueldo());
        }else{
            System.out.println("El nuevo sueldo es menor al sueldo actual, no se puede aumentar el sueldo");
        }
    }

    @Override
    public void aumentaSueldo(int porcentaje) {
        if(porcentaje > 0 && porcentaje < 100){
            this.sueldo = this.sueldo + ((this.sueldo * porcentaje)/100);
            System.out.println("El empleado " + obtenerNombre() + " tuvo un aumento de sueldo del " + porcentaje + "%." + " Nuevo sueldo: " + obtenSueldo());
        }else{
            System.out.println("El nuevo sueldo es menor al sueldo actual, no se puede aumentar el sueldo");
        }
    }

    @Override
    public double obtenSueldo() {
        return this.sueldo;
    }

    @Override
    public double calculaPagoMensual() {
        return 30 * this.sueldo;
    }

    @Override
    public int diasVacacionesDisponibles() {
       return this.diasVacaciones;
    }

    @Override
    public void restaDiaVacacion(int dias) {
        if(this.diasVacaciones > 0 && this.diasVacaciones >= dias){
            this.diasVacaciones -= dias;
            System.out.println("Se descontaron " + dias + " dia(s) de vacaciones al empleado " + obtenerNombre() + " ahora cuenta con " + diasVacacionesDisponibles() + " dia(s) de vacaciones");

        }else{
            System.out.println("Vacaciones no aplicadas, el empleado " + obtenerNombre() + " solo cuenta con " + diasVacacionesDisponibles() + " dias de vacaciones");
        }
    }

    @Override
    public String toString(){
        String datos = "==================== DATOS DEL EMPLEADO ================================\n";
        datos += "El nombre del empleado es: " + obtenerNombre() + "\n";
        datos += "Su sueldo diario es de: " + obtenSueldo() + "\n";
        datos += "Su sueldo mensual es de: " + calculaPagoMensual() + "\n";
        datos += "Dias de vacaciones disponibles: " + diasVacacionesDisponibles() + "\n";
        datos += "========================================================================\n";
        return datos;
    }
}
