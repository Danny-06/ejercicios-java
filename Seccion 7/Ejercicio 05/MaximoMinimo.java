import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class MaximoMinimo { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);


    final int L = 4; // Longitud array
    int[] entrada = new int[L];
    System.out.print("Introduzca " + L + " numeros\n");
    for(int i = 0; i < L; i++) {

      entrada[i] = Integer.parseInt(s.nextLine());

    }

    int min = entrada[0];
    int max = entrada[0];

    for(int e : entrada) {
      // Mínimo
      if(e < min) {
        min = e;
      }
      // Máximo
      if(e > max) {
        max = e;
      }
    }
    

    System.out.println();
    for(int e : entrada) {
      System.out.print(e);

      if(e == max) {
        System.out.print(" (Máximo)");
      }
      if(e == min) {
        System.out.print(" (Mínimo)");
      }

      System.out.println();
    }

  }
}
