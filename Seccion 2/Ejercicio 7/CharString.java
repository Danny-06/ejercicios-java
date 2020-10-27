/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class CharString { // Clase principal
  public static void main(String[] args) {
    
    char c = 'a';
    char c1 = 'b';
    String l = "linea a";
    String l1 = "linea b";
    
    System.out.println(c + " " + l + " |||||| " + c1 + " " + l1); 
    
    // Resultado Esperado: a linea |||||| b linea
    
    // Resultado Obtenido: a linea a |||||| b linea b
  }
}
