import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class NumeroDiaSemana { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Escribe un número para obtener el equivalente a su día de la semana (1-7).");
    
    int n = Integer.parseInt(s.nextLine());
    String dia = ""; //dianatura
    
    switch(n) {
      
      case 1:
      dia = "LUNES";
      break;
      
      case 2:
      dia = "MARTES";
      break;
      
      case 3:
      dia = "MIERCOLES";
      break;
      
      case 4:
      dia = "JUEVES";
      break;
      
      case 5:
      dia = "VIERNES";
      break;
      
      case 6:
      dia = "SABADO";
      break;
      
      case 7:
      dia = "DOMINGO";
      break;
      
      default:
      dia = "ERROR, número fuera del intervalo pedido!!!";
    }
    
    System.out.print("El día es " + dia);
  }
}
