package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_36 {

    public static void main(String[] args) {

        long numero, reverso = 0, resto, reservado;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.print("Introduzca un número entero positivo: ");
            numero = teclado.nextLong();

        } while (numero < 0);

        reservado = numero;
        while (reservado > 0) {
            resto = reservado % 10;
            reservado = reservado / 10;
            reverso = (reverso * 10) + resto;
        }

        if (numero == reverso) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }

    }
}
