package andres.marulanda.JavaParaNovatosCap1;
/**
 * @author Andres-Marulanda
 */
public class Incognita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 0x100; //Un valor literal es la representación de un valor fijo en el código fuente de un programa.
        i = i >>> 3;
        
        /**Los valores correspondientes a los tipos de datos numéricos enteros (byte, short, int y long) se pueden expresar usando
         * el sistema numérico decimal, octal o hexadecimal. Los números en sistema decimal se expresan de la manera habitual, 
         * simplemente escribiendo su valor con los dígitos numéricos, por ejemplo, 284. No se pueden emplear separadores de 
         * millares, por lo que para indicar el valor 1.000.000 (un millón) se debe escribir como 1000000. Para representar 
         * valores negativos se añade el carácter "-" (guión) delante del número, como es habitual es la escritura normal, por 
         * ejemplo, -387.
         * Para representar un valor numérico entero en sistema octal, debe ir precedido del carácter 0 (cero), por ejemplo, el 
         * valor 284 se representa en octal como 0434. Así mismo, para representar un valor en el sistema hexadecimal, se debe 
         * emplear el prefijo 0x, por lo que el valor 284 se representa en hexadecimal como 0x11C.
         * Por defecto, los valores literales numéricos enteros se almacenan en memoria con el formato del tipo de dato "int". Si 
         * se desea almacenar como "long", con el fin de poder obtener resultados con valores muy altos en los cálculos, se debe 
         * emplear el sufijo L en mayúscula o minúscula (sería recomendable utilizar la L mayúscula por el parecido de la letra 
         * minúscula con el valor 1). Por ejemplo, el valor 284L correspondería al valor entero 284 utilizando 64 bits (tipo long) para almacenarlo en memoria.
         * Para representar valores literales de los tipos de datos numéricos reales (float y double) se puede emplear el sistema decimal o 
         * la notación científica. En el sistema decimal se expresan los números con parte decimal de la forma usual, utilizando el punto 
         * como separador de la parte entera y decimal. En este caso tampoco se puede emplear los separadores de millares. Así, por ejemplo, 
         * el valor 21.843,83 se debe expresar como 21843.83 en el código fuente.
         * reales expresados en notación científica deben emplear la letra "E" o "e" para  separar la parte correspondiente al 
         * exponente. El valor 7,433·106 se debe expresar como 7.433e6 en el código fuente. Si el exponente es negativo se 
         * escribe el guión detrás de la letra E, por ejemplo, 7,433·10-6 se expresa como 7.433e-6, y si el valor es negativo se 
         * indica el guión al principio, por ejemplo, -7,433·106 se expresa como -7.433e6.
         * Por defecto, los valores literales numéricos reales se almacenan en memoria con el formato del tipo de dato "double". 
         * Si se desea almacenar como "float", con el fin de emplear menos espacio de memoria y necesitar menos precisión en los 
         * resultados de los cálculos, se debe emplear el sufijo F en mayúscula o minúscula. Por ejemplo, el valor 21843.83F 
         * correspondería al valor entero 21843.83 utilizando 32 bits (tipo float) para almacenarlo en memoria, en vez de 64 bits.
         * 
         * >>>, Operador de cambio a la derecha sin signo: desplaza los bits del número a la derecha y llena con «0» los bits 
         * desplazados. 
         * El bit más a la izquierda se establece en 0.
         */
        System.err.println(i);
    }
    
}
