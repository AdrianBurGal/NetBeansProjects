package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_06 {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

    }
}
