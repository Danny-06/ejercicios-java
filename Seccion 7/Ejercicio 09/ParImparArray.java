import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class ParImparArray { // Clase principal
  public static void main(String[] args) {



    Scanner s = new Scanner(System.in);
    //int e = Integer.parseInt(s.nextLine());

    int L = 8; // Longitud array
    int[] numeros = new int[L];
    boolean par = true;
    
    System.out.println("Introduzca 8 números enteros");
    for(int i = 0; i < L; i++) {
      System.out.print("> ");
      numeros[i] = Integer.parseInt(s.nextLine()); // Entrada
    }

    System.out.println();

    // Dibujar
    for(int i = 0; i < L; i++) {
      if(numeros[i] % 2 == 0) {
        par = true;
      } else {par = false;}

      System.out.println(numeros[i] + ". \"" + (par ? "Par" : "Impar") + "\"");
    }


  }
}
