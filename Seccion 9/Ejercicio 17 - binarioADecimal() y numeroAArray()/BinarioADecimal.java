import java.util.Scanner;
/*
*
*
*/

public class BinarioADecimal {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Escriba el número binario que quiere comvertir a decimal.\n> ");

        long e = Long.parseLong(s.nextLine());

        System.out.println("El número binario introducido a decimal es " + binarioADecimal(e));

    }

    // Función que se le pasa un número binario y lo transforma en decimal. Si el número introducido no es binario devuelve 0 (depende de la función 'numeroAArray()')
    public static long binarioADecimal(long n) {

        long[] array = numeroAArray(n);
        
        final int L = array.length;

        long numeroDecimal = 0;
        for(int i = 0; i < L; i++) {

            // Comprobar dígitio a dígito que el número introducido es binario, si no devolver '0'
            if(array[i] == 0) { // Si es '0'
                // Continuar
            } else if(array[i] == 1) { // O Si es '1'
                // Continuar
            } else {return 0;} // Si No es ninguno | Devolver '0'
            

            numeroDecimal += array[(L-1)-i] * (long)Math.pow(2,i); // Mutiplicar dígito binario por su potencia de '2' equivalente e ir sumandolo a la variable
            //System.out.println(array[(L-1)-i] * (long)Math.pow(2,i));
            
        }

        return numeroDecimal;
    }


    // Función que se le pasa un número y devuelve un array que contiene los dígitos del número
    public static long[] numeroAArray(long n) {
        
        final int L = Long.toString(n).length();

        long[] array = new long[L];

        // Pasar los dígitos del número al array
        for(int i = 0; i < L; i++) {
            array[(L-1) - i] = n % 10; // Introducción de digitos empezando por el final para que entren en el orden correcto
            n /= 10;
        }
        
        return array;
    }

}
