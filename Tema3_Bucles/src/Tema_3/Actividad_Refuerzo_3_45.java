package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_45 {

    public static void main(String[] args) {

        long numero, posicion, nuevoDigito, contador = 0, resto, nuevoNumero = 0, reverso = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca un número entero positivo: ");
            numero = teclado.nextLong();

            System.out.print("Introduzca la posición dentro del número: ");
            posicion = teclado.nextLong();

        } while (numero < 0 || posicion < 0);

        while (numero > 0) {
            resto = numero % 10;
            numero = numero / 10;
            reverso = (reverso * 10) + resto;
        }
        
        while (reverso > 0) {

            contador += 1;
            resto = reverso % 10;
            reverso = reverso / 10;

            if (contador == posicion) {
                System.out.print("Introduzca el nuevo dígito: ");
                nuevoDigito = teclado.nextLong();
                nuevoNumero = (nuevoNumero * 10) + nuevoDigito;
            } else {
                nuevoNumero = (nuevoNumero * 10) + resto;
            }
        }

        System.out.println(nuevoNumero);
    }
}
