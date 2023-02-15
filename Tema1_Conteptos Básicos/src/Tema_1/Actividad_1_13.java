
package Tema_1;

import java.util.Scanner;

public class Actividad_1_13 {
    
            public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int notaPrimerTri, notaSegundoTri, notaTercerTri, notaMediaEntera;
            double notaMediaDecimal;
               
                System.out.print("Dime tu nota del primer trimestre: ");
                notaPrimerTri = teclado.nextInt();
                
                System.out.print("Dime tu nota del segundo trimestre: ");
                notaSegundoTri = teclado.nextInt();
                
                System.out.print("Dime tu nota del tercer trimestre: ");
                notaTercerTri = teclado.nextInt();

                notaMediaEntera = (notaPrimerTri + notaSegundoTri + notaTercerTri) / 3;
                notaMediaDecimal = (double)(notaPrimerTri + notaSegundoTri + notaTercerTri) / 3;
                
                System.out.println("La nota que se le mostrará en el boletín es: " + notaMediaEntera);
                System.out.println("La nota real obtenida es: " + notaMediaDecimal);
                
            }
}
