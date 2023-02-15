package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_18 {

    public static void main(String[] args) {

        int numero1, numero2, numeroMayor, numeroMenor, resultado = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca dos números: ");
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();

        // Pedimos de nuevo el numero si ambos son iguales.
        if (numero2 == numero1) {
            System.out.print("Mismo número, intruduzca un número distinto: ");
            numero2 = teclado.nextInt();
        }

        // Indicamos el menor y el mayor número.
        numeroMayor = numero1 > numero2 ? numero1 : numero2;
        numeroMenor = numero1 < numero2 ? numero1 : numero2;

        System.out.printf("El rango será [%d,%d] \n", numeroMenor, numeroMayor);

        // Mostramos los números entre el rango pedido incrementando en 7.
        for (resultado = numeroMenor; resultado >= numeroMenor && resultado <= numeroMayor; resultado += 7) {
            System.out.print(resultado + ", ");
        }

    }
}
