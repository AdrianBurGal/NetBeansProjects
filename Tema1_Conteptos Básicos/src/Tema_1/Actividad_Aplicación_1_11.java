
package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_11 {
    
    public static void main(String[] args) {
            
        Scanner teclado = new Scanner(System.in);
        double precioProducto, precioIva, precioTotal;
        final double iva = 1.21;
        
        System.out.println("¿Cuánto vale el producto? A dicho producto se le aplicará un IVA del 21%");
        precioProducto = teclado.nextDouble();
        
        precioTotal = precioProducto * iva;
        precioIva = precioTotal - precioProducto;
        
        System.out.println("El precio total es: " + precioTotal + "€.");
        System.out.println("El precio sumado por el IVA es: " + precioIva + "€.");
        
    }
}
