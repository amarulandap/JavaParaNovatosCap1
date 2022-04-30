package andres.marulanda.JavaParaNovatosCap1;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte a = 0;
        byte b = 0;
        byte b1 = 0;
        byte c = 0;
        byte c1 = 0;
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el valor de a: ");
        a = leer.nextByte();
        System.out.println("Ingrese el valor de b: ");
        b = leer.nextByte();
        System.out.println("Ingrese el valor de c: ");
        c = leer.nextByte();
        
        //Sacamos una copia del valor de b y de c.
        b1 = b;
        c1 = c;
        //A b le asignamos el valor de a.
        b = a;
        //A c le asignamos el valor que tenia b.
        c = b1;
        //A a le asignamos el valor de c.
        a = c1;
        
        System.out.println("Los nuevos valores son: a=" + a + " b=" + b + " c=" + c);
    }
    
}
