package tema4;

import java.util.Scanner;

public class Actividad_Resuelta_4_03 {

    public static double area(double radio, double altura) {

        double total = 0;
        total = 2 * (Math.PI) * radio * (altura + radio);
        
        return total;
    }

    public static double volumen(double radio, double altura) {

        double total = 0;
        total = (Math.PI) * (radio * radio) * altura;
        
        return total;
    }

    public static void main(String[] args) {

        double radio, altura;
        int eleccion;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el radio: ");
        radio = teclado.nextDouble();

        System.out.print("Introduzca la altura: ");
        altura = teclado.nextDouble();

        System.out.print("¿Qué quieres calcular? Área[1] / Volumen[2]");
        eleccion = teclado.nextInt();

        switch (eleccion) {
            case 1 -> 
                System.out.println("El área es " + area(radio, altura));
            case 2 ->
                System.out.println("El volumen es " + volumen(radio, altura));
        }

    }
}
