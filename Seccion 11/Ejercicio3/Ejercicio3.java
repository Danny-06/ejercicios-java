import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
  public static void main(String[] args) {

    Do.clear();

    var numerosPorTeclado = new ArrayList<Integer>();

    Do.print(
      Do.color(true, "bl", "b", "Introduce 10 números por teclado para añadirlos al ArraList de números y\n"+
      "luegos ordenarlos posteriormente\n")
    );

    for(var i = 1; i <= 10; i++) {
      Do.print(
        Do.color(true, "bl", "b","> ")
      );
      numerosPorTeclado.add( Do.inputInt() );
    }


    Do.println();

    // Números introducidos por teclado sin ordenar
    Do.println(
      Do.color(true, "g", "b", "Números introducidos por teclado sin ordenar")
    );
    Do.println(numerosPorTeclado);

    Do.println();

    // Números introducidos por teclado ordenados
    Do.println(
      Do.color(true, "g", "b", "Números introducidos por teclado ordenados")
    );

    Collections.sort(numerosPorTeclado);

    Do.println(numerosPorTeclado);

    Do.println();

  }
}