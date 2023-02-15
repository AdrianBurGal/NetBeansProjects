package tema4;

import java.util.Scanner;

public class Actividad_Resuelta_4_05 {

    public static boolean vocal(char caracter) {

        boolean respuesta = false;

        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
            caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            respuesta = true;
        }
        return respuesta;
    }

    public static void main(String[] args) {

        char caracter;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un carácter: ");
        caracter = teclado.next().charAt(0);

        System.out.println(vocal(caracter));

    }
}
