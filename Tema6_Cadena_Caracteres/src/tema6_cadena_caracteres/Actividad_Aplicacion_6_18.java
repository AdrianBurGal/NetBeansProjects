package tema6_cadena_caracteres;

public class Actividad_Aplicacion_6_18 {

    public static void main(String[] args) {

        String cadena = "Me GUstan merenDAR gaLLEtas";
        String copia, cadenaFinal = "";
        char minuscula, mayuscula;
        char letras[];

        System.out.println(cadena);
        
        copia = cadena.toLowerCase();
        System.out.println(copia);

        letras = copia.toCharArray();

        for (int indice = 0; indice < copia.length(); indice++) {
            if (letras[indice] == ' ') {
                minuscula = letras[indice + 1];
                mayuscula = Character.toUpperCase(minuscula);
                letras[indice + 1] = mayuscula;
            } else {
                cadenaFinal = cadenaFinal + letras[indice];
            }
        }
        System.out.println(cadenaFinal);
    }
}
