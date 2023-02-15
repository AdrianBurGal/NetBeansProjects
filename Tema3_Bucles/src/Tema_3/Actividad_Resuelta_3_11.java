package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_11 {

    public static void main(String[] args) {

        int numero = 0, factorial = 1;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca un número: ");
            numero = teclado.nextInt();
        } while (numero <= 0);

        for (int contador = 1; contador <= numero; contador++) {

            factorial = factorial * contador;        
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);

    }
}
