
package tema2;

import java.util.Scanner;

public class Actividad_2_04 {

    public static void main(String[] args) {

        double numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = teclado.nextDouble();

        if (-1 < numero && numero < 1 && numero != 0) {

            System.out.println("El número es casi-cero.");

        } else {

            System.out.println("El número no es casi-cero.");
        }

    }

}
   
