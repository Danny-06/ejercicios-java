import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class suprimirDigitosDerecha { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número.\n> ");
    int e = Integer.parseInt(s.nextLine()); // Número

    System.out.print("Introduzca la cantidad de dígitos que quiere eliminar por la derecha del número.\n> ");
    int d = Integer.parseInt(s.nextLine()); // Dígito a buscar
    
    System.out.println("El número resultante es " + suprimirDigitosDerecha(e,d) + ".");

  }

  
  
  // Función que toma como argumento un número y la cantidad de dígitos que se desea borrar por la derecha
  public static int suprimirDigitosDerecha(int n, int cantidad) {

    final int L = Integer.toString(n).length(); // Longitud del número

    int[] digitos = new int[L]; // Array que contendrá los dígitos del número

    // Pasar los dígitos del número al array
    for(int i = 0; i < L; i++) {
      digitos[(L-1) - i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
      n /= 10;
    }

    // Crear el nuevo número
    int nuevoNumero = 0;
    for(int i = 0; i < L - cantidad; i++) {
      nuevoNumero = nuevoNumero * 10 + digitos[i]; // Introducción de dígitos en 'nuevoNumero' limitando los digitos de los que se compodrá con 'cantidad'
    }


    return nuevoNumero;

  }
  
  
  


}
