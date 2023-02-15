package tema4;

import java.util.Scanner;

public class Actividad_Refuerzo_4_35 {

    public static String convierteEnPalote(int numero) {

        int reverso = 0, digito, totalDigitos = 0;
        String cadena = "";

        while (numero > 0) {
            digito = numero % 10;
            numero = numero / 10;
            reverso = (reverso * 10) + digito;
            totalDigitos++;
        }

        while (reverso > 0) {
            digito = reverso % 10;
            for (int contador = digito; contador > 0; contador--) {
                cadena = cadena + "|";
            }

            totalDigitos--;
            if (totalDigitos > 1) {
                cadena = cadena + " - ";
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

        System.out.println(convierteEnPalote(numero));

    }
}
