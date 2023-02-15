package Actividad_Aplicacion_7_12;

/**
 *
 * @author Usuario
 */
public class Ecuacion2Grado {

    private int a;
    private int b;
    private int c;

    public Ecuacion2Grado(int x, int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean discriminantePositivo() {
        
        double x = (b * b) - (4 * a * c);
        
        return x > 0;
        
    }

    public void soluciones() {
        
        double solucion1, solucion2;
        
        double x = (b * b) - (4 * a * c);
        
        if (x > 0) {
            
            solucion1 = (-b + Math.sqrt(x)) / (2 * a);
            solucion2 = (-b - Math.sqrt(x)) / (2 * a);
            
            System.out.println("Las soluciones son x1 = " + solucion1 + " y x2 = " + solucion2);
            
        } else if (x == 0) {
            
            solucion1 = -b / (2 * a);
       
            System.out.println("La solución doble es x = " + solucion1);
            
        } else {
            
            System.out.println("La ecuación no tiene solución.");
        }
    }
}
