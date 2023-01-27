package andres.marulanda.javaparanovatoscap1;
/**
 * @author Andres-Marulanda
 */
public class FuncionaONoFunciona {

    public static void main(String[] args) {
        
        int a = 'a';
        System.out.println(a); // Muestra en pantalla el valor ASCII del caracter a (97).
        
        int pi = (int) 3.14; // Inicialmente no funciona ya que el IDE nos pidió hacer el casteo a int.
        System.out.println(pi); // 3.
        
        double pi1 = 3.14; // Inicialmente no funciona ya que los decimales se deben separar con un punto.
        System.out.println(pi1);
        
        boolean adivina = (1 == 4); // False.
        System.out.println(adivina);
        
         boolean adivina1 = ((1 == 'a') == false); 
         System.out.println(adivina1);
        
        // boolean adivina2 = (97 == 'a' == 97);
        // System.out.println(adivina2);
        // Incompatibilidad de tipos de variables, no puedo comparar tipos.
        // de variables diferentes. 
        
        boolean adivina3 = ((97 == 'a') && true); // True.
        System.out.println(adivina3);
        
        int a1 = 1;
        boolean b = a1 > 1; // Incompatibilidad del tipo de variables.
        System.out.println(b); // False.
        
        short a2 = 200;
        System.out.println(a2);
    }
    
}
