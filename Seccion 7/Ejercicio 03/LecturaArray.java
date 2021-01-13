import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class LecturaArray { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    int[] entrada = new int[10];
    
    System.out.println("Introduzca 10 números");

    for(int i = 0; i < entrada.length; i++) {
      System.out.print("> ");
      entrada[i] = Integer.parseInt(s.nextLine());
    }

    System.out.println();

    for(int i = entrada.length - 1; i >= 0; i--) {
      System.out.println(10 - i +". " + entrada[i]);
    }

  }
}
