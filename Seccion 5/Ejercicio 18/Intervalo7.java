import java.util.Scanner;
/**
 *
 *
 * @autor Daniel Fabián El Belaizi
 */
public class Intervalo7 { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca el número del cual quiere saber del los 100 números siguientes a ese número de 7 en 7:");
    boolean datoErroneo = false;
    
    int e1 = 0; // Entrada1 por teclado
    int e2 = 0; // Entrada2 por teclado
    
    do {
      e1 = s.nextInt();
      e2 = s.nextInt();
      if(e1 == e2 || e1 < 0 || e2 < 0) {
        datoErroneo = true;
        System.out.println("Los números introducidos deben ser diferente y positivos.");
      }
    } while(datoErroneo == true);
    
    System.out.println();

    for(int n = e1; n <= e2; n+=7) {
        System.out.println(n/7 + ")\t" + n);
    }

  }
}
