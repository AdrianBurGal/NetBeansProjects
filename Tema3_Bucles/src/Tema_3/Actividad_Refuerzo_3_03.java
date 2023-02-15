package Tema_3;

public class Actividad_Refuerzo_3_03 {

    public static void main(String[] args) {

        int multiplo = 0, contador = 0;

        System.out.println("Los multiplos de 5 son: ");
        
        do {
            multiplo = 5 * contador;
            contador++;
            System.out.print(multiplo + " - ");
            
        } while (multiplo <= 95);

    }
}
