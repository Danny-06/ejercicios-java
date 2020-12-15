import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Pecera { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el ancho de la pecera. (Mínimo 4 unidades)\n> ");
    int ancho = Integer.parseInt(s.nextLine());
    System.out.println();
    
    System.out.print("Introduzca la altura de la pecera. (Mínimo 4 unidades)\n> ");
    int alto = Integer.parseInt(s.nextLine());
    System.out.println();
    
    String agua = "  "; // o Pez (&)
    int pez = 0;
    int cont = 0;
    
    
    for(int i = 1; i <= alto - 1; i++) {
      if(i == 1) {
        for(int j = 1; j <= ancho; j++) { // Pintar techo de pecera
          System.out.print("* ");
        }
        
        System.out.println();
        
      } else {
        
        System.out.print("*");
        
        for(int j = 1; j < ancho - 1; j++) {
          
          pez = (int)(Math.random() * (alto - i) * 6); // Probabilidad de que salga el pez
          
          if(pez != 0 || cont == 1) {
            
            System.out.print(agua);
            
          } else {
            
            System.out.print("& ");
            if(pez == 0) { cont = 1; }
          
          }
          
        }
        
        System.out.println(" *");
      }
      
    }
    
    for(int j = 1; j <= ancho; j++) { // Pintar suelo pecera
          System.out.print("* ");
        }

  }
}
