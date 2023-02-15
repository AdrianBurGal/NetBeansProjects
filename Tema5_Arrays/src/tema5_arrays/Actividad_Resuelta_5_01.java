package tema5_arrays;

public class Actividad_Resuelta_5_01 {

    public static void main(String[] args) {

        int[] tabla = new int[10];
        int suma = 0;

        for (int indice = 0; indice < tabla.length; indice++){
            tabla[indice] = (int) (Math.random() * 100 + 1);
            System.out.println(indice + ": " + tabla[indice]);
        }

        for (int indice = 0; indice < tabla.length; indice++){
            suma = suma + tabla[indice];
        }

        System.out.println("El total es: " + suma);
    }
}
