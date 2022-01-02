package ejerciciosaceptaelreto;

import java.util.Scanner;

public class P368Huevos {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        int huevosIntroducidos;
        int capacidadOlla;
        int tiempococinar;
        do {
            huevosIntroducidos = datos.nextInt();
            capacidadOlla = datos.nextInt();
            tiempococinar = 10;
            if (huevosIntroducidos <= capacidadOlla && huevosIntroducidos != 0 && capacidadOlla != 0) {
                System.out.println(tiempococinar);
            } else if (huevosIntroducidos != 0 && capacidadOlla != 0) {
                do {
                    if (huevosIntroducidos > capacidadOlla) {
                        huevosIntroducidos = huevosIntroducidos - capacidadOlla;
                        tiempococinar += 10;
                    }
                } while (huevosIntroducidos > capacidadOlla);
                System.out.println(tiempococinar);
            }
        } while (huevosIntroducidos != 0 && capacidadOlla != 0);
    }
}
