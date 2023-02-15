package Actividad_Aplicacion_7_15;

public class Main {

    public static void main(String[] args) {

        boolean iguales;
        Calendario fecha1 = new Calendario(15, 02, 2023);

        fecha1.mostrar();

        fecha1.incrementarDia();
        fecha1.incrementarMes();
        fecha1.incrementarAño();

        fecha1.mostrar();

        Calendario fecha2 = new Calendario(16, 03, 2024);

        iguales = fecha1.iguales(fecha2);

        System.out.println("¿Las fechas son iguales? " + iguales);

    }

}
