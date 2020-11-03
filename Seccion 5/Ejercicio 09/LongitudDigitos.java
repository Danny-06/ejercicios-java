import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class LongitudDigitos { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un número cualquiera para hallar la cantidad de dígitos que lo componen.");
    long entrada = s.nextInt();
    System.out.println();
    
    int i;
    for(i = 0; i <= 10; i++) {
    System.out.println(i * entrada);
    }
  }
}
