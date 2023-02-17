
package Actividad_Aplicacion_7_14;

public class Cambio {

    private static double[] dinero = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

    public static void calcularCambio(double precio, double pago) {

        double cambio = pago - precio;
        int indice = 0, veces;

        System.out.println("Cambio que se devuelve: " + cambio);

        while (cambio > 0.01) {

            veces = (int) (cambio / dinero[indice]);

            if (veces > 0) {
                System.out.println(veces + " x " + dinero[indice]);
            }

            cambio = cambio % dinero[indice];
            indice++;
        }
    }
}
