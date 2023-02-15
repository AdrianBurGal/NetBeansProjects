package tema2;

import java.util.Scanner;

public class Actividad_Refuerzo_2_24 {

    public static void main(String[] args) {

        int empleado, diasViaje, estadoCivil, dineroBase = 0, dineroViaje, dineroBruto;

        double retención = 0, sueldoNeto;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        empleado = teclado.nextInt();
        
        switch (empleado){
            case 1 -> dineroBase = 950;
            case 2 -> dineroBase = 1200;
            case 3 -> dineroBase = 1600;
        }
       
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        diasViaje = teclado.nextInt();
        
        dineroViaje = diasViaje * 30;
        
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estadoCivil = teclado.nextInt();
        
        System.out.print("\n");
        
        dineroBruto = dineroBase + dineroViaje;
        
        switch (estadoCivil) {
            case 1 -> retención = dineroBruto * 0.25;
            case 2 -> retención = dineroBruto * 0.2;
        }
        
        sueldoNeto = dineroBruto - retención;
        
        System.out.printf("Dinero base        %d,00 \n", dineroBase);
        System.out.printf("Dietas ( %d viajes ) %d,00 \n", diasViaje, dineroViaje);
        System.out.printf("Sueldo bruto       %d,00 \n", dineroBruto);
        System.out.printf("Retención IRPF      %.2f \n", retención);
        System.out.printf("Sueldo neto         %.2f \n", sueldoNeto);

    }
    }
