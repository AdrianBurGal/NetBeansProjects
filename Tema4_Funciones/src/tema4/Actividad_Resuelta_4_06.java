package tema4;

import java.util.Scanner;

public class Actividad_Resuelta_4_06 {

    public static boolean esPrimo(int numero) {

        boolean respuesta = false;

        if ((numero / 2) % 2 != 0) {
            respuesta = true;
        }
        
        return respuesta;
    }

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce es número: ");
        numero = teclado.nextInt();

        System.out.println(esPrimo(numero));
    }
}
