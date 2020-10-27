import java.util.Scanner;

/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class ConversorPesetasAEurosTeclado {
  public static void main(String[] args) {
    
    System.out.println("Nota: 1 Peseta son  0.006 Euros.");
    System.out.println("Introduzca los Pesetas que quiere convetir a Euros.");
    
    Scanner s = new Scanner(System.in);
    
    double pesetas = s.nextDouble();
      
    double euros = 0.006;

    double resultado = pesetas * euros;
    
    System.out.println(pesetas + " Pesetas son " + resultado + " Euros.");
  }
}
