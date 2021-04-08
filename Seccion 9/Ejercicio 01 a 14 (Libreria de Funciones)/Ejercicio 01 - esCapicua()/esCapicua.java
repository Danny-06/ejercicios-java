import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class esCapicua { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número para saber si es capicúa.\n> ");
    int e = Integer.parseInt(s.nextLine());

    if(esCapicua(e)) {
      System.out.println("\nEl número es capicúa.");
    } else {System.out.println("\nEl número no es capicúa.");}

  }

  // Función que comprueba si el número dado es devolviendo "true" o "false" al acabar
  public static boolean esCapicua(int x) { // El inverso (el número dado la vuelta) tiene que ser el mismo

    int n = x;
    int inverso = 0;

    String nS = Integer.toString(n); // Convertirlo a cadena de texto para saber su longitud

    for(int i = 0; i < nS.length(); i++) {
      inverso = (inverso * 10) + (n % 10);
      n /= 10;
    }

    //System.out.println("inverso = " + inverso); // console.log(inverso)

    if(x == inverso) {
      return true;
    } else {return false;}

  }



}
