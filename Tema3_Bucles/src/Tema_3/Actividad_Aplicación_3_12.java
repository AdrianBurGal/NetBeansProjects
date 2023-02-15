package Tema_3;

import java.util.Scanner;

public class Actividad_Aplicación_3_12 {

    public static void main(String[] args) {

        int numero = 0, binario, resto, contador = -1;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un código binario: ");
        binario = teclado.nextInt();

        while (binario > 0) {

            resto = binario % 10;

            contador = contador + 1;
            if (resto == 1) {
                numero = (int) Math.pow(2, contador) + numero;
            }

            binario = binario / 10;
        }
        System.out.println(numero);
    }
}
