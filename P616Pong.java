package ejerciciosaceptaelreto;

import java.util.Scanner;

public class P616Pong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jugadorDerecha = 0;
        int jugadorIzquierda = 0;
        int n = 1, sumaSonidos = 0;
        final String sonidoRaqueta = "PIC";
        final String punto = "PONG!";
        String onomatopeya;

        while (n != 0) {
            n = sc.nextInt();

            if (n == 0 || n < 0) {
                break;
            }

            for (int i = 1; i <= n; i++) {

                onomatopeya = sc.next();

                if (onomatopeya.equalsIgnoreCase(sonidoRaqueta)) {
                    sumaSonidos++;
                }

                if (onomatopeya.equalsIgnoreCase(punto)) {

                    if (sumaSonidos % 2 == 0) {
                        jugadorIzquierda++;

                    } else {
                        jugadorDerecha++;

                    }

                }
            }

            System.out.println(jugadorIzquierda + " " + jugadorDerecha);

            jugadorDerecha = 0;
            jugadorIzquierda = 0;
            sumaSonidos = 0;
        }
    }

}
