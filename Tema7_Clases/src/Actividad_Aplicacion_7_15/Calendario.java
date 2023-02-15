package Actividad_Aplicacion_7_15;

public class Calendario {

    private int dia;
    private int mes;
    private int año;

    public Calendario(int dia, int mes, int año) {

        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }

    public void incrementarDia() {

        dia++;

    }

    public void incrementarMes() {
        
        mes++;

    }

    public void incrementarAño() {

        año++;

    }

    public void mostrar() {

        System.out.printf("La fecha actual es: %d/%d/%d \n", dia, mes, año);
        
    }

    public boolean iguales(Calendario otraFecha) {

        boolean res = false;

        if (otraFecha == fecha1){
            
        }
        
        
        return res;

    }

}
