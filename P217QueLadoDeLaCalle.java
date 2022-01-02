/*@author JLCT*/
package ejerciciosaceptaelreto;

import java.io.IOException;

/*@author JLCT*/
public class P217QueLadoDeLaCalle {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        int numero = Integer.parseInt(in.readLine());

        while (numero != 0) {

            if (numero % 2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }

           numero = Integer.parseInt(in.readLine());

        }

    }

}

