package Tema_3;

import java.util.Scanner;

public class Actividad_Aplicación_3_11 {

    public static void main(String[] args) {

        int numero, resto, contador = 0;
        long binario = 0;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = teclado.nextInt();

        while (numero > 0) {

            resto = numero % 2;

            binario = (resto * (long) Math.pow(10, contador++)) + binario;

            numero = numero / 2;
        }
        System.out.println(binario);
    }
}
