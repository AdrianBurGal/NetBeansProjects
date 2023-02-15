package tema2;

import java.util.Scanner;

public class Actividad_Aplicación_2_17 {

    public static void main(String[] args) {

        int numero1, numero2, sumaNum;

        Scanner teclado = new Scanner(System.in);

        numero1 = (int) (Math.random() * 99 + 1);
        System.out.println("El primero número es: " + numero1);

        numero2 = (int) (Math.random() * 99 + 1);
        System.out.println("El segundo número es: " + numero2);

        System.out.print("La suma de ambos números es: ");
        sumaNum = teclado.nextInt();

        if (sumaNum == numero1 + numero2) {
            System.out.println("La suma es correcta.");
        } else {
            System.out.println("La suma es incorrecta.");
        }

    }
}
