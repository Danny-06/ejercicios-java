
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class SumaDados { // Clase principal
  public static void main(String[] args) {
    
    int tiradasSuma = 0;
    int dados = 0;
    
    System.out.println("Se va a lanzar un dado 3 veces y estos son los resultados.\n");
    
    for(int i = 1; i <= 3; i++) {
      dados = (int)(Math.random() * 6) + 1;
      System.out.println("Tirada " + i + ": "+ dados);
      tiradasSuma = tiradasSuma + dados;
    }
    
    System.out.print("\nLa suma de la tiradas de los dados es: " + tiradasSuma);
    
  }
}
