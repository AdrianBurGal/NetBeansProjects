package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_07 {

    public static void main(String[] args) {

        int numero = 0;
        final int CONTRASEÑA = 1234;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introuduzca la contraseña de la caja fuerte: ");
        numero = teclado.nextInt();
        for (int intento = 1; numero != CONTRASEÑA && intento <= 4; intento++){
            System.out.print("Lo siento, esa no es la combinación. Te quedan " + (4 - intento) + " intentos.");
            numero = teclado.nextInt();
        }
        if (numero == CONTRASEÑA){
            System.out.println("La caja se ha abierto satisfactoriamente.");
        }
    }     
}
