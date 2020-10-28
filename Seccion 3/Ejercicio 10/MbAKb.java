import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class MbAKb { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // IVA 21%
    
    System.out.println("Introduzca los Mb que quiere covertir a Kb.");
    //Horas por el dinero ganado cada hora
    double Mb = s.nextDouble();
    double Kb = Mb * 1000;
    
    System.out.println();

    System.out.printf( Mb + " Mb son: " + Kb + " Kb" );
  }
}
