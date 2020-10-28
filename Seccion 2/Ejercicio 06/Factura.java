/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Factura { // Clase principal
  public static void main(String[] args) {
    
    // IVA 21%
    
    double baseImp = 54;
  

    System.out.printf("Base Imponible %.2f\n", baseImp       );
    System.out.printf("IVA            %.2f\n", baseImp * 0.21);
    System.out.println("____________________"                );
    System.out.printf("Total          %.2f\n", baseImp * 1.21);
    
  }
}
