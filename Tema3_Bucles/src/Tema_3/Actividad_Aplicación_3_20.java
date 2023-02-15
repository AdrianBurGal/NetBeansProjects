package Tema_3;

import java.util.Scanner;

public class Actividad_Aplicación_3_20 {

    public static void main(String[] args) {

        double dinero = 0, dineroTotal = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el dinero que tenga en la hucha, banco, bolsillos...");
        System.out.println("Si no quiere introducir más dinero introduzca el [0].");

        do {
            dinero = teclado.nextDouble();
            dineroTotal = dineroTotal + dinero;
            System.out.println("Introduzca más dinero si lo tienes.");
        } while (dinero > 0);

        System.out.println("El dinero total que tienes es de " + dineroTotal + " €.");

    }
}
