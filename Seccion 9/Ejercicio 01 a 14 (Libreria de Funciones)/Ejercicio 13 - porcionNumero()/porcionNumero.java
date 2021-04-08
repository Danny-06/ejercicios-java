import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class porcionNumero { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número.\n> ");
    int e = Integer.parseInt(s.nextLine()); // Número

    System.out.print("Introduzca la posición inicial del intervalo a coger dentro del número.\n> ");
    int d1 = Integer.parseInt(s.nextLine()); // Dígito a buscar
    
    System.out.print("Introduzca la posición final del intervalo.\n> ");
    int d2 = Integer.parseInt(s.nextLine()); // Dígito a buscar

    System.out.println("El número resultante es " + porcionNumero(e,d1,d2) + ".");

  }

  
  
  // Función que toma como argumento un número y el valor del inicial y el valor final del intervalo para seleccionar esa porción del número 
  public static int porcionNumero(int n, int i1, int i2) {

    final int L = Integer.toString(n).length(); // Longitud del número


    int[] digitos = new int[L]; // Array que contendrá los dígitos del número

    // Pasar los dígitos del número al array
    for(int i = (L - 1); i >= 0; i--) {
      digitos[i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
      n /= 10;
    }

    // Generar el nuevo número
    int nuevoNumero = 0;
    for(int i = i1; i <= i2; i++) {
      nuevoNumero = nuevoNumero * 10 + digitos[i];
    }

    return nuevoNumero;

  }
  
  
  


}
