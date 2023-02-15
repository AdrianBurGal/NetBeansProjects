
package tema5_arrays;

import java.util.Scanner;

public class PruebaChill2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroNIF;
        char letraNIF;
        char[] letrasNIF = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        System.out.println("Introduzaca el numero del DNI sin la letra: ");
        numeroNIF = teclado.nextInt();
        
        letraNIF = letrasNIF[numeroNIF % 23];
        
        System.out.println("La letra del DNI es: " + letraNIF);
        
    }
    
}
