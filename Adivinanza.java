package andres.marulanda.JavaParaNovatosCap1;
/**
 * @author Andres-Marulanda
 */
public class Adivinanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte num = 5;
        byte num1 = 0;
        
        num += num - 1 * 4 + 1; // 7
        System.err.println(num);
        
        num = 4;
        num1 = (byte) ((num %= 7) * (num %= 3) * 7);
        System.err.println(num1); 
    }
    
}
