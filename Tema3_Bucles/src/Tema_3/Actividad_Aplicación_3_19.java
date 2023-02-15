package Tema_3;

import java.util.Scanner;

public class Actividad_Aplicación_3_19 {

    public static void main(String[] args) {

        int numero, resultado = 0, resto;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número para hacer su raíz cuadrada. ");

        do {
            System.out.print("Introduzca un número positivo: ");
            numero = teclado.nextInt();
        } while (numero < 0);
       
        while (resultado * resultado <= numero) {
            resultado++;
        }
        resultado--;
        
        resto = numero - (resultado * resultado);
        
        System.out.println("La raíz cuadrada es: " + resultado);
        System.out.println("El resto es: " + resto);
    }
}