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

      int i;
      if(e > 0) { // Si el exponente es '+'

        for(i = 1; i <= e; i++) {

          r = r * b; // Resultado igual a la base multiplicada por si misma el número de veces del exponente 

        }

      } else if(e == 0){ // Si el exponente es '0'

          r = 1; // Resultado igual a 1

      } else { // Si el exponente es '-'

        e = -e;

        for(i = 1; i <= e; i++) {

          r = r / b; // Resultado igual a la base dividida por si misma el número de veces del exponente 

        }

      }

      System.out.println();

      System.out.println(b + " elevado a " + e + " es igual a " + r);

  }
}
