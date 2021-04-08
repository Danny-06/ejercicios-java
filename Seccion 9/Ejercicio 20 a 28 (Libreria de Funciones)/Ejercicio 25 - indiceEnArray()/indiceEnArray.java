/*
*
*
*/

public class indiceEnArray {
    public static void main(String[] args) {
        int[] arrayTest = generaArrayInt(20, 1, 100); // Generar array de prueba

        System.out.println("console.log("+indiceEnArray(23,arrayTest)+");\n"); // Dibujar en pantalla el resultado de la función

        pintaArrayInt(arrayTest); // Dibujar en pantalla el array
    }

    // Función que toma como parámetros un número y un array, y devuelve el índice del número en el array, en caso de que el número no existiera en el array devolvería '-1'
    public static int indiceEnArray(int n, int[] array) {

			for(int i = 0; i < array.length; i++) {
				if(n == array[i]) {
					return i;
				}
			}

      return -1;
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