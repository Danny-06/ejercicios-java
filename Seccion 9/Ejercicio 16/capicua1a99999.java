/*
*
*
*/

public class capicua1a99999 {
    public static void main(String[] args) {

        for(int i = 0; i <= 99999; i++) {
            if(esCapicua(i)) { // Si es capicúa
                System.out.println(i); // Imprimir el número en pantalla
            }
        }
        
    }


  // Función que comprueba si el número dado es devolviendo "true" o "false" al acabar
  public static boolean esCapicua(int x) { // El inverso (el número dado la vuelta) tiene que ser el mismo

    int n = x;
    int inverso = 0;

    String nS = Integer.toString(n); // Convertirlo a cadena de texto para saber su longitud

    for(int i = 0; i < nS.length(); i++) {
      inverso = (inverso * 10) + (n % 10);
      n /= 10;
    }

    //System.out.println("inverso = " + inverso); // console.log(inverso)

    if(x == inverso) {
      return true;
    } else {return false;}

  }


}