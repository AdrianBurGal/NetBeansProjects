package Tema_3;

import java.util.Scanner;

public class Actividad_Aplicación_3_14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int j = 2, num, contador = 0;
        boolean primo = true;

        System.out.println("Introduzca un numero: ");
        num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            while (j <= i - 1 && primo == true) {
                if (i % j == 0) {
                    primo = false;
                }
                j++;
            }
            if (primo == true) {
                contador++;
                System.out.println(i + " es primo");
            }
        }
        System.out.println("En el rango 1... " + num + " hay " + contador + " numeros primos");

    }

}
