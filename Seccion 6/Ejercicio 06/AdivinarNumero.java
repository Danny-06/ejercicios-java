import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class AdivinarNumero { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Numero que tiene que adivinar el usuario
    int numero = (int)(Math.random() * 101);
    
    System.out.print("Adivina que número estoy pensando entre el 0 y el 100. Tienes 5 intentos.\n");
    int intentos = 5;
    int entrada = 0;
    while(intentos > 0) {
      System.out.print(">");
      entrada = Integer.parseInt(s.nextLine());
      if(entrada != numero) {
        
        intentos--;
        System.out.println("-Intentalo de nuevo.");
        System.out.println("-Te quedan " + intentos + " intentos.");
        
        if(entrada > numero) {
          
          System.out.print("-El número que has introducido es mayor que el estoy pensando.\n\n");
          
        } else { System.out.print("-El número que has introducido es menor que el estoy pensando.\n\n"); }
        
        if(intentos == 0) { System.out.print("-El número que estaba pensando era el " + numero + " ."); }
        
      } else {
        
        System.out.print("¡Enhorabuena lo has adivinado!");
        intentos = -1; // Cerrar bucle;
        
      }
    }
  }
}
