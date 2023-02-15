package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_49 {

    public static void main(String[] args) {

        int num = 0, maximo = -1000, minimo = 1000, media, total = 0, contador = 2;
        boolean primo = false;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca números enteros positivos. Con un número primo acaba el programa. ");
        num = Math.abs(teclado.nextInt());

        while ((primo) && (contador!=num)){
            if (num % contador == 0)
                primo = false;
                contador++;
            }
        
        
        while (num % contador != 0 && contador < num) {
            total = total + num;
            contador++;

            if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
                maximo = maximo < num ? num : maximo;
                minimo = minimo > num ? num : minimo;

                num = Math.abs(teclado.nextInt());
            }

            System.out.printf("Has introducido %d números no primos.\n", contador);
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + total / contador);
        }

    }
}