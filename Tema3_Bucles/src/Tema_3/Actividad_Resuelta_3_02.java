package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_02 {

    public static void main(String[] args) {

        int edad, edadTotal = 0, numAlumno = 0, edadMedia = 0, alumnoMayor = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la edad del alumno: ");
        edad = teclado.nextInt();

        while (edad >= 0) {

            if (edad >= 18) {
                alumnoMayor = alumnoMayor + 1;
            }

            numAlumno = numAlumno + 1;
            edadTotal = edadTotal + edad;

            System.out.print("Dime la edad del alumno: ");
            edad = teclado.nextInt();
        }

        edadMedia = edadTotal / numAlumno;

        System.out.println("La suma de todas las edades son: " + edadTotal);
        System.out.println("La media de las edades es: " + edadMedia);
        System.out.println("En total hay " + numAlumno + " alumnos.");
        System.out.println("Hay " + alumnoMayor + " alumnos mayores de edad.");
    }
}
