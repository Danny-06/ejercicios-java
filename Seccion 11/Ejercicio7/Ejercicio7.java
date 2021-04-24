import java.util.HashMap;
// import java.util.ArrayList;
//import java.util.Collections;


public class Ejercicio7 {
  public static void main(String[] args) {

    Do.clear();

    var Monedas = new HashMap<String, Moneda>();

    var intentos = 6;
    var monedaNumero = 1;
    var patron = 0;

    while(intentos > 0) {

      // Variable que indicará que atributo de la moneda se genera aleatoriamente y cual se coge de la moneda anterior
      patron = Do.randomRange(0, 1);

      // Interrupción del programa para que el usuario decida cuando continuar
      Do.println( Do.color("Presione \"Enter\" para continuar (hasta 6 monedas) ", true, "bl", "b") );
      Do.inputString();

      Do.clear();

      // Meter monedas dentro de la lista
      Monedas.put("Moneda" + monedaNumero,
        new Moneda(
          monedaNumero > 1 ? patron == 1 ? Moneda.valores[Do.randomRange(0, Moneda.valores.length - 1)] : Monedas.get("Moneda" + (monedaNumero - 1)).getValor() : "",
          monedaNumero > 1 ? patron == 0 ? Moneda.lados[Do.randomRange(0, Moneda.lados.length - 1)]     : Monedas.get("Moneda" + (monedaNumero - 1)).getLado() : ""
        )
      );

      // Imprimir monedas por pantalla
      for(var i = 1; i <= monedaNumero; i++) {
        Do.println( Do.color("" + Monedas.get("Moneda" + i), true, "magenta", "" ) );
      }

      Do.println();

      intentos--;
      monedaNumero++;

    }


    Do.println();

  }
}