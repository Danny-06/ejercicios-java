import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
  public static void main(String[] args) {

    Do.clear();

    var textoPorTeclado = new ArrayList<String>();

    Do.print(
      Do.color(true, "bl", "b", "Introduce 10 cadenas de texto por teclado para añadirlos al ArraList de texto y\n"+
      "luegos ordenarlos posteriormente\n")
    );

    for(var i = 1; i <= 10; i++) {
      Do.print(
        Do.color(true, "bl", "b","> ")
      );
      textoPorTeclado.add( Do.inputString() );
    }


    Do.println();

    // Texto introducido por teclado sin ordenar
    Do.println(
      Do.color(true, "g", "b", "Texto introducido por teclado sin ordenar")
    );
    Do.println(textoPorTeclado);

    Do.println();

    // Texto introducido por teclado ordenado
    Do.println(
      Do.color(true, "g", "b", "Texto introducidos por teclado ordenado")
    );

    Collections.sort(textoPorTeclado);

    Do.println(textoPorTeclado);

    Do.println();

  }
}