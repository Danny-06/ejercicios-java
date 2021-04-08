import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class siguientePrimo { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número para saber su primo más cercano.\n> ");
    int e = Integer.parseInt(s.nextLine());
    
    System.out.println("El primo más cercano de " + e + " es " + siguientePrimo(e));

  }

  
  // Depende de la función 'esPrimo()'
  // Función que localiza el número primo más cercano del número que se le pasa como argumento devolviendo dicho número primo más cercano al acabar
  public static int siguientePrimo(int x) {

    int n = x + 1;

    while(!esPrimo(n)) { // Mientras no sea primo aumentar 'n' hasta dar con el siguiente primo
      n++;
    }

    return n;

  }
  
  
  // Función que comprueba si el número dado es primo devolviendo "true" o "false" al acabar
  public static boolean esPrimo(int x) {

    int n = x;

    for(int i = 2; i < n; i++) {
      if(n % i != 0) { // Comprobar si en algun momento es divisible con algún número
        if(i == n - 1) {
          return true;
        }
      } else {break;} // No es primo
    }
    return false;

  }


}
