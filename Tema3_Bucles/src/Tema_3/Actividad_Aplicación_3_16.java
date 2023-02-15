package Tema_3;

import java.util.Scanner;

public class Actividad_Aplicación_3_16 {

    public static void main(String[] args) {

        int numeroFilas;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numeroFilas = teclado.nextInt();

        for (int altura = 1; altura <= numeroFilas; altura++) {
            for (int blancos = 1; blancos <= numeroFilas-altura; blancos++){
                System.out.print(" ");
        }
            for (int asteriscos = 1; asteriscos <= altura; asteriscos++){
                System.out.print("* ");
        }
            System.out.println();
        }
    }
}
