
package Tema_1;

import java.util.Scanner;

public class Actividad_1_11 {
    
        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in); 
            double kgPrimerSemestreManzana, kgSegundoSemestreManzana, kgPrimerSemestrePera,kgSegundoSemestrePera;
            double beneficiosManzana, beneficiosPera, totalBeneficios;
    
            System.out.print("¿Cuántos kilos de manzanas vendistes en el primer semestre?");
            kgPrimerSemestreManzana = teclado.nextDouble();
            
            System.out.print("¿Cuántos kilos de manzanas vendistes en el segundo semestre?");
            kgSegundoSemestreManzana = teclado.nextDouble();
            
            System.out.print("¿Cuántos kilos de peras vendistes en el primer semestre?");
            kgPrimerSemestrePera = teclado.nextDouble();
            
            System.out.print("¿Cuántos kilos de peras vendistes en el segundo semestre?");
            kgSegundoSemestrePera = teclado.nextDouble();
            
            beneficiosManzana = (kgPrimerSemestreManzana + kgSegundoSemestreManzana) * 2.35;
            beneficiosPera = (kgPrimerSemestrePera + kgSegundoSemestrePera) * 1.95;
            totalBeneficios = beneficiosManzana + beneficiosPera;
            
            System.out.println("El total de beneficios anual es de " + totalBeneficios + "€.");
        }       
}
