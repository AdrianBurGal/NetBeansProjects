package tema4;

import java.util.Scanner;

public class Actividad_Resuelta_4_07 {

    public static boolean esPrimo(int numero) {

        boolean respuesta = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                respuesta = false;
            }
        }
        return respuesta;
    }

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = Math.abs(teclado.nextInt());

        System.out.println("¿Es primo? " + esPrimo(numero));

    }
}
