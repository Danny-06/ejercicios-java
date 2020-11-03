import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class CajaFuerte { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String clave = "5302"; // int clave = 5302;
    int intentos = 4;
    do {
      
      System.out.println("Introduzca la clave de 4 cifras de la caja fuerte.");
      String entrada = s.next(); // int entrada = s.nextInt();
      System.out.println();
      
      if(!entrada.equals(clave)) { // if(entrada != clave)
        
        intentos--;
        System.out.println("Error, la clave introducida es incorrecta vuelva a intentarlo.");
        System.out.println("Le quedan " + (intentos) + " intentos.\n");
        
      } else {
        
        System.out.println("Clave correcta, acceso permitido.");
        intentos = 0;
        
      }
      
    } while (intentos > 0 && intentos <= 4);
  }
}
