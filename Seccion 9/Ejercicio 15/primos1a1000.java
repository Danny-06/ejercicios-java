//import java.util.Scanner;
/*
*
*
*/

public class primos1a1000 {
    public static void main(String[] args) {

        for(int i = 1; i <= 1000; i++) { // Recorrer los número del 1 al 1000
            if(esPrimo(i)) { // Si es primo
                System.out.println(i); // Imprimir el número
                //i = siguientePrimo(i); // Asignar el valor de 'i' al siguiente primo para acortar las iteraciones del bucle
            }
        }

        println("Hola " + 2);
        println("Hola " + 4);

    }

    public static void print(String texto) {
      System.out.print(texto);
    }
    
    public static void println(String texto) {
      System.out.println(texto);
    }
    
    


  // Función que comprueba si el número dado es primo devolviendo "true" o "false" al acabar
  public static boolean esPrimo(int x) {

    int n = x;

    for(int i = 2; i < n || n == 1; i++) {
      if(n == 1) { // Si 'n' es igual a 1
        return true;
      } else

      if(n % i != 0) { // Comprobar si no es divisible con algún número
        if(i == n - 1) { // Devolver 'verdadero' en la última iteración. Sin esto, devolvería 'verdadero' la 1ra vez que viese que no es divisible
          return true;
        }
      } else {break;} // No es primo
    }
    return false;

  }

/*
  // Función que localiza el número primo más cercano del número que se le pasa como argumento devolviendo dicho número primo más cercano al acabar
  public static int siguientePrimo(int x) {

    int n = x + 1;

    while(!esPrimo(n)) { // Mientras no sea primo aumentar 'n' hasta dar con el siguiente primo
      n++;
    }

    return n;

  }
*/

}