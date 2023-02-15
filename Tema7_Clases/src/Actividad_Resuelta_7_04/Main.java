package Actividad_Resuelta_7_04;

public class Main {

    public static void main(String[] args) {

        CuentaCorriente cuenta = new CuentaCorriente("12345678A", "Adrián");
        cuenta.ingresarDinero(1000);
        System.out.println(cuenta.toString());

        if (cuenta.sacarDinero(50000000)) {
            System.out.println("La operación ha sido completada con éxito");
        } else {
            System.out.println("No se ha podido realizar con éxito");
        }

        System.out.println(cuenta.toString());

        if (cuenta.sacarDinero(1000)) {
            System.out.println("La operación ha sido completada con éxito");
        } else {
            System.out.println("No se ha podido realizar con éxito");
        }
    }
}
