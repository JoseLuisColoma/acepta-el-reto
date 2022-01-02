/*@author JLCT*/
package ejerciciosaceptaelreto;

import java.io.IOException;
import java.util.Scanner;

public class P157DiasFaltan {

    public static void main(String[] args) throws IOException {
        
        final int MESES_ANYO=12;
        
        int[] diasMes= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);

        int dia, mes, res;
        int casos = sc.nextInt();

        while (casos-- != 0) {

            dia = sc.nextInt();
            mes = sc.nextInt();

            res = diasMes[mes - 1] - dia;
            for (int i = mes; i < MESES_ANYO; i++) {
                res += diasMes[i];
            }

            System.out.println(res);
        }

    }

}
