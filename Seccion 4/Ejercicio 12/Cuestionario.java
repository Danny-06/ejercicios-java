import java.util.Scanner;

/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class Cuestionario { // Clase principal
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int puntos = 0;
    String respuesta = "";
    
    System.out.println("¿Cuál es la asignatura más fácil?"                          );// Pregunta 1
    respuesta = s.next().toLowerCase();
    if(respuesta.equals("fol")) {
      puntos++;
    }
    System.out.println();
    
    System.out.println("¿Y la asignatura más difícil"                               );// Pregunta 2
    respuesta = s.next().toLowerCase();
    if(respuesta.equals("sinf")) {
      puntos++;
    }
    System.out.println();
    
    System.out.println("¿Cuál es la mejor asignatura?"                              );// Pregunta 3
    respuesta = s.next().toLowerCase();
    if(respuesta.equals("pro")) {
      puntos++;
    }
    System.out.println();
    
    System.out.println("¿Y la peor?"                                                );// Pregunta 4
    respuesta = s.next().toLowerCase();
    if(respuesta.equals("bbdd")) {
      puntos++;
    }
    System.out.println();
    
    System.out.println("¿Cuál es más exigente?"                                     );// Pregunta 5
    respuesta = s.next().toLowerCase();
    if(respuesta.equals("sinf")) {
      puntos++;
    }
    System.out.println();
    
    System.out.println("¿En cuál de las asignaturas está el profesor más divertido?");// Pregunta 6
    respuesta = s.next().toLowerCase();
    if(respuesta.equals("lm")) {
      puntos++;
    }
    System.out.println();
    
    System.out.println("¿Cuál es la asignatura más fácil?"                          );// Pregunta 7
    respuesta = s.next().toLowerCase();
    if(respuesta.equals("fol")) {
      puntos++;
    }
    System.out.println();
    
    System.out.println("¿Cuál es la asignatura más fácil?");// Pregunta 8
    respuesta = s.next().toLowerCase();
    if(respuesta.equals("fol")) {
      puntos++;
    }
    System.out.println();
    
    System.out.println("¿Cuál es la asignatura más fácil?");// Pregunta 9
    respuesta = s.next().toLowerCase();
    if(respuesta.equals("fol")) {
      puntos++;
    }
    System.out.println();
    
    System.out.println("¿Cuál es la asignatura más fácil?");// Pregunta 10
    respuesta = s.next().toLowerCase();
    if(respuesta.equals("fol")) {
      puntos++;
    }
    System.out.println();
    
    System.out.println("Ha obtenido " + puntos + " puntos.");
  }
}
