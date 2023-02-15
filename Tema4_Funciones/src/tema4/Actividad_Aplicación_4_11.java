package tema4;

public class Actividad_Aplicación_4_11 {

    public static double superficie(double radio) {

        double total;

        total = (4 * Math.PI) * Math.pow(radio, 2);
        return total;
    }

    public static double volumen(double radio) {

        double total;

        total = ((4 * Math.PI) / 3) * Math.pow(radio, 3);
        return total;
    }

    public static void main(String[] args) {

        double total, radio = 1;

        System.out.println("La superficie es: " + superficie(radio));
        System.out.println("El volumen es: " + volumen(radio));

    }

}
