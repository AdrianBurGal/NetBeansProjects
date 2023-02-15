package examen_tema5;

public class Examen_Tema5 {

    public static void mostrarArray(int[] lista) {
        for (int elemento : lista) {
            System.out.print(elemento + ", ");
        }
        System.out.println(); // separador
    }

    public static void multiplosIzquierda(int[] lista, int comprobador) {

        int indiceMultiplo = 0;
        int aux;

        for (int indice = 0; indice < lista.length; indice++) {
            if ((lista[indice] % 3 == 0) && indiceMultiplo <= comprobador) {
                aux = lista[indiceMultiplo];
                lista[indiceMultiplo++] = lista[indice];
                lista[indice] = aux;
            }
        }
    }

    public static void ordenacionMultiplos(int[] lista, int comprobador) {

        int aux;

        for (int indice = 0; indice < comprobador; indice++) {
            for (int recorrido = indice + 1; recorrido < comprobador; recorrido++) {
                if (lista[recorrido] < lista[indice]) {
                    aux = lista[indice];
                    lista[indice] = lista[recorrido];
                    lista[recorrido] = aux;
                }
            }
        }
    }

    public static void ordenacionNoMultiplos(int[] lista, int comprobador) {

        int aux;

        for (int indice = comprobador; indice < lista.length; indice++) {

            for (int recorrido = indice + 1; recorrido < lista.length; recorrido++) {

                if (lista[recorrido] > lista[indice]) {
                    aux = lista[indice];
                    lista[indice] = lista[recorrido];
                    lista[recorrido] = aux;
                }
            }
        }
    }

    public static void rellenaArray(int[] lista, int comprobador) {

        for (int indice = 0; indice < lista.length; indice++) {
            lista[indice] = (int) (Math.random() * 100);

            if (lista[indice] % 3 == 0) {
                comprobador++; // variable para calcular el total de los multiplos.
            }
        }
    }

    public static void main(String[] args) {

        int longitud = (int) (Math.random() * 6) + 10;
        int[] lista = new int[longitud];
        int comprobador = 0;

        System.out.printf("Se creará un array de %d espacios. \n", longitud);
        System.out.println();

        //Rellena array.
        for (int indice = 0; indice < lista.length; indice++) {
            lista[indice] = (int) (Math.random() * 100);

            if (lista[indice] % 3 == 0) {
                comprobador++; // variable para calcular el total de los multiplos.
            }
        }
        
        //Muestra el array incial.
        System.out.println("Array inicial: ");
        mostrarArray(lista);

        //Pasa los multiplos a la izquierda.
        multiplosIzquierda(lista, comprobador);

        //Muestra el array al colocar múltiplos de 3 a la izquierda.
        System.out.println("\nArray colocar múltiplos de 3 a la izquierda: ");
        mostrarArray(lista);

        //Ordena los multiplos.
        ordenacionMultiplos(lista, comprobador);

        //Muestra el array ordenado de los múltiplos.
        System.out.println("\nArray ordenación de múltiplos de 3: ");
        mostrarArray(lista);

        //Ordena los no multiplos.
        ordenacionNoMultiplos(lista, comprobador);

        //Muestra el resultado final.
        System.out.println("\nResultado final: ");
        mostrarArray(lista);

    }
}
