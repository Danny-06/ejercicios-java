import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class SalarioSemanal { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // IVA 21%
    
    System.out.println("Introduzca las horas trabajadas esta semana para calcular su salario semanal.");
    //Horas por el dinero ganado cada hora
    double salario = s.nextDouble() * 12;
    
    System.out.println();

    System.out.printf("Su salario esta semana es de : " + salario + " Euros.");
  }
}
