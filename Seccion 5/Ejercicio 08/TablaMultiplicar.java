import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class TablaMultiplicar { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca el número del cual quiere obtener su tabla de multiplicar.");
    int entrada = s.nextInt();
    System.out.println();
    
    int i;
    for(i = 0; i <= 10; i++) {
    System.out.println(i * entrada);
    }
  }
}
