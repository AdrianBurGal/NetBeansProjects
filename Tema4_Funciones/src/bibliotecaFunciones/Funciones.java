package bibliotecaFunciones;

public class Funciones {

// FUNCIÓN CAPICUA
    public static boolean esCapicua(int numero) {

        int reverso = 0, digito, auxiliar;
        boolean capicua = false;

        auxiliar = numero;
        while (auxiliar > 0) {
            digito = auxiliar % 10;
            auxiliar = auxiliar / 10;
            reverso = (reverso * 10) + digito;
        }

        if (numero == reverso) {
            capicua = true;
        }
        return capicua;
    }

//FUNCIÓN PRIMO
    public static boolean esPrimo(int numero) {

        boolean primo = true;

        for (int contador = 2; contador != numero / 2 && primo; contador++) {
            if (numero % contador == 0) {
                primo = false;
            }
        }
        return primo;
    }
    
// FUNCIÓN SIGUIENTE PRIMO
    
// FUNCIÓN POTENCIA
    public static int potencia(int base, int exponente) {

        int potencia = 1, contador;

        for (contador = exponente; contador > 0; contador--) {
            potencia = potencia * base;
        }

        return potencia;
    }

// FUNCIÓN NÚMERO DE DÍGITOS
    
    public static int digitos(int numero) {

        int digito, contadorDigito = 1;

        while (numero >= 9) {
            
            digito = numero % 10;
            numero = numero / 10;
            contadorDigito++;
        }

        return contadorDigito;
    }
    
// FUNCIÓN VOLTEA
    
    
    
// FUNCIÓN BUSCA DÍGITO
    
    
    
    
}
