package andres.marulanda.javaparanovatoscap1;
/**
 * @author Andres-Marulanda
 */
public class CalcularValorExpresiones {

    final static byte a = 2;
    final static byte b = 5;
    final static byte c = 8;
    
    public static void main(String[] args) {
        
        float expresion1 = 0;
        float expresion2 = 0;
        float expresion3 = 0;
        float expresion4 = 0;
        float expresion5 = 0;
        float expresion6 = 0;
        float expresion7 = 0;
        float expresion8 = 0;
        float expresion9 = 0;
        float expresion10 = 0;
        
        expresion1 = 4 / 2 * 3 / 6 + 6 / 2 / 1 / 4 * 2;
        System.out.println("El valor de la expresión 1 es: " + expresion1);
        
        expresion2 = (7 * (10 - 5) % 3) * 4 + 9;
        System.out.println("El valor de la expresión 2 es: " + expresion2);
        
        expresion3 = (float) (3 * a - 4 * b / Math.pow(c, 2));
        System.out.println("El valor de la expresión 3 es: " + expresion3);
        
        expresion4 = 7 % 5 % 3;
        System.out.println("El valor de la expresión 4 es: " + expresion4);
        
        expresion5 = (float) (b * a - Math.pow(b,(2*4/c)));
        System.out.println("El valor de la expresión 5 es: " + expresion5);
        
        expresion6 = (float) Math.sqrt(Math.pow(b, 2));
        System.out.println("El valor de la expresión 6 es: " + expresion6);
        
        expresion7 = (((b + c) / 2 * a + 10) * 3 * b) - 6;
        System.out.println("El valor de la expresión 7 es: " + expresion7);
        
        expresion8 = (float) Math.sqrt(b * b);
        System.out.println("El valor de la expresión 8 es: " + expresion8);
        
        expresion9 = 7 / 2;
        System.out.println("El valor de la expresión 9 es: " + expresion9);
        
        expresion10 = Math.round(81.4) + Math.round(81.6);
        System.out.println("El valor de la expresión 10 es: " + expresion10);
        
    }
    
}
