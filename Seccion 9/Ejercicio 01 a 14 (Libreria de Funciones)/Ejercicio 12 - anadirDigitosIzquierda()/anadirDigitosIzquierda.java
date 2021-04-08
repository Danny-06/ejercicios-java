import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class anadirDigitosIzquierda { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número.\n> ");
    int e = Integer.parseInt(s.nextLine()); // Número

    System.out.print("Introduzca la cantidad de dígitos que quiere añadir por la izquierda del número.\n> ");
    int d = Integer.parseInt(s.nextLine()); // Dígito a buscar
    
    System.out.println("El número resultante es " + anadirDigitosIzquierda(e,d) + ".");

  }

  
  
  // Función que toma como argumento un número y el conjunto de números que se desea añadir a la izquierda
  public static int anadirDigitosIzquierda(int n, int cantidad) {

    final int L = Integer.toString(n).length(); // Longitud del número

    final int CL = Integer.toString(cantidad).length();; // Longitud del número a añadir

    int[] digitos = new int[L + CL]; // Array que contendrá los dígitos del número

    // Pasar los dígitos del número al array
    // [cantidad | (n)]
    for(int i = (L + CL) - 1; i >= 0; i--) {
      digitos[i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
      n /= 10;
    }

    // Pasar 'cantidad' a la izquierda del array
    // [(cantidad) | n]
    for(int i = (CL - 1); i >= 0; i--) {
      digitos[i] = cantidad % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
      cantidad /= 10;
    }

    // Crear el nuevo número == [cantidad | n]
    int nuevoNumero = 0;
    for(int i = 0; i < L + CL; i++) {
      nuevoNumero = nuevoNumero * 10 + digitos[i];
    }

    return nuevoNumero;

  }
  
  
  


}
