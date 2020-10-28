import java.util.Scanner;

/**
 * 
 * 
 * @auto Daniel Fabián El Belaizi
 *
 */
 
public class EcuacionG1 {
  public static void main (String[] ars) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("ax + b = 0");
    System.out.println("Intruzca el valor de 'a' y 'b' para resolver la ecuación.");
    double a = s.nextDouble();
    double b = s.nextDouble();
    
    double x = -b / a;
    
    System.out.println("El resultado es x = " + x);
  }
}
