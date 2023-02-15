package tema4;

import static bibliotecaFunciones.Potencia.potencia;

import java.util.Scanner;

public class Actividad_Refuerzo_4_18 {

    public static void main(String[] args) {

        int decimal, digito, binario = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número decimal: ");
        decimal = teclado.nextInt();

        for (int exponente = 0; decimal != 0; exponente++) {

            digito = decimal % 2;
            binario = binario + digito * potencia(10, exponente);
            decimal = decimal / 2;
        }

        System.out.println(binario);
    }
}
