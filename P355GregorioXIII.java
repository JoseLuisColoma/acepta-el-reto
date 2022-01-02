package ejerciciosaceptaelreto;

import java.io.IOException;

public class P355GregorioXIII {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        final String BISIESTO = "29";
        final String NOBISIESTO = "28";
        final int MIN=1582;
        final int MAX=100000;
        {
            for (int i = 0; i < n; i++) {
                int anyo = Integer.parseInt(in.readLine());
                if (anyo > MIN && anyo < MAX) {
                    if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
                        System.out.println(BISIESTO);

                    } else {
                        System.out.println(NOBISIESTO);
                    }
                }

            }

        }

    }
}
