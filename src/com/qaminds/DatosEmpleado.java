package com.qaminds;

public interface DatosEmpleado {
   int DIAS_VACACIONES = 12;
   double SUELDO_BASE_POR_DIA = 500.00;

   double calculaPagoMensual();
   void aumentaSueldo(double nuevoSueldo);
   void aumentaSueldo(int porcentaje);
   double obtenSueldo();
   int diasVacacionesDisponibles();
   void restaDiaVacacion(int dias);

}
