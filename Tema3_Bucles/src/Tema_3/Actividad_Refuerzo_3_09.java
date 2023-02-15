package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_09 {

    public static void main(String[] args) {

        long numero, digito = 1;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        numero = teclado.nextLong();
        
        numero = Math.abs(numero);
        
        while (numero > 9){
           numero = numero / 10;
           digito++;
            
        }
        System.out.println("El número tiene " + digito + " dígitos.");
        
    }
}
