package tema5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Aplicacion_5_15 {

    public static void main(String[] args) {

        int[][] notas = new int[3][5];
        int mediaTrimestre = 0, mediaAlumno = 0, numAlumno;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("¿De qué alumno le quieres hacer la media? [1-5] ");
            numAlumno = teclado.nextInt();
        } while ((numAlumno < 1) || (numAlumno > 5));

        System.out.println("\nIntroduzca notas enteras [1-10]: ");
        for (int indice1 = 0; indice1 < 3; indice1++) {
            for (int indice2 = 0; indice2 < 5; indice2++) {

                do {
                    System.out.printf("Nota del trimestre %d del alumno %d: ", (indice1 + 1), (indice2 + 1));
                    notas[indice1][indice2] = teclado.nextInt(); //llena los datos

                } while ((notas[indice1][indice2] < 0) || (notas[indice1][indice2] >= 10));

                mediaTrimestre = mediaTrimestre + notas[indice1][indice2]; //media por trimestre
                mediaAlumno = mediaAlumno + notas[indice1][numAlumno - 1]; //media del estudiante
            }
            System.out.printf("La media del grupo en el trimestre %d es: %d\n", (indice1 + 1), (mediaTrimestre / 5));
            mediaTrimestre = 0;
            System.out.println(); //separador
        }
        System.out.printf("La media del alumno %d es: %d\n", (numAlumno), (mediaAlumno / 3));
        System.out.println(Arrays.deepToString(notas));

    }
}
