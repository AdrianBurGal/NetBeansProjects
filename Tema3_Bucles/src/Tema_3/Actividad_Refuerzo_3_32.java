package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_32 {

    public static void main(String[] args) {

        long numero, resto, reverso = 0, sumaResto = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = Math.abs(teclado.nextLong());

        while (numero > 0) {
            resto = numero % 10;
            numero = numero / 10;
            reverso = (reverso * 10) + resto;
        }

        while (reverso > 0) {
            resto = reverso % 10;
            reverso = reverso / 10;
            if (resto % 2 == 0) {
                sumaResto = sumaResto + resto;
                System.out.printf("El dígito %d es par.\n", resto);
            }
        }
        System.out.println("La suma de todos los pares es " + sumaResto);
    }
}
