import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class PositivoNegativo { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int p = 0; // nº positivo
    int n = 0; // nº negativo
    System.out.println("Introduzca 10 números positivos y negativos para determinar la cantidad de cada uno.\n");
    
    
    
    int i;
    for(i = 1; i <= 10; i++) {

      int entrada = s.nextInt();
      int e = entrada;
      
      if(e >= 0) {
      
        p++;
        
      } else { n++; }

    }
    
    System.out.println();
    
    System.out.println("Hay " + p + " números positivos y " + n + " números negativos.");
    
  }
}
