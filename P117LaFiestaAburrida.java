/*@author JLCT*/

package ejerciciosaceptaelreto;

import java.io.IOException;

public class P117LaFiestaAburrida {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int i;
        String[] saludo = new String[n];
        String[] nombre = new String[n];
        
        for (i = 0; i < n; i++) {
            saludo[i] = in.readLine();
            nombre[i] = saludo[i].substring(4);
        }
        
        for (i = 0; i < n; i++) {
            if (nombre[i].length() >= 0 && nombre[i].length() <= 100) {
                System.out.println("Hola, " + nombre[i] + ".");
            }
        }
    }
}
