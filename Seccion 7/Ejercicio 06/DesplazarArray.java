import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class DesplazarArray { // Clase principal
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
    int l = 15; // Longitud array
    int[] entrada = new int[l];
    
    for(int i = 0; i < l; i++) {
      // Números aleatorios [n1,n2]
      int n1 = 0; // Número inicial del intervalo
      int n2 = -n1; // NO MODIFICAR 
          n2 =+ 20; // Número final del intervalo
      entrada[i] = (int)(Math.random() * (n2 + 1)) + n1;

      //entrada[i] = Integer.parseInt(s.nextLine); 
    }

    // Desplazar elementos del array un lugar a la derecha
    for(int i = 0; i < l; i++) {
      f
    }

    // Dibujar
    for(int i = 0; i < l; i++) {
      System.out.println(i + ". " + entrada[i]);
    }

  }
}
