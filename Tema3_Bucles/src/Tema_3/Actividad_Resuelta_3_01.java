package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_01 {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();

        while (numero != 0) {

            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }

            if (numero >= 0) {
                System.out.println("El número es positivo.");
            } else {
                System.out.println("El número es negativo.");
            }

            System.out.println("Su cuadrado es: " + (numero * numero));
            
            System.out.println("-----------------------------------");
            
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();
            
        }

    }
}
