package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_12 {

    public static void main(String[] args) {

        int numeroAnterior = 1, numeroNuevo = 0, digito, numero = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos dígitos quieres que se muestre? ");
        digito = teclado.nextInt();

        System.out.println("La serie de Fibonacci sería: ");

        while (digito != 0) {

            System.out.print(numeroNuevo + ", ");
            numeroNuevo = numeroAnterior + numero;
            digito--;
            numero = numeroAnterior;
            numeroAnterior = numeroNuevo;
        }
    }
}

