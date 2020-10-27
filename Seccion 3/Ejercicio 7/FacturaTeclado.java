import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class FacturaTeclado { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // IVA 21%
    
    System.out.println("Introduzca la base imponible de la factura.");
    
    double baseImp = s.nextDouble();
    
    System.out.println();

    System.out.printf("Base Imponible %.2f\n", baseImp       );
    System.out.printf("IVA            %.2f\n", baseImp * 0.21);
    System.out.println("____________________"                );
    System.out.printf("Total          %.2f\n", baseImp * 1.21);
    
  }
}
