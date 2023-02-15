package tema4;

import java.util.Scanner;

import static tema4.Actividad_Aplicación_4_16.esPrimo;

public class Actividad_Refuerzo_4_15 {

    public static void main(String[] args) {

        int inicio, fin;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        inicio = teclado.nextInt();

        System.out.print("Introduzca un número: ");
        fin = teclado.nextInt();

        for (int numero = inicio; numero <= fin; numero++) {

            if (esPrimo(numero)) {

                System.out.println(numero);

            }
        }
    }
}
