package tema6_cadena_caracteres;

import java.util.Scanner;

public class Actividad_Aplicacion_6_17 {

    public static void main(String[] args) {

        String palabra;
        int numero;
        char[] letras;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca una palabra: ");
        palabra = teclado.nextLine();

        System.out.print("Introduzca nº letras para separar la palabra: ");
        numero = teclado.nextInt();

        letras = palabra.toCharArray();

        for (int indice = 0; indice < palabra.length(); indice++) {
            System.out.print(letras[indice]);
            if (indice != 0 && indice % (numero) == 0) {
                System.out.println();
            }
        }

    }
}
