package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_15 {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = teclado.nextInt();

        for (int fila = 1; fila <= numero; fila++) {
            for (int columna = fila; columna <= numero; columna++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
