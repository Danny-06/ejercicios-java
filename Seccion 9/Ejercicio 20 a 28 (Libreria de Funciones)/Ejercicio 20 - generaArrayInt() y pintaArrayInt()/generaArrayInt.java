import java.util.Scanner;
/*
*
*
*/


public class generaArrayInt {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array de número aleatorios que desea.\n> ");
        int e1 = Integer.parseInt(s.nextLine());

        System.out.print("Introduce valor mínimo del intervalo de los números aleatorios del array.\n> ");
        int e2 = Integer.parseInt(s.nextLine());

        System.out.print("Introduce valor máximo del intervalo de los números aleatorios del array.\n> ");
        int e3 = Integer.parseInt(s.nextLine());

        pintaArrayInt(generaArrayInt(e1, e2, e3)); // Pintar array resultante
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
