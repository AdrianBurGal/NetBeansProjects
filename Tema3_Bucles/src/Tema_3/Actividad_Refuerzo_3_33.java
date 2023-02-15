package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_33 {

    public static void main(String[] args) {

        int altura;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.print("Introduzca la altura de la U: ");
            altura = teclado.nextInt();

        } while (altura < 0);

        for (int filas = 1; filas <= altura; filas++) {
            //System.out.print(filas);
            for (int columnas = 1; columnas <= altura; columnas++) {
                //System.out.print(columnas);
                if (filas == altura && columnas == 1 || filas == columnas && filas == altura) {
                    System.out.print("  ");
                } else if (columnas == 1 || columnas == altura || filas == altura) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
