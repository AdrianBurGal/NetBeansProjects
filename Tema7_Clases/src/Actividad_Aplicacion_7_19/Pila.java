package Actividad_Aplicacion_7_19;

public class Pila {

    private int[] pila;
    private int numElementos;

    public Pila() {
        pila = new int[10];
        numElementos = 0;
    }

    public Pila(int capacidad) {

        if (capacidad <= 0) {
            capacidad = 10;
        }

        pila = new int[capacidad];
        numElementos = 0;
    }

    public int numeroElementos() {

        return numElementos = 0;
    }

    public boolean pilaLlena() {

        return (numElementos == pila.length);
    }

    public boolean pilaVacia() {

        return (numElementos == 0);
    }

    public boolean push(int numero) {

        boolean insertado = false;
        if (numElementos < pila.length) {
            pila[numElementos] = numero;
            numElementos++;
            insertado = true;
        }

        return insertado;
    }

    public Integer pop() {

        Integer valorDev = null;

        if (numElementos != 0) {
            valorDev = pila[numElementos - 1];
            numElementos--;
        }

        return valorDev;
    }

}
