package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_09 {

    public static void main(String[] args) {

        int numero, resultado;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca un número entre [1-10]: ");
            numero = teclado.nextInt();
        } while (numero < 0 || numero > 10);

        for (int contador = 0; contador <= 10; contador++) {

            resultado = numero * contador;
            System.out.println(resultado);
        }
    }
}
