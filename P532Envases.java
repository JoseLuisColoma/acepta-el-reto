package ejerciciosaceptaelreto;

import java.io.IOException;
import java.util.Scanner;

public class P532Envases {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int pesoTotal = 1, pesoNeto = 1, pesoEnvase;

        int n = in.nextInt();

        while (n != 0) {

            pesoNeto = in.nextInt();
            pesoTotal = in.nextInt();

            int resultado = pesoTotal - pesoNeto;
            System.out.println(resultado);
            n--;
        }

    }
}
