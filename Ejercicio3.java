package andres.marulanda.JavaParaNovatosCap1;

/**@author Andres-Marulanda*/

import java.util.Scanner;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Figuras con asteriscos - rectángulo.
        
        byte n = 0; //Ancho.
        byte m = 0; //Alto.
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el ancho del rectángulo: ");
        n = leer.nextByte();
        System.out.println("Ingrese el alto del rectángulo: ");
        m = leer.nextByte();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
    
}
