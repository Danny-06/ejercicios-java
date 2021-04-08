import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class esPrimo { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número para saber si es primo.\n> ");
    int e = Integer.parseInt(s.nextLine());

    if(esPrimo(e)) {
      System.out.println("\nEl número es primo.");
    } else {System.out.println("\nEl número no es primo.");}

  }

  // Función que comprueba si el número dado es primo devolviendo "true" o "false" al acabar
  public static boolean esPrimo(int x) {

    int n = x;

    for(int i = 2; i < n || n == 1; i++) {
      if(n == 1) { // Si 'n' es igual a 1
        return true;
      } else

      if(n % i != 0) { // Comprobar si no es divisible con algún número
        if(i == n - 1) { // Devolver 'verdadero' en la última iteración. Sin esto, devolvería 'verdadero' la 1ra vez que viese que no es divisible
          return true;
        }
      } else {break;} // No es primo
    }
    return false;

  }


}
