package ejerciciosaceptaelreto;

import java.util.Scanner;

public class P158SaltosMario {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int saltosArriba, saltosAbajo, muros, muroAntes, muroDespues;

        int numCasos = datos.nextInt();

        while (numCasos != 0) {
            
            muros = datos.nextInt();
            saltosArriba=0;
            saltosAbajo=0;

            if (muros > 0) {
                
                muroAntes=datos.nextInt();
                
                for (int i = 0; i < muros-1; i++) {
                    muroDespues=datos.nextInt();
                    
                    if (muroAntes < muroDespues) {
                        saltosArriba++;
                    } 
                        
                    if (muroAntes > muroDespues) {
                        saltosAbajo++;
                    }

                    muroAntes=muroDespues;

                }

            }

            System.out.println(saltosArriba + " " + saltosAbajo);
            saltosArriba = 0;
            saltosAbajo = 0;
            numCasos--;

        }
    }

}
