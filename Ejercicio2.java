package andres.marulanda.JavaParaNovatosCap1;

/**@author Andres-Marulanda*/

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Figuras con asteriscos -- cuadro.
        
        byte n = 0; //Número de asteriscos del cuadro.
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la dimensión del cuadro: ");
        n = leer.nextByte();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* "); //Imprime todos los asteríscos en la misma linea.
            }
            System.out.println(""); // Pasar a la siguiente linea.
        }   
    }  
}
