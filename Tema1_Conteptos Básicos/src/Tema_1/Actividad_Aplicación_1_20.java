package Tema_1;

public class Actividad_Aplicación_1_20 {
    
   public static void main(String[] args) {
       
       java.util.Scanner teclado = new java.util.Scanner(System.in);      
       double n;
       System.out.println("Introduzca un número real: ");
       n = teclado.nextDouble();
       n = Math. sqrt (n);
       System.out.print("La raiz cuadrada es: " + n);

   }
}
