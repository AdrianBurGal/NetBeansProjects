package tema2;

import java.util.Scanner;

public class Actividad_Aplicación_2_13 {

    public static void main(String[] args) {

        double comidaDiaria, kilosPorAnimal;
        int numAnimales;

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos kilos de comida diaria se compra? ");
        comidaDiaria = teclado.nextDouble();

        System.out.print("¿Cuántos animales hay que alimentar? ");
        numAnimales = teclado.nextInt();

        System.out.print("¿Cuántos kilos come un animal? ");
        kilosPorAnimal = teclado.nextDouble();
        
        if (numAnimales > 0 && comidaDiaria >= numAnimales * kilosPorAnimal) {
            System.out.println("Si disponemos de alimento suficiente.");
        } else if (numAnimales > 0) {
            kilosPorAnimal = comidaDiaria / numAnimales;
            System.out.printf("No desponemos de comida suficiente. \n"
                    + "Cada animal deberá comer %.3f kg. \n", kilosPorAnimal);
        } else {
            System.out.println("No hay animales.");
        }
        
    }
}
