import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Media { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    double media = 0;
    int contadorMedia = 0;
    
    System.out.println("Introduzca los números positivos de los cuales quiere obtener su media.");
    System.out.println("Introduzca un número negativo para dejar de introucir números y se muestre la media.\n");
    
    long i = 0;
    while(i >= 0) {
      
        long entrada = s.nextLong();
        i = entrada;
        if(i >= 0) {
          
          media = media + entrada;
          contadorMedia++;
          
        }
    }
    
    System.out.println();
    System.out.println("La media de los números introducidos es " + (media) / contadorMedia);
  
  }
}
