import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class MaximoMinimo { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

/*
    for(int i = 0; i < array.length; i++) {
      // Introducción de datos mediante 'Números aleatorios' [n1,n2]
      int n1 = 0; // Número inicial del intervalo
      int n2 = -n1; // NO MODIFICAR
          n2 =+ 20; // Número final del intervalo

      array[i] = (int)(Math.random() * (n2 + 1)) + n1;

      // Entrada de datos a mano
      //array[i] = Integer.parseInt(s.nextLine);
    }
*/
    int l = 20; // Longitud array
    int[] entrada = new int[l];
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
    
    for(int i = 0; i < l; i++) {
      // Números aleatorios [n1,n2]
      int n1 = 0; // Número inicial del intervalo
      int n2 = -n1; // NO MODIFICAR 
          n2 =+ 20; // Número final del intervalo
      entrada[i] = (int)(Math.random() * (n2 + 1)) + n1;

      //entrada[i] = Integer.parseInt(s.nextLine);
      
      // Mínimo
      if(i != 0 && entrada[i] < entrada[i-1]) {
        min = i;
      } else if(i != 0 && i == (l-1) && entrada[0] < entrada[l-1]) {
        min = 0;
      }

      // Máximo
      if(i != 0 && entrada[i] > entrada[i-1]) {
        max = i;
      } else if(i != 0 && i == (l-1) && entrada[0] < entrada[l-1]) {
        max = 0;
      }
    }

    for(int i = 0; i < l; i++) {
      System.out.print(entrada[i]);

      if(i == max) {
        System.out.print(" (Máximo)");
      } else if(i == min) {
        System.out.print(" (Mínimo)");
      }

      System.out.println();
    }

  }
}
