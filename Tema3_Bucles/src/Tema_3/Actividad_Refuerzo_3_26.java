package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_26 {

    public static void main(String[] args) {

        int numero, digito, posición = 0, resto, reverso = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = Math.abs(teclado.nextInt());

        System.out.print("Introduzca un dígito: ");
        digito = teclado.nextInt();

        while (numero > 0) {
            resto = numero % 10;
            numero = numero / 10;
            reverso = (reverso * 10) + resto;
        }

        while (reverso > 0) {
            resto = reverso % 10;
            reverso = reverso / 10;
            posición++;

            if (resto == digito) {
                System.out.println("La posición de dicho dígito es el " + posición);

        }
    }
    }
}
