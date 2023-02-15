package tema5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Refuerzo_5_15 {

    public static void main(String[] args) {

        int[] ocupacion = new int[10];
        int[] mesas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int personas, indice = 0;
        boolean bandera;

        Scanner teclado = new Scanner(System.in);

        for (int contador = 0; contador < ocupacion.length; contador++) {
            ocupacion[contador] = (int) (Math.random() * 4);
        }

        do {

            System.out.println("\nMesas nº  " + Arrays.toString(mesas));
            System.out.println("Ocupación " + Arrays.toString(ocupacion));

            System.out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
            personas = teclado.nextInt();

            bandera = true;

            for (int mesa = 0; mesa < ocupacion.length; mesa++) {
                if ((personas + ocupacion[mesa]) <= 4 && bandera) {
                    System.out.println("Por favor, siéntese en la mesa número " + (mesa + 1));
                    bandera = false;
                    indice = mesa;
                }
            }

            ocupacion[indice] = ocupacion[indice] + personas;

        } while (personas > 0);

    }
}
