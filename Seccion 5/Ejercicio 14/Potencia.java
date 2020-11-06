import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Potencia { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la base y el exponente a calcular.");
    System.out.println();
    
    double b = s.nextInt(); // Base
    double e = s.nextInt(); // Exponente
    double r = 1;           // Resultado
    
    if(e > 0) {
      
      int i;
      for(i = 1; i <= e; i++) {

        r = r * b;

      }
        
    } else if(e == 0){
      
        r = 1;
      
      } else {
        
        e = -e;
        
        int i;
        for(i = 1; i <= e; i++) {

        r = r / b;

      }
        
      }
    
    System.out.println();
    
    System.out.println(b + " elevado a " + e + " es igual a " + r);
    
  }
}
