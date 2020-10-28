import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class DiaAsignatura { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Escribe un día de la semana para saber que asignatura toca a 1ª hora ese día");
    
    String dia = s.nextLine().toUpperCase();
    String asig = ""; //asignatura
    
    switch(dia) {
      
      case "LUNES":
      asig = "EED";
      break;
      
      case "MARTES":
      asig = "PRO";
      break;
      
      case "MIERCOLES":
      asig = "PRO";
      break;
      
      case "JUEVES":
      asig = "PRO";
      break;
      
      case "VIERNES":
      asig = "FOL";
      break;
      
      default:
      asig = "ERROR, día mal introducido!!!";
    }
    
    System.out.print("El día que has introducido tienes: " + asig);
  }
}
