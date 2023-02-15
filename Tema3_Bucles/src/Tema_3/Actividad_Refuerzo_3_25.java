package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_25 {

    public static void main(String[] args) {

        int numero, resto;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca un número: ");
        numero = Math.abs(teclado.nextInt());
        
        while (numero > 0){
            resto = numero % 10;
            numero = numero / 10;
            System.out.print(resto);
            
        }  
    }
}
