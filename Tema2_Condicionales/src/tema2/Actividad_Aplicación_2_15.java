package tema2;

import java.util.Scanner;

public class Actividad_Aplicación_2_15 {

    public static void main(String[] args) {

        double base, altura, areaTriangulo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la medida de la base: ");
        base = teclado.nextDouble();

        System.out.print("Introduzca la medida de la altura: ");
        altura = teclado.nextDouble();

        if (base > 0 && altura > 0) {
            areaTriangulo = (base * altura) / 2;
            System.out.printf("El área del triángulo es %.2f.", areaTriangulo);
        } else {
            System.out.println("No se puede calcular el área.");
        }

    }

}
