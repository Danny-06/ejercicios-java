import java.util.Scanner;
/**
 *
 *
 * @autor Daniel Fabián El Belaizi
 */
public class Primo { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca el número del cual quiere saber si es primo.");
    int entrada = s.nextInt();
    int e = entrada;

    System.out.println();

    int i;
    for(i = 2; i < e; i++) {

      if(e % i == 0) {

        System.out.println(e + " no es primo.");
        break;

      } else if(i == e -1){ System.out.println(e + " es primo."); }

    }
  }
}
