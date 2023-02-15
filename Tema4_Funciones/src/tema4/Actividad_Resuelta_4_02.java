package tema4;

import java.util.Scanner;

public class Actividad_Resuelta_4_02 {

    static void comprendidos(int menor, int mayor) {

        for (int contador = menor; contador <= mayor; contador++) {
            System.out.print(contador + " - ");
        }
    }

    public static void main(String[] args) {

        int num1, num2, mayor, menor;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        num1 = teclado.nextInt();

        System.out.print("Introduzca el primer número: ");
        num2 = teclado.nextInt();

        mayor = num1 > num2 ? num1 : num2;
        menor = num1 < num2 ? num1 : num2;

        comprendidos(menor, mayor);

    }

}
