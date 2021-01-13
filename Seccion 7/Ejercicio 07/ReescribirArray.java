import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class ReescribirArray { // Clase principal
  public static void main(String[] args) {



    Scanner s = new Scanner(System.in);

    int l = 100; // Longitud array
    int[] entrada = new int[l];
    
    for(int i = 0; i < l; i++) {
      // Introducción de datos mediante 'Números aleatorios' [n1,n2]
      int n1 = 0; // Número inicial del intervalo
      int n2 = -n1; // NO MODIFICAR
          n2 =+ 20; // Número final del intervalo

      entrada[i] = (int)(Math.random() * (n2 + 1)) + n1;
    }

    // Dibujar
    for(int i = 0; i < l; i++) {
      System.out.printf("%3d. %2d\n",i+1, entrada[i]);
    }

    System.out.print("\nIntroduce el número a sustituir del array\n> ");
    int valor1 = Integer.parseInt(s.nextLine());

    System.out.print("\nIntroduce el nuevo número que lo reemplazará\n> ");
    int valor2 = Integer.parseInt(s.nextLine());
    System.out.println();

    // Recorrer array en busca del número a sustituir
    for(int i = 0; i < l; i++) {
      if(entrada[i] == valor1) {
        entrada[i] = valor2;
      }
    }

    // Dibujar
    for(int i = 0; i < l; i++) {
      System.out.printf("%3d. %2d\n",i+1, entrada[i]);
    }



  }
}
