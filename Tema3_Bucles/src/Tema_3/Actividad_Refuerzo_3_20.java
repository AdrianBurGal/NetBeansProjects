package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_20 {

    public static void main(String[] args) {

        int altura = 0;
        char caracter;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura de la pirámide: ");
        altura = teclado.nextInt();

        System.out.print("Introduzca el carácter para pintar la pirámide: ");
        caracter = teclado.next().charAt(0);

        for (int fila = 1; fila <= altura; fila++) {
   
            for (int blancos1 = 1; blancos1 <= altura - fila; blancos1++) {

                System.out.print(" ");
            }

            for (int columna = 1; columna <= fila; columna++) {
                   
                    if (columna == 1 || fila == altura || fila == columna) {
                      System.out.print(caracter + " ");
                 }
                    else {
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }

    }
}
