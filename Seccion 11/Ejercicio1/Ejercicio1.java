import java.util.ArrayList;
//import java.util.Collections;

public class Ejercicio1 {
  public static void main(String[] args) {

    Do.clear();

    var listaDeAlumnos = new ArrayList<String>();

    Do.addTo(listaDeAlumnos
    ,"Daniel"
    ,"Pablo"
    ,"Jesus"
    ,"Santos"
    ,"Gonzalo"
    ,"Fernando"
    );

    Do.println( Do.color(true, "g", "b", "Lista de algunos alumnos") );

    Do.println();

    for(var alumno : listaDeAlumnos) {
      Do.println( Do.color(true, "y", "b", alumno) );
    }

  }
}