package tema4;

import java.util.Scanner;

public class Actividad_Refuerzo_4_37 {

    public static String convierteEnMorse(int numero) {

        int reverso = 0, digito;
        String cadena = "";

        numero = numero * 10 + 1;
        while (numero > 0) {
            digito = numero % 10;
            numero = numero / 10;
            reverso = (reverso * 10) + digito;
        }
        
        while (reverso > 1) {
            digito = reverso % 10;
            switch (digito) {
                case 0 -> cadena = cadena + "_ _ _ _ _ ";
                case 1 -> cadena = cadena + " . _ _ _ _ ";
                case 2 -> cadena = cadena + " . . _ _ _ ";
                case 3 -> cadena = cadena + " . . . _ _ ";
                case 4 -> cadena = cadena + " . . . . _ ";
                case 5 -> cadena = cadena + " . . . . . ";
                case 6 -> cadena = cadena + "_ . . . . ";
                case 7 -> cadena = cadena + "_ _ . . . ";
                case 8 -> cadena = cadena + "_ _ _ . . ";
                case 9 -> cadena = cadena + "_ _ _ _ . ";
            }
            reverso = reverso / 10;
        }
        return cadena;
    }

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = teclado.nextInt();

        System.out.println(convierteEnMorse(numero));

    }
}
