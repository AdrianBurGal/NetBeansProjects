package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_35 {

    public static void main(String[] args) {

        int altura;

        Scanner teclado = new Scanner(System.in);

        do {
            
            System.out.print("Introduzca una altura impar de la X: ");
            altura = teclado.nextInt();
            
        } while (altura % 2 == 0 || altura < 3);

        for (int filas = 1; filas <= altura; filas++) {
            for (int columnas = 1; columnas <= altura; columnas++) {
                if (filas == columnas || filas + columnas == altura + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
