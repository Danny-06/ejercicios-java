
import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class AreaRectanguloTeclado {
  public static void main(String[] ars) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println( "Introduzca la BASE y la ALTURA del rectángulo cuyo área quiere calcular." );
    
    double base = s.nextDouble();
    double altura = s.nextDouble ();
    
    double area = base * altura;
    
    System.out.println( "El área del rectángulo es : " + area );

  }
}
