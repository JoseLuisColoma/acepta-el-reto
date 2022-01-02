package ejerciciosaceptaelreto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P217bis {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        int numero;
        List<Integer> num = new ArrayList<>();
        //numero = datos.nextInt();

        do {
            numero = datos.nextInt();
            if (numero != 0) {
                num.add(numero);
            }
        } while (numero != 0);

        for (int i = 0; i < num.size(); i++) {

            if (num.get(i) % 2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }
        }
    }
}
