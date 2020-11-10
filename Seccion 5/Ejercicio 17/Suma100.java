import java.util.Scanner;
/**
 *
 *
 * @autor Daniel Fabián El Belaizi
 */
public class Suma100 { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca el número del cual quiere saber del los 100 números siguientes a ese número:");
    
      int e = s.nextInt(); // Entrada por teclado
      int r = 0;           // Resultado

    System.out.println();
    if(e < 0) {

      System.out.println("ERROR, debe introducir un número positivo");
      
    } else {
        int n = e;
        for(n++; n <= e + 100; n++) {

          r = r + n;
          if(n == (e + 100)) {
            System.out.println("El resultado es " + r);
          }
        }
      }
  }
}
