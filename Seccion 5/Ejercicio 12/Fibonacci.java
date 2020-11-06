import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Fibonacci { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la cantidad de número de la serie de Fibonacci que quiere obtener.");
    int entrada = s.nextInt();
    int e = entrada;
    
    int f1 = 0;  // Numero anterior a f2
    int f2 = 0;
    int f;       // Reserva del valor de f2 para luego darselo a f1
    
    System.out.println();
    
    int i;
    for(i = 1; i <= e; i++) {

        System.out.println(f2);
        
        f = f2;
        f2 = f2 + f1;
        f1 = f;

        if(f2 == 0) { f2++; }
        
    }
  }
}
