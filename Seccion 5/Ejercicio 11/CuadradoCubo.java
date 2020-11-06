import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class CuadradoCubo { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un número del cual quiere obtener su potencia 2 y 3 de los 4 números siguientes a él.");
    int entrada = s.nextInt();
    int e = entrada;
    
    System.out.println();

    while(e <= (entrada + 4)) {
      
        System.out.println((e) + "\t" + (e * e) + "\t" + (e * e * e));
        e++;
        
    }
  }
}
