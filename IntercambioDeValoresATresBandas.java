package andres.marulanda.javaparanovatoscap1;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class IntercambioDeValoresATresBandas {

    public static void main(String[] args) {
       
        byte a = 0;
        byte b = 0;
        byte c = 0;
        byte d = 0;
        byte e = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de a: ");
        a = leer.nextByte();
        
        System.out.println("Ingrese el valor de b: ");
        b = leer.nextByte();
        
        System.out.println("Ingrese el valor de c: ");
        c = leer.nextByte();
        
        d = b;
        e = c;
        
        b = a;
        c = d;
        a = e;
        
        System.out.println("el valor de a es: " + a + " el valor de b es: " + b + " y el valor de c es: " + c);
    }
    
}
