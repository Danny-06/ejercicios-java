//import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class NumeroCuadradoCubo { // Clase principal
  public static void main(String[] args) {

    //Scanner s = new Scanner(System.in);
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for(int i = 0; i < numero.length; i++) {// Array 'numero' definido
      numero[i] = (int)(Math.random() * 100) + 1; // Intervalo [0,100]
    }

    for(int i = 0; i < numero.length; i++) {// Array 'cuadrado' definido
      cuadrado[i] = numero[i] * numero[i];
    }

    for(int i = 0; i < numero.length; i++) {// Array 'cubo' definido
      cubo[i] = numero[i] * numero[i] * numero[i];
    }

    for(int i = 0; i < numero.length; i++) {// Dibujar arrays
      System.out.printf("[%3d,%5d,%7d]\n",
      numero[i],cuadrado[i],cubo[i]);
    }

  }
}
