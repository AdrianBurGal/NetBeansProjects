package tema6_cadena_caracteres;

public class Actividad_Aplicacion_6_13 {

    public static String cadenaCambiada(String sentencia) {

        String cadenaFinal;
        int inicio, fin;

        inicio = sentencia.indexOf(" /*");
        fin = sentencia.indexOf("*/");

        cadenaFinal = sentencia.substring(0, inicio);
        cadenaFinal = cadenaFinal + sentencia.substring(fin + 2);

        return cadenaFinal;
    }

    public static void main(String[] args) {

        String sentencia = "if (a==3) /* igual a tres */ a++;";

        System.out.println(cadenaCambiada(sentencia));

    }
}
