package tema5_arrays;

import java.util.Scanner;

public class Actividad_Resuelta_5_02 {

    public static void main(String[] args) {

        double[] lista = new double[5];

        Scanner teclado = new Scanner(System.in);

        for (int indice = 0; indice < lista.length; indice++){

            System.out.print("Introduzca un número: ");
            lista[indice] = teclado.nextDouble();
        }

        for (int indice = 0; indice < lista.length; indice++){
            System.out.println(indice + ": " + lista[indice]);
        }

    }
}
