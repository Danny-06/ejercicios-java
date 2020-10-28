import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Ponderacion { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // IVA 21%
    
    System.out.println("Introduzca la nota del 1er examen.");
    double nota1 = s.nextDouble();
    
    System.out.println();
    
    System.out.println("Introduzca la nota que desea sacar en el Trimestre.");
    double notaT = s.nextDouble();
    
    //double nota2 = ( notaT * 100 - nota1 * 40 ) / 60;
      double nota2 = ( notaT * 5 - nota1 * 2 ) / 3;
      
    System.out.println();

    System.out.printf("Para sacar un " + notaT + " tiene que sacar " + nota2 + " en el 2º examen.");
  }
}
