package Tema_3;

import java.util.Scanner;

public class AñadirDigito {

    public static void main(String[] args) {

        long numero, posicion, nuevoDigito, contador = 0, resto, nuevoNumero = 0, reservado, ceros = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca un número entero positivo: ");
            numero = teclado.nextLong();

            System.out.print("Introduzca la posición dentro del número: ");
            posicion = teclado.nextLong();

        } while (numero < 0 || posicion < 0);

        nuevoNumero = numero;
        while (numero > 0) {
            numero = numero / 10;
            contador += 1;
          
        }

        contador = contador + 1;
        while (contador > 0){
        
        ceros = (int) Math.pow(10, contador--);
        
        resto = nuevoNumero % ceros;
        nuevoNumero = nuevoNumero / ceros;
        System.out.println(nuevoNumero);
        
        if (contador == posicion) {
                System.out.print("Introduzca el nuevo dígito: ");
                nuevoDigito = teclado.nextLong();
                nuevoNumero = nuevoNumero + nuevoDigito * ceros;
            } else {
                nuevoNumero = nuevoNumero + resto * ceros;
        
        }
    }
                System.out.println(nuevoNumero);
        
    }
}
