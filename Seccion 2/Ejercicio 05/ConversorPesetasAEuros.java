/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class ConversorPesetasAEuros { // Clase principal
  public static void main(String[] args) {
    System.out.println("Nota: 1 Peseta son  0,006 Euros.");
    System.out.println("Introduzca las Pesetas que quiere convetir a Euros.");
    
    String dato_pesetas = System.console().readLine();
    int pesetas = Integer.parseInt(dato_pesetas);
      
    double euros = 0.006;

    double resultado = pesetas * euros;
    
    System.out.println(pesetas + " Pesetas son " + resultado + " Euros.");
  }
}
