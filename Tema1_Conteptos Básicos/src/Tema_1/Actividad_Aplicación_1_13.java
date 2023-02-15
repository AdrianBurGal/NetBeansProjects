
package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_13 {
    
   public static void main(String[] args) {
            
        Scanner teclado = new Scanner(System.in);
        
        int numero, multiplo, numNecesario,resto;
        
        System.out.println("Introduzca dos números enteros: ");
        numero = teclado.nextInt();
        multiplo = teclado.nextInt();
        
        resto = (numero % multiplo);
        numNecesario = resto == 0 ? 0 : multiplo - resto;
        
        System.out.println("A " + numero + " hay que sumarle " + numNecesario + " para que el resultado sea múltiplo de " + multiplo);

    }
}
