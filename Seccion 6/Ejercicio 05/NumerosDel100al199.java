
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class NumerosDel100al199 { // Clase principal
  public static void main(String[] args) {    
    
    System.out.println("Se van a mostrar de forma aleatoria 50 números del 100 al 199.");
    
    for(int i = 1; i <= 50; i++) {
      System.out.print((int)(Math.random() * 100 + 100) + " ");
    }
  }
}
