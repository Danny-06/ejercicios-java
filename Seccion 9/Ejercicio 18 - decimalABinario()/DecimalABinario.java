import java.util.Scanner;
/*
*
*
*/

public class DecimalABinario {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Escriba el número decimal que quiere comvertir a binario.\n> ");

        long e = Integer.parseInt(s.nextLine());

        System.out.println("El número decimal introducido a binario es " + decimalABinario(e));

    }

    // Función que se le pasa un número decimal y lo transforma en binario
    // (para pasar a binario se coge el resto de las sucesivas divisiones de dividir el 'n' entre '2')
    // El dígito de mayor valor del número binario nos lo da la última división
    public static long decimalABinario(long n) {

        long numeroBinario = 0;

        for(int i = 0; n != 0; i++) { // Mientras 'n' sea diferente de '0'
            numeroBinario = numeroBinario + (n % 2) * (long)Math.pow(10,i); // Multiplicar los dígitos binarios para colocarlos en su posición correspondiente ( Ejemplo: 101 == (1 * 100) + (0 * 10) + (1 * 1) )

            //System.out.println("console.log("+(n % 2) * (int)Math.pow(10,i)+");\n");

            n /= 2;
        }

        return numeroBinario;
    }


}
