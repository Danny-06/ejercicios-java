/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class CharStringV2 { // Clase principal
  public static void main(String[] args) {
    
    char A = 'A';
    char B = 'B';
    char C = 'C';
    char D = 'D';
    char E = 'E';

    String ABCDE = "ABCDE";
    
    System.out.println( A + B + C + D + E ); // En lugar de tomar los caracteres como cadena de texto los toma con su valor ASCII
    
    // Solución
    System.out.println( "" + A + B + C + D + E ); // Colocar cualquier cadena de texto (En este caso una cadena vacía)
    

  }
}
