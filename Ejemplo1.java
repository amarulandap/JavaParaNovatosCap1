package andres.marulanda.JavaParaNovatosCap1;
/**
 
 * @author Andres-Marulanda
 */

import java.lang.Math;

public class Ejemplo1 {

    //Declarar una variable global.
    static byte g = 50;
    
    public static void main(String[] args) {
        
      //Declarar las variables locales.
      byte a = 10;
      byte n = 20;
      byte m = 30;
      
      int resultado = (a * n * m) + g;
      
      System.out.println("El resultado es: " + resultado);
        
      metodo_1();
      metodo_2();
    }
    
    public static void metodo_1 (){
        
       byte a = 15;
       byte b = 40;
       byte c = 65;
        
       int resultado_1 = 0;
        
       resultado_1 = (a + b + c) * g;
        
       System.out.println("El segundo resultado es: " + resultado_1);
    }
    
    public static void metodo_2 (){
        
        byte a = 2;
        byte b = 5;
        byte c = 8;
        
        int expresion_1 = 4 / 2 * 3 / 6 + 6 / 2 / 1 / 4 * 2; 
        int expresion_2 = (7 * (10 - 5) % 3) * 4 + 9; 
        double expresion_3 = 3 * a - 4 * b / Math.pow(c, 2);
        double expresion_4 = Math.sqrt(Math.pow(b, 2));
        
        System.out.println("Resultado de la expresion 1: "+ expresion_1);
        System.out.println("Resultado de la expresion 2: "+ expresion_2);
        System.out.println("Resultado de la expresion 3: "+ expresion_3);
        System.out.println("Resultado de la expresion 4: "+ expresion_4);
        
    }
    
}
