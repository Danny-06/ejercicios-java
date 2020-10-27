
import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class AreaTrianguloTeclado {
  public static void main(String[] ars) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println( "Introduzca la BASE y la ALTURA del triángulo cuyo área quiere calcular." );
    
    double base = s.nextDouble();
    double altura = s.nextDouble ();
    
    double area = (base * altura) / 2;
    
    System.out.println( "El área del triángulo es : " + area );

  }
}
