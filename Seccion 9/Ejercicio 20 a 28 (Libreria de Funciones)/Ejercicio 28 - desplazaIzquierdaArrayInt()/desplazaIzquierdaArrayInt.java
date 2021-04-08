/*
*
*
*/

public class desplazaIzquierdaArrayInt {
	public static void main(String[] args) {

			int[] arrayTest = generaArrayInt(5, 0, 10); // Generar array de prueba

			pintaArrayInt(arrayTest); // Dibujar en pantalla el array

			System.out.println();

			pintaArrayInt(desplazaIzquierdaArrayInt(1, arrayTest)); // Dibujar en pantalla el array desplazado a la izquierda
	}

	// Función que toma como argumento un número y un array y devuelve un array con los números desplazados a la izquierda tantos lugares como se especifique 
	public static int[] desplazaIzquierdaArrayInt(int n, int[] array) {

		int[] arrayDesplazadoIzquierda = new int[array.length]; // Crear nuevo array donde almacenar los valores del array original desplazados a la derecha

		for(int i = 0, j = 0; i < array.length; i++, j++) {
			if(j + n > array.length - 1) { // Si se pasa resetear 'j'
				j = -n; // j + n = 0 (Indice '0')
			}

			arrayDesplazadoIzquierda[i] = array[j + n];
		}

		return arrayDesplazadoIzquierda;
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