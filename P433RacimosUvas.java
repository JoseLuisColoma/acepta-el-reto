//@author JLCT
package ejerciciosaceptaelreto;

import java.io.IOException;

public class P433RacimosUvas {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        int uvasRacimo = Integer.parseInt(in.readLine());
        
        final int MIN = 0;
        final int MAX = 1000000;

        while (uvasRacimo != 0) {
            if (uvasRacimo > MIN && uvasRacimo <= MAX) {
                int uvasAcumuladas = 0;
                for (int nivel = 1; nivel <= uvasRacimo; nivel++) {
                    uvasAcumuladas += nivel;

                    if (uvasAcumuladas >= uvasRacimo) {
                        System.out.println(nivel);
                        break;
                    }
                    
                }
                uvasRacimo = Integer.parseInt(in.readLine());
            }else{
                System.out.println("Introduce de nuevo una cantidad de uvas correcta");
                uvasRacimo = Integer.parseInt(in.readLine());
            }

        }

    }

}
