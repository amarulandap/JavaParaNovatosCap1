package andres.marulanda.javaparanovatoscap1;
/**
 * @author Andres-Marulanda
 */

/** Para importar paquetes, lo hacemos por fuera de la clase**/

import java.util.Scanner;

public class CalcularPromedio {

    
    public static void main(String[] args) {
        
        //Declarar e inicializar las variables a utilizar.
        short numeros = 0; // Cantidad de números a sumar.
        short numero = 0;
        short suma = 0;
        float promedio;
        
        int contador = 0; // Controlar el ciclo para realizar la suma.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números a promediar: ");
        numeros = leer.nextShort();
        
        while (contador < numeros){
            
            System.out.println("Ingrese el nuevo número: ");
            numero = leer.nextShort();
            suma += numero;
            contador++;
        }
        
        promedio = suma / numeros;
        
        System.out.println("El promedio es: " + promedio);
           
    }
    
}
