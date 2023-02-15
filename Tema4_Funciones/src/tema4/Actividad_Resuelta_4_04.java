package tema4;

import java.util.Scanner;

public class Actividad_Resuelta_4_04 {

    public static long maximo(long num1, long num2) {

        long maximo;

        if (num1 >= num2) {
            maximo = num1;
        } else {
            maximo = num2;
        }
        return maximo;
    }

    public static void main(String[] args) {

        long num1, num2, maximo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        num1 = teclado.nextLong();

        System.out.print("Introduzca el segundo número: ");
        num2 = teclado.nextLong();

        System.out.println("El número máximo es: " + maximo(num1, num2));

    }

}
