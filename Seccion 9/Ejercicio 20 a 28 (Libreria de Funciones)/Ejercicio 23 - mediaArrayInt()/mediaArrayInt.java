//import java.util.Scanner;
/*
*
*
*/

public class mediaArrayInt {
    public static void main(String[] args) {
        int[] arrayTest = generaArrayInt(10, 1, 100);

        System.out.println("La media del 'arrayTest' es " + mediaArrayInt(arrayTest) + ".\n");

        pintaArrayInt(arrayTest);
    }


    // Función que toma como parámetro un array y devuelve la media de los números que contiene
    public static int mediaArrayInt(int[] array) {

        int media = 0; // Inicialización de media

        for(int i = 0; i < array.length; i++) { // Sumar a la 'media' los valores del 'array'
            media += array[i];
        }

        media /= array.length; // Dividir a la 'media' la longitud del 'array' para obtener la media de los números

        return media;
    }

    // Función que devuelve un array tomando como argumentos el tamaño del array (L), y el valor mínimo (N1) y máximo (N2) del intervalo de los números aleatorios de los que se va a componer
    public static int[] generaArrayInt(final int L, int N1, int N2) {
        
        int[] array = new int[L];

        N2 -= N1; // Decrementar 'N2' con 'N1' para compesar el incremento posterior que le hace 'N1'
        for(int i = 0; i < L; i++) {
            array[i] = (int)(Math.random() * (N2 + 1)) + N1; // Ocupar el array de números aleatorios
        }

        return array;
    }

    // Función que toma como argumento un array y lo dibuja en pantalla
    public static void pintaArrayInt(int[] array) {
        
        for(int i = 0; i < array.length; i++) {
            System.out.printf("array[%3d] = %7d;\n" , i, array[i]);
        }

    }

}

