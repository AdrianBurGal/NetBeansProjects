
package Tema_1;

import java.util.Scanner;

public class Prueba4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Introduzca la edad: ");
        edad = teclado.nextInt();
        
        teclado.nextLine();         
        
        System.out.print("Introduzce su nombre: ");
        nombre = teclado.next();
        
        System.out.println("\n" + edad + " - " + nombre);
       
    } 
}
