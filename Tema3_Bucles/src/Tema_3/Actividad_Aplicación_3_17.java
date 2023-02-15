package Tema_3;

import java.util.Scanner;

public class Actividad_Aplicación_3_17 {

    public static void main(String[] args) {

        int a, b, num1, num2;
        int resultado;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        num1 = teclado.nextInt();

        System.out.print("Introduzca el segundo número: ");
        num2 = teclado.nextInt();

        a = Math.max(num1, num2);
        b = Math.min(num1, num2);
        do {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);

        System.out.println("El M.C.D entre " + num1 + " y " + num2 + " es: " + resultado);
    }

}
