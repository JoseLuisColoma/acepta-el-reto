/*@author JLCT*/
package ejerciciosaceptaelreto;

import java.io.IOException;

public class P116HolaMundo {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        if (n >= 0 && n <= 5) {
            for (int i = 0; i < n; i++) {

                System.out.println("Hola mundo.");
            }
        }
    }
}