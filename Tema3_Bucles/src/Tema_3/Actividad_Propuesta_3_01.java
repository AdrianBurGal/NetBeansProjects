package Tema_3;

import java.util.Scanner;

public class Actividad_Propuesta_3_01 {

    public static void main(String[] args) {

        int edadMaxima = Integer.MIN_VALUE, edadMinima = Integer.MAX_VALUE, edad = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduza la edad: ");
        edad = teclado.nextInt();

        while (edad >= 0) {

            if (edad > edadMaxima) {
                edadMaxima = edad;
            }

            if (edad < edadMinima) {
                edadMinima = edad;
            }

            System.out.print("Introduza la edad: ");
            edad = teclado.nextInt();
        }

        System.out.println("La edad máxima será: " + edadMaxima);
        System.out.println("La edad mínima será: " + edadMinima);
    }
}
