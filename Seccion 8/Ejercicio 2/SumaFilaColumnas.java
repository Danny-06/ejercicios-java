import java.util.Scanner;
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class SumaFilaColumnas { // Clase principal
  public static void main(String[] args) {


        Scanner m = new Scanner(System.in);

        int X = 5; // Ancho array
        int Y = 4; // Alto array
        int[][] array = new int[Y][X];
        for(int i = 0; i < Y; i++) {
          for(int j = 0; j < X; j++) {
            // Entrada de datos a mano
            System.out.print("Introduzca el valor del array en x = " + j + ", y = " + i + ".\n> ");
            array[i][j] = Integer.parseInt(m.nextLine());
          }
        }

        // Dibujar tabla
        String simb = "  "; // Simbolo
        int sumFila = 0;
        int sumColumna = 0;

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
            
            if(j == X - 1) { // Dibujar Suma de Filas
              
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
          }

          System.out.print("  |"+sumColumna+"|\t"); // Dibujar Suma de Columnas
          sumColumna = 0; // Reinicio del valor por Columna

        }


    
  }
}
