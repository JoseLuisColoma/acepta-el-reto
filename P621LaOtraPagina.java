/*@author JLCT*/
package p621.laOtraPagina;

import java.util.Scanner;

public class P621LaOtraPagina {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int pagina;
    int casos = sc.nextInt();
    

    while (casos != 0) {
      pagina = sc.nextInt();

      if (pagina >= 2 && pagina <= 1000) {
        if (pagina % 2 == 0) {
          pagina++;
        } else {
          pagina--;
        }

      }

      System.out.println(pagina);
      pagina = 0;

      casos--;
    }

  }

}
