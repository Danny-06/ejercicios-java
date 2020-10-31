import java.util.Scanner;

/**
 * 
 * 
 * @autor Daniel Fabián El Belaizi
 *
 */
 
public class Media3NotasBoletin {
  public static void main (String[] ars) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Intruzca la 1ª nota a partir de la cual quiere obtener su media.");
    double nota1 = s.nextDouble();
    
    System.out.println("Intruzca la 2ª nota a partir de la cual quiere obtener su media.");
    double nota2 = s.nextDouble();
    
    System.out.println("Intruzca la 3ª nota a partir de la cual quiere obtener su media.");
    double nota3 = s.nextDouble();
    
    String boletin;
    double media = (nota1 + nota2 + nota3) / 3;
    
    if(media < 5) {
        boletin = "suspenso";
    } else if(media >= 5 && media <6) {
        boletin = "aprobado";
    } else if(media >= 6 && media <7) {
        boletin = "bien";
    } else if(media >= 7 && media <9) {
        boletin = "notable";
    } else { boletin = "sobresaliente"; }
    
    System.out.println();
    
    System.out.printf("Su media es: %.2f", media);
    System.out.print("\nEstá " + boletin + ".");
  }
}
