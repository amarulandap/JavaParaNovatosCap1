package andres.marulanda.JavaParaNovatosCap1;

/**@author Andres-Marulanda*/

import java.util.Scanner;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Figuras con *, un triangulo.
        
        byte altura = 0;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la altura del triangulo: ");
        altura = leer.nextByte();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
