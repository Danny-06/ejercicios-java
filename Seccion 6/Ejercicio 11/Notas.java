import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Notas { // Clase principal
  public static void main(String[] args) {
    
    String notas = "";
    int s = 0;
    int longitud = 0;
    
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    for(int i = 1; i <= 20; i++) { // Lineas a dibujar
      
      s = (int)(Math.random() * 5) + 1;
      
      switch(s) {// Seleccionar simbolo
      
        case 1:
          notas = "suspenso";
          suspenso++;
          break;
          
        case 2:
          notas = "suficiente";
          suficiente++;
          break;
        
        case 3:
          notas = "bien";
          bien++;
          break;
        
        case 4:
          notas = "notable";
          notable++;
          break;
        
        case 5:
          notas = "sobresaliente";
          sobresaliente++;
          break;
        
        default:

      }
      
      System.out.println(i + ". " + notas);
      
      System.out.println();
      
    }
    System.out.println();
    System.out.println(suspenso + " suspensos.");
    System.out.println(suficiente + " suficiente.");
    System.out.println(bien + " bien.");
    System.out.println(notable + " notables.");
    System.out.println(sobresaliente + " sobresalientes.");
    
  }
}
