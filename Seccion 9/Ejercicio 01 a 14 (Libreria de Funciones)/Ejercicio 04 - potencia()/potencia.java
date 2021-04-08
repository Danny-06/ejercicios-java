import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class potencia { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la base de la potencia.\n> ");
    int base = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el exponente de la potencia.\n> ");
    int exponente = Integer.parseInt(s.nextLine());
    
    System.out.println("La potencia de " + base + " elevado a " + exponente + " es " + potencia(base,exponente));

  }

  
  
  // Función que toma como argumentos "base" y "exponente" y devuelve la potencia resultante
  public static int potencia(int b, int e) {

    var p = 1; // Potencia

    for(int i = 1; i <= e; i++) {
      p *= b; // Multiplicar a 'p' el valor de la "base" hasta alcanzar el número del exponente
    }

    if(e == 0) {p = 1;} // Si el exponente es 0, la potencia vale 1

    if(e < 0) {p = 0;} // Si el exponente es negativo, devolver 0 en sustitución del valor real al no estar implementado los exponentes negativos

    return p;

  }
  
  
  


}
