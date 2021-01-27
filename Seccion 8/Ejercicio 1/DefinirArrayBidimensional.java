import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class DefinirArrayBidimensional { // Clase principal
  public static void main(String[] args) {



    Scanner s = new Scanner(System.in);
    //int e = Integer.parseInt(s.nextLine());

    //int X = 6; // Anchura array
    //int Y = 3; // Altura array
    int[][] numeros = {
      {0,30,2,0,0,5},
      {75,0,0,0,0,0},
      {0,0,-2,9,0,11}
    };

    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 6; j++) {
        System.out.print(numeros[i][j] + " ");
      }
      System.out.println();
    }



    
  }
}
