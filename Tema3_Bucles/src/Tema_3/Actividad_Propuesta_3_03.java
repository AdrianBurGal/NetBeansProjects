package Tema_3;

import java.util.Scanner;

public class Actividad_Propuesta_3_03 {

    public static void main(String[] args) {

        String guarismo = "";
        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introuduzca un número positivo: ");
        numero = teclado.nextInt();

        System.out.print("El número es: ");
        while (numero > 0) {
            guarismo = guarismo + (numero % 10);
            numero = numero / 10;
        }

        int guarismoNumero = Integer.parseInt(guarismo);
        System.out.println(guarismoNumero);

    }
}
