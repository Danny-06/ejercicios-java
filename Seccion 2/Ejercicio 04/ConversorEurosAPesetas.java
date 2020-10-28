/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class ConversorEurosAPesetas { // Clase principal
  public static void main(String[] args) {
    System.out.println("Nota: 1 Euro son  166.386 Pesetas.");
    System.out.println("Introduzca los Euros que quiere convetir a Pesetas.");
    
    String dato_euros = System.console().readLine();
    int euros = Integer.parseInt(dato_euros);
      
    double pesetas = 166.386;

    double resultado = euros * pesetas;
    
    System.out.println(euros + " Euros son " + resultado + " Pesetas.");
  }
}
