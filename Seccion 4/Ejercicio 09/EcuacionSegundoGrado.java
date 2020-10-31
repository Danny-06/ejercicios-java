import java.util.Scanner;
import java.lang.Math;

/**
 * 
 * 
 * @autor Daniel Fabián El Belaizi
 *
 */
 
public class EcuacionSegundoGrado {
  public static void main (String[] ars) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("ax² + bx + c = 0\n");
    
    System.out.println("Intruzca 'a'.");
    double a = s.nextDouble();
    System.out.println();
    
    System.out.println("Intruzca 'b'.");
    double b = s.nextDouble();
    System.out.println();
    
    System.out.println("Intruzca 'c'.");
    double c = s.nextDouble();
    System.out.println();

    double x;
  
    System.out.println( a + "x² + " + b + "x + " + c+ " = 0\n");
    
    if(a == 0 && b != 0 && c != 0) {
      
        x = -c / b;
        System.out.println("Como 'a' es 0 > Ecuación de 1er grado.\n");
        System.out.println("x es igual a: " + x);
        
    } else if(a != 0 && b == 0 && c != 0) {
        if(a * (-c) < 0) {
          System.out.println("[MATH ERROR]");
        } else {
                    
          x = Math.sqrt(-c / a);
          System.out.println("Como 'b' es 0 > Se despeja x y se hace la raiz.\n");
          System.out.println("x es igual a: " + x);
        
        }
    } else if(a != 0 && b != 0 && c == 0) {
        
        x = -b / a;
        System.out.println("Como 'c' es 0 > Ecuación de 1er grado con una de las soluciones siempre 0.\n");
        System.out.println("x es igual a: 0 y " + x);
        
    }  else { 
      
        double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / 2 * a;
        double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / 2 * a;
        
        System.out.println("x es igual a " + x1 + " y " + x2);
        
    }
    
  }
}
