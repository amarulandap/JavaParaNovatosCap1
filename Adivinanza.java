package andres.marulanda.javaparanovatoscap1;
/**
 *
 * @author Andres-Marulanda
 */
public class Adivinanza {

    
    public static void main(String[] args) {
        
        int num = 5;
        
        num += num - 1 * 4 + 1; // num = 5 + 5 - 1 * 4 + 1 = 5 + 5 - 4 + 1 = 7.
        System.out.println(num);
        
        num = 4;
        
        num %= 7 * num % 3 * 7; // num = 4 % (7 * 1 * 7) = 4.
         System.out.println(num);
    }
    
}
