import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Dados { // Clase principal
  public static void main(String[] args) {
    
    int dado1 = -1;
    int dado2 = -2;
    
    while(dado1 != dado2) {
      dado1 = (int)(Math.random() * 6) + 1;
      dado2 = (int)(Math.random() * 6) + 1;
      
      // Tiradas
      System.out.println(dado1 + "\t" + dado2 + "\n");
    }
    
  }
}
