import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class KbAMb { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // IVA 21%
    
    System.out.println("Introduzca los Kb que quiere covertir a Mb.");
    //Horas por el dinero ganado cada hora
    double Kb = s.nextDouble();
    double Mb = Kb / 1000;
    
    System.out.println();

    System.out.printf( Kb + " Kb son: " + Mb + " Mb" );
  }
}
