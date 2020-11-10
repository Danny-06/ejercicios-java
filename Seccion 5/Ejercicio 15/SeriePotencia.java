import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class SeriePotencia { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca la base y el exponente a calcular.");
    System.out.println();

    double b = s.nextInt(); // Base
    double e = s.nextInt(); // Exponente
    double r = 1;           // Resultado

    for(int n = 1; n <= e; n++) { // Realizar operación hasta que n sea igual que el exponente

      int i;
      if(n > 0) { // Si el exponente es '+'

        r = 1; // Reiniciar resultado para evitar que se acumule en cada iteración del bucle

        for(i = 1; i <= n; i++) {

          r = r * b; // Resultado igual a la base multiplicada por si misma el número de veces del exponente 

        }

      } else if(n == 0){ // Si el exponente es '0'

          r = 1; // Resultado igual a 1

      } else { // Si el exponente es '-'

        n = -n;

        for(i = 1; i <= n; i++) {

          r = r / b; // Resultado igual a la base dividida por si misma el número de veces del exponente 

        }

      }

      System.out.println();

      System.out.println(b + " elevado a " + n + " es igual a " + r);

    }

  }
}
