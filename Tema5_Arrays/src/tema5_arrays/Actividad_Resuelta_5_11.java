package tema5_arrays;

import java.util.Arrays;
import java.util.Scanner;
import static tema5_arrays.BibliotecaArrays.compararArrays;

public class Actividad_Resuelta_5_11 {

    public static void creaContraseña(int[] contraseña, int inicio, int fin) {

        for (int indice = 0; indice < contraseña.length; indice++) {
            contraseña[indice] = (int) (Math.random() * fin + inicio);
        }
    }

    public static void leeContraseña(int[] tabla) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("\nIntroduzca los dígitos. ");
        for (int indice = 0; indice < tabla.length; indice++) {
            tabla[indice] = teclado.nextInt();
        }
    }

    public static void pistas(int[] contraseña, int[] combJugador) {

        for (int indice = 0; indice < contraseña.length; indice++) {

            if (contraseña[indice] > combJugador[indice]) {
                System.out.printf("Dígito %d: Dígito mayor\n", indice);
            } else if (contraseña[indice] < combJugador[indice]) {
                System.out.printf("Dígito %d: Dígito menor\n", indice);
            } else {
                System.out.printf("Dígito %d: Dígito igual\n", indice);
            }
        }
    }

    public static void main(String[] args) {

        int longitud;

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿De cuánta longitud quieres la combinación de la 'cámara secreta'? ");
        longitud = teclado.nextInt();

        int[] contraseña = new int[longitud];
        int[] combJugador = new int[longitud];

        creaContraseña(contraseña, 1, 5);
        System.out.print(Arrays.toString(contraseña));

        do {
            leeContraseña(combJugador);
            pistas(contraseña, combJugador);
        } while (!compararArrays(contraseña, combJugador));

        System.out.println("!Has ganado! 'Cámara secreta' abierta.");
    }
}
