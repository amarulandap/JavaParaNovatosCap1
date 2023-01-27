package andres.marulanda.javaparanovatoscap1;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class NumeroPar {

    public static void main(String[] args) {
        
        int numero = 0; // Número a verificar.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número: ");
        numero = leer.nextInt();
        
        if (numero % 2 == 0){
            
            System.out.println("El número es par");
        }else{
            
            System.out.println("El número es impar");
        }
    }
    
}
