
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class _20NumerosHasta10 { // Clase principal
  public static void main(String[] args) {    
    
    System.out.println("Se van a mostrar de forma aleatoria 20 números del 1 al 10.");
    
    for(int i = 1; i <= 20; i++) {
      System.out.print((int)(Math.random() * 10 + 1) + " ");
    }
  }
}
