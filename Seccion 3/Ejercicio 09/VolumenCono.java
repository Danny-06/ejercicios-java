import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class VolumenCono { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // IVA 21%
    
    System.out.println("Introduzca el RADIO y la ALTURA del cono cuyo VOLUMEN quire hallar.");
    //Horas por el dinero ganado cada hora
    double radio = s.nextDouble();
    double altura = s.nextDouble();
    double pi = 3.1415926539;
    double volumen = ( pi * (radio * radio) * altura ) / 3; // no se puede poner así: (1/3) * ( pi * (radio * radio) * altura )
    
    System.out.println();

    System.out.printf("El volumen del cono es : " + volumen );
  }
}
