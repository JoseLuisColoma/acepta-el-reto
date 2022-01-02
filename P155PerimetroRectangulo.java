/*@author JLCT*/
package ejerciciosaceptaelreto;

import java.util.Scanner;

public class P155PerimetroRectangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int altura = sc.nextInt();
        
        int perimetro = 0;
        final int MAX = 100000000;

        while ((base >= 0 && base<=MAX) && (altura >= 0 && altura<=MAX)) {
         
                perimetro = 2 * base + 2 * altura;
                System.out.println(perimetro);
            
            base = sc.nextInt();
            altura = sc.nextInt();

            if (base < 0) {
                break;
            }
            if (altura < 0) {
                break;
            }
        }

    }

}