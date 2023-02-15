
package Tema_1;

import java.util.Scanner;

public class Prueba7 {
    
    public static void main(String[] args) {
        
    /* Escribe un programa que pida el año actual y el de nacimiento del usuario. 
    Debe calcular su edad, suponiendo que en el año en curso el ususario ya ha cumplido años.
    */
        
        Scanner teclado = new Scanner(System.in);  
        int añoActual, añoNacimiento, edad;
    
        System.out.print("Introduzca el año actual: ");
        añoActual = teclado.nextInt();
        System.out.print("Introduzca su año de nacimiento: ");
        añoNacimiento = teclado.nextInt();
        
        edad = añoActual - añoNacimiento;
        System.out.println("La edad que tiene actualmente es de " + edad + " años.");

    } 
}
