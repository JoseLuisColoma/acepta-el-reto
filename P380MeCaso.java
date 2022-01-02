//@author JLCT
package ejerciciosaceptaelreto;

import java.util.Scanner;

public class P380MeCaso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma;
        
        do {
            suma = 0;
            num = sc.nextInt();

            if (num != 0) {

                for (int i = 1; i <= num; i++) {
                    suma += sc.nextInt();
                }
                
                System.out.println(suma);
            }

        } while (num != 0 && num >0 && num<=50000);
    }

}