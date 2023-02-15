package Actividad_Aplicacion_7_14;

public class Cambio {
    
    private int[] dinero = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
    
    public void calcularCambio(int precio, int pago) {
        
        int cambio = pago - precio;
        int indice = 0, veces;
        
        System.out.println("Cambio que se devuelve: " + cambio);
        
        while (cambio > 0) {
            
            veces = cambio / dinero[indice];
            
            if (veces > 0) {
                System.out.println(veces + " x " + dinero[indice]);
            }
            
            cambio = cambio % dinero[indice];
            indice++;
        }
    }
}

