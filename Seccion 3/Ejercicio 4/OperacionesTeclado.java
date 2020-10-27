import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class OperacionesTeclado { // Clase principal
  public static void main(String[] args) {
    
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca los 2 números que desea sumar, restar, multiplicar y dividir.");
    
    double num1 = s.nextDouble();
    double num2 = s.nextDouble();
    
    System.out.println( "La Suma es: " + (num1 + num2) ); // Los parentesis son necesarios para que los sume y no los pongo uno junto al otro
    System.out.println( "La Resta es: " + (num1 - num2) ); // Los parentesis son necesarios para que no de error
    System.out.println( "La Multiplicación es: " + num1 * num2 );
    System.out.println( "La División es: " + num1 / num2 );
  }
}
