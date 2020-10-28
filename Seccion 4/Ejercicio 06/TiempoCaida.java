import java.util.Scanner;

// Función para hacer raices
import java.lang.Math;
/**
 * 
 * 
 * @autor Daniel Fabián El Belaizi
 *
 */
 
public class TiempoCaida {
  public static void main (String[] ars) {
    
    Scanner s = new Scanner(System.in);
    
    double g = 9.81;
    System.out.println("Intruzca el valor de la altura en metros para hallar cuanto tardará en caer al suelo.");
    double h = s.nextDouble();
    
    // t al cuadrado   
    double t = (2 * h) / g;
    // t elevado a 1
    // Función importada para hacer raices
    t = Math.sqrt(t);
    
    System.out.printf("El resultado es %.2fs", t);
  }
}
