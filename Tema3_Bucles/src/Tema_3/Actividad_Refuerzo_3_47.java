package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_47 {

    public static void main(String[] args) {

        int altura;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.print("Introduzaca una altura impar mayor o igual a 5: ");
            altura = teclado.nextInt();

        } while (altura < 5 || altura % 2 == 0);

        for (int filas = 1; filas <= altura; filas++) {
            for (int columnas = 1; columnas <= 6; columnas++) {

                if (columnas == 1 || columnas == 6 || filas == 1 || filas == altura || filas == (altura + 1) / 2) {
                    System.out.print("M");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
