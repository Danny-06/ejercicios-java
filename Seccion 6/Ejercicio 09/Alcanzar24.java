import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Alcanzar24 { // Clase principal
  public static void main(String[] args) {
    
    int i = 0;
    int contador = 0;
  
    while(i != 24) {
      i = (int)(Math.random() * 101);
      System.out.println(i);
      contador++;
    }
    
    System.out.print("\nSe han generado " + contador + " números.");
    
  }
}
