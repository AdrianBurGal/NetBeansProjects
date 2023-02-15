package actividadclase;

import java.util.Scanner;

public class Pruebas {

    public static int longitud(int num) {

        int longitud = 0;

        while (num > 0) {
            num = num / 10;
            longitud++;

        }

        return longitud;
    }

    public static int vueltaPow(int num) {

        int contador = 0, numnuevo = 0, digito = 0;
        while (contador <= longitud(num)) {
            num /= Math.pow(10, longitud(num) - contador);
            digito %= 10;
            numnuevo = (digito * (int) Math.pow(10, contador));
            contador++;
            System.out.println(digito + " " + numnuevo);
        }
        return numnuevo;
    }

    public static int buscaDigitos(int num, int digito) {

        num /= Math.pow(10, longitud(num) - digito);
        num %= 10;
        return num;

    }

    public static void main(String[] args) {

        int num = 12345;

        longitud(num);

        System.out.println(vueltaPow(num));
    }
}
