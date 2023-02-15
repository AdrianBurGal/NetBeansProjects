package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_05 {

    public static void main(String[] args) {

        int resultadoReal, resultadoIntroducido, numAciertos = -1;
        
        Scanner teclado = new Scanner(System.in);
        
        do {
     
            int valor1 = (int) (Math.random() * 100 + 1);
            int valor2 = (int) (Math.random() * 100 + 1);
            
            resultadoReal = valor1 + valor2;
            
            System.out.printf("La suma de %d + %d es: ",valor1,valor2);
            resultadoIntroducido = teclado.nextInt();
            
            numAciertos = numAciertos + 1;
        } while (resultadoIntroducido == resultadoReal);
        
        System.out.printf("Has fallado. Has acertado %d veces.",numAciertos);
    } 
}
