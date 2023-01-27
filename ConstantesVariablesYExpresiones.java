package andres.marulanda.javaparanovatoscap1;
/**@author Andres-Marulanda*/

// Importamos los paquetes que necesitamos

import java.util.Scanner;

public class ConstantesVariablesYExpresiones {

    // Declarar las variables y constantes globales
    
    final static double PI = 3.14159; //Constante
    static short base = 0;            //Variable  
    static int Area = 0;
    static Scanner leer = new Scanner(System.in); //Variable para capturar datos desde el teclado.
    
    // Todas las constantes y variables globales deben ser tipo static.
    
    public static void main(String[] args) {
       
        System.out.println("CALCULAR EL ÁREA DE UN CUADRADO");
        AreaCuadrado();
        
        System.out.println("\nCALCULAR EL ÁREA DE UN RECTÁNGULO");
        AreaRectangulo();
        
        System.out.println("\nCALCULAR EL ÁREA DE UN TRIÁNGULO");
        AreaTriangulo();
        
        System.out.println("\nCALCULAR EL ÁREA DE UN PARALELOGRAMO");
        AreaParalelogramo();
        
        System.out.println("\nCALCULAR EL ÁREA DE UN TRAPECIO");
        AreaTrapecio();
        
        System.out.println("\nCALCULAR EL ÁREA DE UN CIRCULO");
        AreaCirculo();
        
        System.out.println("\nCALCULAR EL ÁREA DE UN ROMBO");
        AreaRombo();
        //AreaPoligono();
    }
    
    // Todos los métodos serán tipo void ya que no retornarán ningún valor.
    
    public static void AreaCuadrado(){
        
        byte ladoCuadrado = 0;
    
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        ladoCuadrado = leer.nextByte();
        
        Area = (int) Math.pow(ladoCuadrado, 2);
        
        System.out.println("El Área del cuadrado es: " + Area);
    }
    
    public static void AreaRectangulo(){
    
        byte altura = 0;
        
        System.out.println("Ingrese el valor de la altura: ");
        altura = leer.nextByte();
        
        System.out.println("Ingrese el valor de la base: ");
        base = leer.nextShort();
        
        Area = base * altura;
        
        System.out.println("El Área del Rectángulo es: " + Area);
    }
    
    public static void AreaTriangulo(){
    
        byte altura = 0;
        
        System.out.println("Ingrese el valor de la altura: ");
        altura = leer.nextByte();
        
        System.out.println("Ingrese el valor de la base: ");
        base = leer.nextShort();
        
        Area = (base * altura) / 2;
        
        System.out.println("El Área del Triangulo es: " + Area);
    }
    
    public static void AreaParalelogramo(){
    
        byte altura = 0;
        
        System.out.println("Ingrese el valor de la altura: ");
        altura = leer.nextByte();
        
        System.out.println("Ingrese el valor de la base: ");
        base = leer.nextShort();
        
        Area = base * altura;
        
        System.out.println("El Área del Paralelogramo es: " + Area);
    }
    
    public static void AreaTrapecio(){
    
        byte altura = 0;
        short segundaBase = 0;
        
        System.out.println("Ingrese el valor de la base: ");
        base = leer.nextShort();
        
        System.out.println("Ingrese el valor de la altura: ");
        altura = leer.nextByte();
        
        System.out.println("Ingrese el valor de la segunda base: ");
        segundaBase = leer.nextShort();
        
        Area = ((segundaBase + base) / 2) * altura;
        
        System.out.println("El Área del Trapecio es: " + Area);
        
    }
    
    public static void AreaCirculo(){
    
        byte radio = 0;
        
        System.out.println("Ingrese el valor del radio: ");
        radio = leer.nextByte();
        
        Area = (int) (PI * Math.pow(radio, 2));
        
        System.out.println("El Área del Circulo es: " + Area);
    
    }
    
    public static void AreaRombo (){
    
        byte diagonal1 = 0;
        byte diagonal2 = 0;
        
        System.out.println("Ingrese el valor de la diagonal 1: ");
        diagonal1 = leer.nextByte();
        
        System.out.println("Ingrese el valor de la diagonal 2: ");
        diagonal2 = leer.nextByte();
        
        Area = (diagonal1 * diagonal2) / 2;
        
        System.out.println("El Área del Rombo es: " + Area);
    
    }
    
}
