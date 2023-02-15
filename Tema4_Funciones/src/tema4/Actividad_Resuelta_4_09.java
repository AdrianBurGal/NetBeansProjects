package tema4;

import java.util.Scanner;

public class Actividad_Resuelta_4_09 {

    public static int maximo(int num1, int num2, int num3) {

        int maximo;

        if (num1 > num2 && num1 > num3) {
            maximo = num1;
        } else if (num3 > num1 && num3 > num2) {
            maximo = num3;
        } else {
            maximo = num2;
        }

        return maximo;
    }

    public static void main(String[] args) {

        int num1, num2, num3, maximo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        num1 = teclado.nextInt();

        System.out.print("Introduzca el segundo número: ");
        num2 = teclado.nextInt();

        System.out.print("Introduzca el segundo número: ");
        num3 = teclado.nextInt();

        System.out.println("El mayor es: " + maximo(num1, num2, num3));
        
    }
}
