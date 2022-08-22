package andres.marulanda.JavaParaNovatosCap1;
/**@author Andres-Marulanda*/

import java.util.Scanner;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa para imprimir varias palabras en diferentes colores.
        
        System.out.println("\033[33mAmarillo");
        System.out.println("\033[32m Verde");
        System.out.println("\033[31mRojo");
        System.out.println("\033[37m Blanco");
        System.out.println("\033[36mAzul cielo");
        System.out.println("\033[35m Violeta");
        System.out.println("\033[34mAzul agua marina");
        
        ImprimirNombre();
        ImprimirPalabrasEnIngles();
    }
    
    //Método para mostrar en pantalla un nombre ingresado desde el teclado.
    
    public static void ImprimirNombre (){
        
        String nombre = "";
        String direccion = "";
        String telefono = "";
        Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingrese el nombre para mostrar en pantalla: ");
        nombre = leer.nextLine(); //Para leer cadenas de caracteres desde el teclado usamos NextLine.
        System.out.println("Ingrese su dirección: ");
        direccion = leer.nextLine();
        System.out.println("Ingrese su número telefónico: ");
        telefono = leer.nextLine();
        
        System.out.println("Su nombre es : \n" + nombre);
        System.out.println("Su dirección es: \n" + direccion);
        System.out.println("Su número telefónico es: \n" + telefono + "\n");
    }  
    
    public static void ImprimirPalabrasEnIngles (){
        
        System.out.printf("%-10s %-10s\n", "English words", "Translate");
        System.out.printf("%-10s %-10s\n", "Mother", "Madre");
        System.out.printf("%-10s %-10s\n", "Father", "Padre");
        System.out.printf("%-10s %-10s\n", "Son", "Hijo");
        System.out.printf("%-10s %-10s\n", "Daughter", "Hija");
        System.out.printf("%-10s %-10s\n", "Granddaugther", "Nieta");
        System.out.printf("%10s %10s\n", "Grandson", "Nieto");
        System.out.printf("%10s %10s\n", "Grandfather", "Abuelo");
        System.out.printf("%10s %10s\n", "Grandmother", "Abuela");
        
    }
}
