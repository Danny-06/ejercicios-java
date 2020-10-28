import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class HoraSaludo { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Escribe una hora (sin decimales).");
    
    int hora = s.nextInt();

    if(6 <= hora && hora <= 12) {
      System.out.print("Buenos días");
      
    } else if (13 <= hora && hora <= 20) {
      System.out.print("Buenos tardes");
      
    } else if (21 <= hora && hora <= 23 || 0 <= hora && hora <= 5) {
      System.out.print("Buenos noches");
      
    } else {System.out.print("Esa hora no existe");}
  }
}
