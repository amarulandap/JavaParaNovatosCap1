package andres.marulanda.JavaParaNovatosCap1;
/**@author Andres-Marulanda*/

public class SalidaFormateada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Uso del print format
        
        System.out.printf("El número %d %d %d no tiene decimales. \n", 20, 35, 22); 
        System.out.printf("El número %f sale con decimales. \n", 20.1);
        System.out.printf("El %.3f sale exactamente con tres decimales. \n", 21.2);
        System.out.printf("%-10s %8.2f %6d\n", "Manzanas", 4.5, 10);
        System.out.printf("%10s %8.2f %6d\n", "Peras", 2.75, 120);
    }
    
}
