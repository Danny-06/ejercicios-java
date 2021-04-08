import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class volteaNumeros { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número para voltearlo.\n> ");
    int e = Integer.parseInt(s.nextLine());
    
    System.out.println("El número volteado es "+ volteaNumeros(e) + ".");

  }

  
  
  // Función que toma como argumento un número y que devuelve el número volteado
  public static int volteaNumeros(int n) {

    var d = 0; // Variable que almacena el número volteado
    var m = n; // Copia de 'n', el número original

    for(int i = 1; i <= Integer.toString(n).length(); i++) { // Operar hasta alcanzar la cantidad de dígitos del número introducido 'n'
      d = d * 10 + m % 10; // Añadir dígitos a 'd'
      m /= 10; // Reducir 'm' para ir cogiendo los dígitos
    }

    return d; // Número dado la vuelta

  }
  
  
  


}
