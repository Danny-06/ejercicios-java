import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class TemperaturaMes { // Clase principal
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    //int e = Integer.parseInt(s.nextLine());

    //int l = 15; // Longitud array
    String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    int[] temperatura = new int[mes.length];
    
    System.out.print("Introduzca el año a tratar.\n> ");
    int año = Integer.parseInt(s.nextLine());

    System.out.println("\nIntroduzca las temperatura medias de cada mes.");

    for(int i = 0; i < mes.length; i++) {
      System.out.print(mes[i] + "\n> ");
      temperatura[i] = Integer.parseInt(s.nextLine());
    }

    // Dibujar
    for(int i = 0; i < mes.length; i++) {
      System.out.println(mes[i] + ": " + temperatura[i]);
    }

  }
}
