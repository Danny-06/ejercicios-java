import java.util.ArrayList;
//import java.util.Collections;

public class Ejercicio2 {
  public static void main(String[] args) {

    Do.clear();

    var listaDeAlumnos = new ArrayList<Integer>();

    var tamanoLista = Do.randomRange(10, 20);

    for(var i = 1; i <= tamanoLista; i++) {
      listaDeAlumnos.add( Do.randomRange(0, 100) );
    }

    Do.println( Do.color(true, "g", "b",
    "Lista de números aleatorios entre 0 y 100\n" +
    "con cantidad de números aleatoria entre 10 y 20.")
    );
    
    Do.println( Do.color(true, "m", "b", "Longitud de la lista: ") + tamanoLista );

    Do.println();

    Do.println( Do.color(true, "y", "b", "" + listaDeAlumnos) );

    Do.println();


    // Suma del ArrayList
    Do.println(
      Do.color(true, "g", "b", "Suma del ArraList: ") +
      Do.suma(listaDeAlumnos)
    );

    Do.println();


    // Media del ArrayList
    Do.println(
      Do.color(true, "g", "b", "Media del ArraList: ") +
      Do.media(listaDeAlumnos)
    );

    Do.println();


    // Máximo del ArrayList
    Do.println(
      Do.color(true, "g", "b", "Máximo del ArraList: ") +
      Do.max(listaDeAlumnos)
    );

    Do.println();


    // Mínimo del ArrayList
    Do.println(
      Do.color(true, "g", "b", "Mínimo del ArraList: ") +
      Do.min(listaDeAlumnos)
    );

    Do.println();

  }
}