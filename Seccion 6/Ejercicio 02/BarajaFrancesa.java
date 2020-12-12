
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class BarajaFrancesa { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Se va a mostrar un carta al azar de la baraja francesa.\n");
    
    int valorC = (int)(Math.random() * 12) + 1;
    String carta = "";
    
    int valorP = (int)(Math.random() * 3) + 1;
    String palo = "";
    
    // Definición del valor de la carta
    if(valorC != 1 && valorC <= 10) {
      carta = String.valueOf(valorC);
    } else {
    
      switch(valorC) {
        
        case 1:
          carta = "A";
          break;
          
        case 11:
          carta = "J";
          break;
          
        case 12:
          carta = "K";
          break;
          
        case 13:
          carta = "L";
          break;
        
        default:
        
      }
      
    }
      
      // Definición del palo de la carta
      switch(valorP) {
        
        case 1:
          palo = "picas";
          break;
          
        case 2:
          palo = "corazones";
          break;
          
        case 3:
          palo = "diamantes";
          break;
          
        case 4:
          palo = "tréboles";
          break;
        
        default:
        
      }
      
      System.out.print("Ha salido el: " + carta + " de " + palo + ".");
    
  }
}
