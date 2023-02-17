package Actividad_Aplicacion_7_18;

public class Cola {

    private int[] cola;
    private int numElementos;

    public Cola() {
        cola = new int[10];
        numElementos = 0;
    }

    public Cola(int capacidad) {

        if (capacidad <= 0) {
            capacidad = 10;
        }

        cola = new int[capacidad];
        numElementos = 0;
    }

    public int numeroElementos() {

        return numElementos;
    }

    public boolean colaLlena() {

        return (numElementos == cola.length);
    }

    public boolean colaVacia() {

        return (numElementos == 0);
    }

    public boolean push(int numero) {

        boolean insertado = false;
        if (numElementos < cola.length) {
            cola[numElementos] = numero;
            numElementos++;
            insertado = true;
        }

        return insertado;
    }

    public Integer pop() {

        Integer valorDevuelto = null;
        
        if (numElementos > 0){
            valorDevuelto = cola[0];
            for (int indice = 0; indice < numElementos -1; indice++) {
                cola[indice] = cola[indice+1];
                
            }
            numElementos--;
        }
        
        return valorDevuelto;
    }
}
