import java.util.Scanner;
/*
*
*
*/

public class minimoArrayInt {
    public static void main(String[] args) {

        int[] arrayTest = generaArrayInt(10, 40, 70);

        System.out.println("El mínimo del 'arrayTest' es " + minimoArrayInt(arrayTest) + ".\n");

        pintaArrayInt(arrayTest);

    }

    // Función a la que se le pasa como parámetro un 'array' y devuelve el valor mínimo contenido en él
    public static int minimoArrayInt(int[] array) {

        int minimo = array[0]; // Inicializar 'minimo' con el 1er número del array

        for(int i = 0; i < array.length; i++) {
            if(array[i] < minimo) {
                minimo = array[i];
            }
        }

        return minimo;
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
