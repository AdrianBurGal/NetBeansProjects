package tema5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Aplicacion_5_14 {

    public static void llenaArray(int[] lista) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        for (int indice = 0; indice < lista.length; indice++) {
            System.out.print("Introduzca el sueldo del encuestado: ");
            numero = teclado.nextInt();
            lista[indice] = numero;
        }
    }

    public static void ordenacionArray(int[] lista) {

        int valorAInsertar, recorrido;

        for (int indice = 1; indice < lista.length; indice++) {
            valorAInsertar = lista[indice];
            recorrido = indice - 1;

            while ((recorrido >= 0) && (valorAInsertar > lista[recorrido])) {

                lista[recorrido + 1] = lista[recorrido];
                recorrido--;
            }
            lista[recorrido + 1] = valorAInsertar;
        }
    }

    public static int mediaArray(int[] lista) {

        int total = 0, media = 0;
        for (int contador = 0; contador < lista.length; contador++) {
            total = total + lista[contador];
        }
        media = (total / (lista.length - 1));

        return media;
    }

    public static void main(String[] args) {

        int longitud;

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos datos vas a introducir? ");
        longitud = teclado.nextInt();

        int[] lista = new int[longitud];

        llenaArray(lista);
        System.out.println("Sueldo inicial: " + Arrays.toString(lista));

        ordenacionArray(lista);

        System.out.println("Sueldos ordenados: " + Arrays.toString(lista));

        System.out.println("El sueldo máximo es: " + lista[0]);
        System.out.println("El sueldo mínimo es: " + lista[lista.length - 1]);

        System.out.println("La media del total de sueldos es: " + mediaArray(lista));
    }

}
