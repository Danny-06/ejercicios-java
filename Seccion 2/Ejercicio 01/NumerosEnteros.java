/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class NumerosEnteros { // Clase principal
  public static void main(String[] args) {
    int x = 144;
    int y = 999;
    double division;
    
    division = (double) x / (double) y;
    
    System.out.println("x es igual a : " + x);
    System.out.println("y es igual a : " + y);
    System.out.println("x más y es igual a : "+  (x + y)) ;
    System.out.println("x menos y es igual a : " + (x - y));
    System.out.println("x por y es igual a : " + (x * y));
    System.out.println("x entre y es igual a : " + division);
  }
}
