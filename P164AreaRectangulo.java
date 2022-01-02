package ejerciciosaceptaelreto;

import java.util.Scanner;

public class P164AreaRectangulo {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        int baseIzquierda;
        int baseDerecha;
        int alturaIzquierda;
        int alturaDerecha;
        int base;
        int altura;
        while (true) {
            baseIzquierda = datos.nextInt();
            alturaIzquierda = datos.nextInt();
            baseDerecha = datos.nextInt();
            alturaDerecha = datos.nextInt();
            //Para sacar la altura y la base.
            base = baseDerecha - baseIzquierda;
            altura = alturaDerecha - alturaIzquierda;
            if (base < 0 || altura < 0) {
                break;
            }
            System.out.println(base * altura);
        }
    }
}
