package tema2;

import java.util.Scanner;

public class Actividad_2_08 {

    public static void main(String[] args) {

        double a, b, c, dentro_Raiz, x_Solución1, x_Solución2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el coeficiente de (a): ");
        a = teclado.nextDouble();
        System.out.print("Introduzca el coeficiente de (b): ");
        b = teclado.nextDouble();
        System.out.print("Introduzca el coeficiente de (c): ");
        c = teclado.nextDouble();

        dentro_Raiz = b * b - 4 * a * c;

        if (dentro_Raiz >= 0) {
            x_Solución1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            x_Solución2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

            System.out.println("Sus dos soluciones son: " + x_Solución1 + " y " + x_Solución2);
        } else {
            System.out.println("La ecuación no tiene solución.");
        }
    }
}
