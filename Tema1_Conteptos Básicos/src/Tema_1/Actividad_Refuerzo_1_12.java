
package Tema_1;

import java.util.Scanner;

public class Actividad_Refuerzo_1_12 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in); 
       
       double nota1Exam, notaDeseada, nota2Exam;
       final double porcentaje1Exam = 0.40;
       final double porcentaje2Exam = 0.60;
       
       System.out.println("Introduzca la nota del primer examen: ");
       nota1Exam = teclado.nextDouble();
       
       System.out.println("¿Qué nota deseas sacar en el trimestre? ");
       notaDeseada = teclado.nextDouble();
       
       nota2Exam = (notaDeseada - nota1Exam * porcentaje1Exam) / porcentaje2Exam;
       
       System.out.println("Para tener un " + nota1Exam + 
               " en el trimestre necesitas sacar un " + nota2Exam + " en el segundo examen.");
       
   }
}
