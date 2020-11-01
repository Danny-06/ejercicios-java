import java.util.Scanner;

/**
 * 
 * 
 * @autor Daniel Fabián El Belaizi
 *
 */
 
public class CuandoMediaNoche {
  public static void main (String[] ars) {
    
    Scanner s = new Scanner(System.in);
    // 00:00         (Horas   + Minutos) * 60 = (Minutos + Minutos) * 60 = segundos
    int medianoche = ((24 * 60) + 0) * 60;
    
    System.out.println("Introduzca la HORA con los MINUTOS para calcular cuanto falta para medianoche.");
    System.out.println("Usar formato 24H.");
    
    int horas = s.nextInt();
    int minutos = s.nextInt();
    int resultado = 0;
    
    System.out.println();
    
    if(horas >= 24 || minutos >= 60) {
      System.out.println("ERROR, NO HA INTRODUCIDO UN FORMATO DE HORA VÁLIDO");
    } else {
      horas = horas * 60 * 60; // horas en segundos
      minutos = minutos * 60; // minutos en segundos
      resultado = medianoche - (horas + minutos);
      //if(horas == 12 && minutos < 0) { resultado = -resultado; }
    }
    
    System.out.print("Quedan " + resultado + " segundos para la medianoche.");
  }
}
