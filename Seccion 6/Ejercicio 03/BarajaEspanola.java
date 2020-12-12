
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class BarajaEspanola { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Se va a mostrar un carta al azar de la baraja española.\n");
    
    int valorC = (int)(Math.random() * 9) + 1;
    String carta = "";
    
    int valorP = (int)(Math.random() * 3) + 1;
    String palo = "";
    
    // Definición del valor de la carta
    if(valorC != 1 && valorC <= 10) {
      carta = String.valueOf(valorC);
    } else {
    
      switch(valorC) {
        
        case 1:
          carta = "AS";
          break;
          
        case 8:
          carta = "Sota";
          break;
          
        case 9:
          carta = "Caballo";
          break;
          
        case 10:
          carta = "Rey";
          break;
        
        default:
        
      }
      
    }
      
      // Definición del palo de la carta
      switch(valorP) {
        
        case 1:
          palo = "oros";
          break;
          
        case 2:
          palo = "bastos";
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
