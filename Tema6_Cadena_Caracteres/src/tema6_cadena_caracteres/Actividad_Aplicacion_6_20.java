package tema6_cadena_caracteres;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Aplicacion_6_20 {

    public static void main(String[] args) {

        String cadena;
        String[] palabras;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca una cadena de caracteres: ");
        cadena = teclado.nextLine();

        cadena = cadena.toLowerCase();
        
        palabras = cadena.split(" ");

        Arrays.sort(palabras);

        System.out.println(Arrays.toString(palabras));

    }
}
