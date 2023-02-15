package bibliotecaFunciones;

public class JuntaNumeros {
   
    public static String juntaNumeros(String num1, String num2){
        
        String numeroFinal;
        
        numeroFinal = num1 + num2;
        
        return numeroFinal;  
    }
    
    public static void main(String[] args){
    
        String num1 = "1234";
        String num2 = "5678";
        
        System.out.println(juntaNumeros(num1, num2));
        
        
    }
}