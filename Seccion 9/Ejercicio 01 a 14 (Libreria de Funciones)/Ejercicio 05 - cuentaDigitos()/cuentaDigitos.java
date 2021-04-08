import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class cuentaDigitos { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número para saber cuantos dígitos tiene.\n> ");
    int e = inputInt();
    
    println("El número " + e + " tiene " + cuentaDigitos(e) + " dígitos.");

  }


  
  // Función que toma como argumento un número y que devuelve el número de dígitos que tiene
  public static int cuentaDigitos(int n) {

    var d = Integer.toString(n); // Almacena el número dado como cadena de texto

    return d.length(); // Longitud de la cadena de texto que equivale al número de digitos del número

  }

  // Imprimir texto en pantalla
  public static void println(String texto) {
    System.out.println(texto);
  }
  
  // Función que automatiza la entrada de texto por teclado
  public static int inputInt() {
    Scanner s = new Scanner(System.in);
    int n = Integer.parseInt(s.nextLine());
    return n;
  }  
  


}
