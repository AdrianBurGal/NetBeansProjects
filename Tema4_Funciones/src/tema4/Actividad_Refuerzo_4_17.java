package tema4;

import java.util.Scanner;

import static bibliotecaFunciones.Potencia.potencia;

public class Actividad_Refuerzo_4_17 {

    public static void main(String[] args) {

        int binario, decimal = 0, digito;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número binario: ");
        binario = teclado.nextInt();

        for (int exponente = 0; binario != 0; exponente++){
            digito = binario % 10;                       
            decimal = decimal + digito * potencia(2, exponente);
            binario = binario / 10;
        }

        System.out.println(decimal);
    }
}
