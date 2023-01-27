package andres.marulanda.javaparanovatoscap1;
/**
 *
 * @author Andres-Marulanda
 */
public class CorregirErrores {

    static int n1 = 50;
    
    public static void main(String[] args) {
        
        suma1();
        suma2();
        
        int cuad = cuadrado();
        System.out.println("\nEl cuadrado es: " + cuad); // Java diferencia minúsculas de mayúsculas.
    }
    
    public static void suma1 (){
        
       int n2 = 30, suma = 0, n3 = 20; // El error era que la variable n3 no habia sido inicializada, no tenía ningún valor
       suma = n1 + n2;
       
       System.out.println("La suma es: " + suma);
       
       suma = suma + n3;
       
       System.out.println("\nLa suma es: " + suma);
       
    }
    
    public static void suma2 (){
    
        byte n2 = 5, n3 = 6; // Declarar e inicializar varias variables del mismo tipo en una sola línea de código.
        int suma = 0;
        
        suma = n2 + n3;
        
        System.out.println("\nLa suma es: " + suma);
    }
    
    public static int cuadrado (){
    
        int n = 8;
        
        int cuad = n * n; // Una variable siempre debe ser declarada indicando su tipo.
        
        return cuad;
    
    }
    
}
