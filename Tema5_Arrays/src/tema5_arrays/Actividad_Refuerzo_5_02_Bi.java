package tema5_arrays;

public class Actividad_Refuerzo_5_02_Bi {

    public static void main(String[] args) {

        /*Escribe un programa que pida 20 números enteros. Estos números se deben
          introducir en un array de 4 filas por 5 columnas. El programa mostrará las
          sumas parciales de filas y columnas igual que si de una hoja de cálculo se
          tratara. La suma total debe aparecer en la esquina inferior derecha.*/
        
        int[][] matriz = new int[4][5];
        int totalFila = 0, totalColumna = 0, totalMatriz = 0;

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[0].length; columnas++) {

                matriz[filas][columnas] = (int) (Math.random() * 89 + 10);    //Rellena la matriz.
                System.out.print(" " + matriz[filas][columnas] + " ");        //Muestra los dígitos.
                totalFila = totalFila + matriz[filas][columnas];              //Suma el total de cada fila.
                totalMatriz = totalMatriz + matriz[filas][columnas];          //Suma el total de la matriz (filas+columnas).
            }
            System.out.println("| " + totalFila); //Muestra el total de cada fila.
            totalFila = 0;
        }

        for (int contador = 0; contador < matriz[0].length; contador++) {
            System.out.print(" -- "); //Separador.
        }
        System.out.println("  ---"); //Separador.

        for (int columnas = 0; columnas < matriz[0].length; columnas++) {
            for (int filas = 0; filas < matriz.length; filas++) {
                totalColumna = totalColumna + matriz[filas][columnas];        //Suma el total de cada columna.
            }
            System.out.print(totalColumna + " "); //Muestra el total de cada columna.
            totalColumna = 0;
        }

        System.out.println("| " + totalMatriz);  //Muestra el total de TODA la matriz (filas+columnas).
    }
}
