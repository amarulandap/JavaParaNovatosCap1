package andres.marulanda.JavaParaNovatosCap1;

/**
 *
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
       
        //Definiremos las variables y sus tipos.
        byte A = 0;
        float num;
        float suma = 0;
        float media;
        
        //Solicitar al usuario que indique el total de numeros a sumar.
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuántos números desea sumar? ");
        A = leer.nextByte();
        
        int i=0;
        while (i < A){
            System.out.println("Ingrese el número: ");
            num = leer.nextFloat();
            suma += num;
            i++;
        }
        
        media = suma / A;
        System.out.println("El promedio es: "+ media);
    }
    
}
