import java.util.Scanner;

/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Multiplicacion { // Clase principal
  public static void main(String[] args) {
    
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca los 2 números que desea multiplicar.");
    
    double num1 = s.nextDouble();
    double num2 = s.nextDouble();
    
    System.out.println( "El resultado es: " + num1 * num2 );
  }
}
