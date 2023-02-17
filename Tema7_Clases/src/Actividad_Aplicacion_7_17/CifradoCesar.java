package Actividad_Aplicacion_7_17;

public class CifradoCesar {

    public static void devolverCifrado(int numero, String texto) {

        char[] caracteres = texto.toCharArray();
        String textoFinal = "";
        int letra;

        System.out.println("Texto inicial: " + texto);

        for (int indice = 0; indice < caracteres.length; indice++) {

            if (caracteres[indice] > 'z') {
                letra = (caracteres[indice] - 'a');
            } else {
                letra = caracteres[indice] + numero;
            }

            textoFinal = textoFinal + Character.toString((char) letra);
        }

        System.out.println("Texto final:   " + textoFinal);
    }

}
