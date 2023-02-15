
package Actividad_Aplicacion_7_16;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {

        this.x = x;
        this.y = y;

    }

    public void desplazaX(double dx) {
        
        x = x + dx;
        
    }

    public void desplazaY(double dy) {
        
        y = y + dy;
        
    }

    public void desplaza(double dx, double dy) {
        
        x = x + dx;
        y = y + dy;
  
    }

    public double distanciaEuclidea(Punto otro) {

        double dx, dy, distancia;

        dx = x - otro.x;
        dy = y - otro.y;

        distancia = Math.sqrt(dx * dx + dy * dy);

        return distancia;
    }

    public void muestra() {

        System.out.println("Coordenadas del punto: (" + x + ", " + y + ")");

    }

}
