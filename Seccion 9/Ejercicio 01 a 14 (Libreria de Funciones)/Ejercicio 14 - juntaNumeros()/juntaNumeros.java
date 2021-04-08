import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class juntaNumeros { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el 1er número a juntar.\n> ");
    int e1 = Integer.parseInt(s.nextLine()); // Número

    System.out.print("Introduzca el 2do número a juntar.\n> ");
    int e2 = Integer.parseInt(s.nextLine()); // Número


    System.out.println("El número resultante es " + juntaNumeros(e1,e2) + ".");

  }

  
  
  // Función que toma como argumento 2 números y los junta devolviendo un único número
  public static int juntaNumeros(int n1, int n2) {

    // Transformar los números en cadenas de texto para poder juntarlos
    String n1S = Integer.toString(n1);
    String n2S = Integer.toString(n2);
    

    // Generar el nuevo número
    String nuevoNumeroString = n1S + n2S;
    int nuevoNumero = Integer.parseInt(nuevoNumeroString);

    return nuevoNumero;

  }
  
  
  


}
