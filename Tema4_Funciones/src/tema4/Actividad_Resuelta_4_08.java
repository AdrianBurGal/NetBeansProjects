package tema4;

import java.util.Scanner;

public class Actividad_Resuelta_4_08 {

    public static int calculadora(int num1, int num2, int operacion) {

        int resultado = 0;

        switch (operacion) {
            case 1 ->
                resultado = num1 + num2;
            case 2 ->
                resultado = num1 - num2;
            case 3 ->
                resultado = num1 * num2;
            case 4 ->
                resultado = num1 / num2;

        }
        return resultado;
    }

    public static void main(String[] args) {

        int num1, num2, operacion;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        num1 = Math.abs(teclado.nextInt());

        System.out.print("Introduzca el segundo número: ");
        num2 = Math.abs(teclado.nextInt());

        System.out.print("¿Qué quieres hacer? Suma[1] / Resta[2] / Multiplicación[3] / División[4]: ");
        operacion = teclado.nextInt();

        System.out.println("El resultado es: " + (double) calculadora(num1, num2, operacion));

    }
}
