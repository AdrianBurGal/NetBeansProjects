package Tema_3;

import java.util.Scanner;

public class Prueba_2 {

    public static void main(String[] args) {

        int numero, numInvertido = 0, ultimaCifra;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        numero = teclado.nextInt();

        numero = Math.abs(numero);

        while (numero > 0) {

            ultimaCifra = numero % 10;
            numInvertido = numInvertido * 10 + ultimaCifra;
            numero = numero / 10;

        }

        System.out.println("El número dado la vuelta será: " + numInvertido);
    }
}
