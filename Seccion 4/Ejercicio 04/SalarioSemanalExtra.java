import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class SalarioSemanalExtra { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca las horas trabajadas esta semana para calcular su salario semanal.");
    //Horas por el dinero ganado cada hora
    int horas = s.nextInt();
    int salario;
    
    System.out.println();
    
    if(horas < 0){
      System.out.print("No se puede trabajar horas negativas.");
      
    } else if(horas <= 40) {
      salario = horas * 12;
      System.out.printf("Su salario esta semana es de : " + salario + " Euros.");
      
    } else {
      salario = 40 * 12 + (horas - 40) * 16;
      System.out.printf("Su salario esta semana es de : " + salario + " Euros.");
    }
  }
}
