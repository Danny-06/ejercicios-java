import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Lineas { // Clase principal
  public static void main(String[] args) {
    
    char simbolo = ' ';
    int s = 0;
    int longitud = 0;
    
    
    
    for(int i = 1; i <= 10; i++) { // Lineas a dibujar
      
      s = (int)(Math.random() * 6) + 1;
      
      switch(s) {// Seleccionar simbolo
      
        case 1:
          simbolo = '*';
          break;
          
        case 2:
          simbolo = '-';
          break;
        
        case 3:
          simbolo = '=';
          break;
        
        case 4:
          simbolo = '.';
          break;
        
        case 5:
          simbolo = '|';
          break;
          
        case 6:
          simbolo = '@';
          break;
        
        
        default:

      }
      
      longitud = (int)(Math.random() * 40) + 1; // Longitud de cada linea
      
      if(i != 10) {// Número de linea
        System.out.print(i + ".  ");
      } else { System.out.print(i + ". "); }
      
      for(int j = 1; j <= longitud; j++) { // Dibujar simbolos de la linea
        System.out.print(simbolo);
      }
      
      System.out.println();
      
    }
    
  }
}
