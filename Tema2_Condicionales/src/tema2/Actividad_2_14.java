package tema2;

import java.util.Scanner;

public class Actividad_2_14 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, año;
        int diaMes;
        
        System.out.print("Introduzca el dia: ");
        dia = teclado.nextInt();
        System.out.print("Introduzca el mes: ");
        mes = teclado.nextInt();
        System.out.print("Introduzca el año: ");
        año = teclado.nextInt();
        
        diaMes = switch(mes){
            case 2 -> 28;
            case 4, 6, 9, 11 ->30;
            default -> 31;
        };
        dia++;
        
        if(dia > diaMes){
            dia = 1;
            mes++;
        }if (mes > 12){
            mes = 1;
            año++;
        }
        if (año == 0){
            año = 0;
        }
        System.out.println("La fecha al dia siguiente sera: " + dia + " / " + mes + " / " + año);
        
        
}
}