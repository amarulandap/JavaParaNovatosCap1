package andres.marulanda.javaparanovatoscap1;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class IntercambioDevalores {

    public static void main(String[] args) {
       
        byte a = 0;
        byte b = 0;
        byte c = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println ("Ingrese el valor de a: ");
        a = leer.nextByte();
        
        System.out.println ("\nIngrese el valor de b: ");
        b = leer.nextByte();
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("el valor de a es: " + a + " y el valor de b es: " + b);
        
    }
    
}
