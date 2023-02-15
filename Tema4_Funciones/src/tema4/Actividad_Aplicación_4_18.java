package tema4;

import java.util.Scanner;

public class Actividad_Aplicación_4_18 {

    public static void diferenciaMin(int veces, int maximo, int minimo) {

        int numeroAleatorio;

        for (int contador = veces; contador > 0; contador--) {

            numeroAleatorio = (int) (Math.random() * (maximo - minimo) + minimo);
            System.out.print(numeroAleatorio + " ");
        }
    }

    public static void main(String[] args) {

        int veces, maximo = 10, minimo = 8;

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántas veces quieres que se repita? ");
        veces = teclado.nextInt();

        diferenciaMin(veces, maximo, minimo);
        
    }
}
