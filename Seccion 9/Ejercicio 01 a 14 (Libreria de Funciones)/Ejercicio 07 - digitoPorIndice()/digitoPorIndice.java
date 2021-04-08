import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class digitoPorIndice { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número.\n> ");
    int e = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el indice del digito que quiere obtener.\n> ");
    int indice = Integer.parseInt(s.nextLine());
    
    System.out.println("El dígito con indice " + indice + " del número \'" + e + "\' es " + digitoPorIndice(e,indice) + ".");

  }

  
  
  // Función que toma como argumento un número y un indice y que obtiene el dígito correspondiente del número dado
  public static int digitoPorIndice(int n, int index) {

    final int L = Integer.toString(n).length(); // Longitud del número
    //System.out.println("\nconsole.log(Longitud = "+L+")\n");

    int[] digitos = new int[L]; // Array que contendrá los dígitos del número

    for(int i = 0; i < L; i++) {
      digitos[i] = n % 10;
      n /= 10;
      //System.out.println("console.log(digitos["+i+"] = "+digitos[i]+")");
    }

    //System.out.println();

    return digitos[(L - 1) - index];

  }
  
  
  


}
