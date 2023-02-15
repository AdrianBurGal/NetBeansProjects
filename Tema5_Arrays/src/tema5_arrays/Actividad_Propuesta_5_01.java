package tema5_arrays;

public class Actividad_Propuesta_5_01 {

    public static void main(String[] args) {

        int[] enteros = new int[5];
        double[] reales = {1.2, 1.3, 3.4, 4.4, 5.6};
        boolean[] booleanos = new boolean[5];

        for (int indice = 0; indice < enteros.length; indice++) {
            enteros[indice] = 10 + indice;
        }
        for (int indice = 0; indice < enteros.length; indice++) {
            System.out.println(enteros[indice] = 10 + indice);
        }
        
    }
    
    
}
