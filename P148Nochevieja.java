/*@author JLCT*/
package ejerciciosaceptaelreto;

import java.util.Scanner;

public class P148Nochevieja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horas, minutos;
        final int SEG_TOTALES_DIA = 86400;
        final int MIN_HORA = 60;
        final int SEG_MIN = 60;
        final String SALIDA = "00:00";

        String entrada;
        String[] tiempo = new String[1];

        int resultado = 0;

        entrada = sc.next();

        while (!entrada.equals(SALIDA)) {

            tiempo = entrada.split(":");
            horas = Integer.parseInt(tiempo[0]);
            minutos = Integer.parseInt(tiempo[1]);

            resultado = (SEG_TOTALES_DIA - ((horas * MIN_HORA * SEG_MIN) + (minutos * SEG_MIN))) / MIN_HORA;

            System.out.println(resultado);

            entrada = sc.next();
        }

    }
}
