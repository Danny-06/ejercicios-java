import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class SumaFilaColumnasAleatorioRetardo { // Clase principal
  public static void main(String[] args) {



        int X = 5; // Ancho array
        int Y = 4; // Alto array
        int[][] array = new int[Y][X];
        for(int i = 0; i < Y; i++) {
          for(int j = 0; j < X; j++) {
            // Introducción de datos mediante 'Números aleatorios' [n1,n2]
            int n1 = 100; // Número inicial del intervalo
            int n2 = -n1; // NO MODIFICAR
                n2 =+ 199; // Número final del intervalo
      
            array[i][j] = (int)(Math.random() * (n2 + 1)) + n1;
      
            // Entrada de datos a mano
            // System.out.print("Introduzca el valor del array en x = " + i + ", y = " + j + ".\n> ")
            //array[i] = Integer.parseInt(s.nextLine());
          }
        }

        // Dibujar tabla
        String simb = "  "; // Simbolo
        int sumFila = 0;
        int sumColumna = 0;
        int sumTotal = 0;

        for(int i = 0; i < Y; i++) { // Filas

          for(int j = 0; j < X; j++) { // Columnas

            if(i == 0 && j == 0) {
              for(int s = 0; s < X*7; s++) {
                simb = simb + "-";
              }
              System.out.println(simb); // Linea de la parte alta
            }

            System.out.printf("%5d\t",array[i][j]); // Dibujar números del array
            sumFila += array[i][j];
            sumTotal += sumFila; // Suma Total
            
            if(j == X - 1) { // Dibujar Suma de Filas
              
              sumTotal += sumFila; // Suma Total
              try {
                Thread.sleep(500);
              } catch (InterruptedException ex) {
                  // aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
              }
              System.out.println("|"+sumFila+"|");
              sumFila = 0; // Reinicio de valor por Fila
              
            }

          }
          if(i != Y -1) {
            System.out.println();
          }
        }

        System.out.println(simb); // Linea de la parte baja

        for(int i = 0; i < X; i++) { // Columnas

          for(int j = 0; j < Y; j++) { // Filas
            sumColumna += array[j][i];
            if(j == Y - 1) {sumTotal += sumColumna;} // Suma Total
          }

          try {
            Thread.sleep(500);
          } catch (InterruptedException ex) {
              // aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
          }
          System.out.print("  |"+sumColumna+"|\t"); // Dibujar Suma de Columnas
          sumColumna = 0; // Reinicio del valor por Columna

        }

        try {
          Thread.sleep(500);
        } catch (InterruptedException ex) {
            // aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
        }
        System.out.print("||"+sumTotal+"||");


    
  }
}
