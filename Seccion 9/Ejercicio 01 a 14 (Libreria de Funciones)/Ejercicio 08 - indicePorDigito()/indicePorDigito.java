import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class indicePorDigito { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número.\n> ");
    int e = Integer.parseInt(s.nextLine()); // Número

    System.out.print("Introduzca el dígito del cual quiere obtener su indice.\n> ");
    int d = Integer.parseInt(s.nextLine()); // Dígito a buscar
    
    System.out.println("El indice del dígito " + d + " del número \'" + e + "\' es " + indicePorDigito(e,d) + ".");

  }

  
  
  // Función que toma como argumento un número y un digito y que obtiene el indice de la 1ª ocurrencia del dígito del número dado
  public static int indicePorDigito(int n, int digito) {

    final int L = Integer.toString(n).length(); // Longitud del número
    //System.out.println("\nconsole.log(Longitud = "+L+")\n");

    int[] digitos = new int[L]; // Array que contendrá los dígitos del número
    int index = -1;

    for(int i = 0; i < L; i++) {
      digitos[(L-1) - i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
      n /= 10;
      if(digitos[i] == digito && index == -1) {
        index = i;
      }
    }


    return index;

  }
  
  
  


}
