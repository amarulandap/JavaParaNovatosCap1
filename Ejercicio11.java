package andres.marulanda.JavaParaNovatosCap1;
/**
 * @author Andres-Marulanda
 */

import java.lang.Math;

public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    
    public static char obtenerLetra () {
        
        return (char) (Math.random()*26 + 'D');
    }
    
    public static void main(String[] args) {
        
        int a = 'a';
        double pi = 3.14;
        double pi2 = pi + pi;
        boolean adivina = (1==4);
        // boolean adivina1 = (1 == 'a' == 4); imposible comparar un boolean con un int.
        boolean adivina1 = ((97 == 'a')&& true);
        
        byte b = 1;
        //byte c = b>1; Una variable boolean no puede ser convertida a byte.
        
        System.out.println(obtenerLetra());
        System.out.println(obtenerLetra());
        System.out.println(obtenerLetra());
        System.out.println(obtenerLetra());
        
        System.out.println(a);
        System.out.println(pi);
        System.out.println(pi2);
        System.out.println(adivina);
        System.out.println(adivina1);
       
    }
    
}
