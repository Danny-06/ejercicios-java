import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class DesplazarArray { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int l = 15; // Longitud array
    int[] entrada = new int[l];
    
    for(int i = 0; i < l; i++) {
      entrada[i] = Integer.parseInt(s.nextLine()); 
    }

    // Desplazar elementos del array un lugar a la derecha
    int ultimo = entrada[l-1]; // Ultimo valor del array
    for(int i = l-1; i >= 1; i--) {// Empezando desde el final cada posición adquiere al valor de su anterior
      entrada[i] = entrada[i-1];
    }

    entrada[0] = ultimo;

    // Dibujar
    for(int i = 0; i < l; i++) {
      System.out.println(i + ". " + entrada[i]);
    }

  }
}
