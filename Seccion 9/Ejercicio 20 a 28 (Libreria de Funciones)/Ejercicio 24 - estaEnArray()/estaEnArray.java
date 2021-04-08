/*
*
*
*/

public class estaEnArray {
    public static void main(String[] args) {
        int[] arrayTest = generaArrayInt(20, 1, 100);

        System.out.println("console.log("+estaEnArray(25, arrayTest)+");\n");

        pintaArrayInt(arrayTest);
    }

    // Función a la que se le pasa como parametros un 'número' y un 'array' y comprueba si el número se encuentra en el array devolviendo 'true' en caso afirmativo o 'false' en caso contrario
    public static boolean estaEnArray(int n, int[] array) {
        
        for(int i = 0; i < array.length; i++) { // Recorrer array
            if(n == array[i]) { // Si el número se encuentra en el array devolver 'true'
                return true;
            }
        }

        return false;
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
