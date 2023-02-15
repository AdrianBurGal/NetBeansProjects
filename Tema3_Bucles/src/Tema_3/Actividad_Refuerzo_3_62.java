package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_62 {

    public static void main(String[] args) {

        long numero, reservado, digito = 0, Afort = 0, NoAfort = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzaca un número positivo: ");
            numero = teclado.nextLong();
        } while (numero < 0);

        reservado = numero;
        while (numero > 0) {

            digito = numero % 10;
            numero = numero / 10;

            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                Afort++;
            } else {
                NoAfort++;
            }
        }

        if (Afort > NoAfort) {

            System.out.printf("El %d es afortunado. \n", reservado);

        } else {
            System.out.printf("El %d no es afortunado. \n", reservado);
        }
    }
}
