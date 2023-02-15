package bibliotecaFunciones;

public class Potencia {

    public static int potencia(int base, int exponente) {

        int potencia = 1, contador;

        for (contador = exponente; contador > 0; contador--) {
            potencia = potencia * base;
        }
        
        return potencia;
    }

    public static void main(String[] args) {

        int base = 2, exponente = 3;

        System.out.println(potencia(base, exponente));

    }
}
