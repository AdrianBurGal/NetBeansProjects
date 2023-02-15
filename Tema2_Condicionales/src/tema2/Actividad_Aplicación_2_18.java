package tema2;

import java.util.Scanner;

public class Actividad_Aplicación_2_18 {

    public static void main(String[] args) {

        int numero1, numero2, operacion, resultadoCalculado, resultadoReal = 0;

        Scanner teclado = new Scanner(System.in);

        numero1 = (int) (Math.random() * 99 + 1);
        System.out.println("El primero número es: " + numero1);

        numero2 = (int) (Math.random() * 99 + 1);
        System.out.println("El segundo número es: " + numero2);

        operacion = (int) (Math.random() * 3 + 1);
        
        switch (operacion) {
            case 1 -> {
                System.out.println("Hay que realizar una SUMA con dichos números.");
                resultadoReal = numero1 + numero2;
            }
            case 2 -> {
                System.out.println("Hay que realizar una RESTA con dichos números.");
                resultadoReal = numero1 - numero2;
            }
            case 3 -> {
                System.out.println("Hay que realizar una MULTIPLICACIÓN con dichos números.");
                resultadoReal = numero1 * numero2;
            }
        }

        System.out.print("Introduzca el resultado: ");
        resultadoCalculado = teclado.nextInt();

        if (resultadoReal == resultadoCalculado) {
            System.out.println("La operación es correcta.");
        } else {
            System.out.println("La operación es incorrecta.");
        }

    }
}
