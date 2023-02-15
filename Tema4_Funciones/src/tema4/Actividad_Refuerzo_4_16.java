package tema4;

import static bibliotecaFunciones.Capicua.esCapicua;
import java.util.Scanner;

public class Actividad_Refuerzo_4_16 {

    public static void main(String[] args) {

        int inicio, fin;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        inicio = teclado.nextInt();

        System.out.print("Introduzca un número: ");
        fin = teclado.nextInt();

        for (int numero = inicio; numero <= fin; numero++) {

            if (esCapicua(numero)) {

                System.out.println(numero);

            }

        }
    }

}
