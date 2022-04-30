package andres.marulanda.JavaParaNovatosCap1;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       float r = 0;
       float area = 0;
       float circunferencia = 0;
       float PI = (float) 3.1416;
       
       Scanner leer = new Scanner (System.in);
       
       System.out.println("Ingrese el valor del radio de la circulo: ");
       r = leer.nextFloat();
       
       area = PI * (r*r);
       System.out.println("El área del circulo es: " + area);
        
       circunferencia = 2 * PI * r;
       System.out.println("la circunferencia del circulo es: " + circunferencia);
         
    }
    
}
