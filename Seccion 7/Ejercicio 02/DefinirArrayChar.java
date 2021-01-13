
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class DefinirArrayChar { // Clase principal
  public static void main(String[] args) {
    
    char[] simbolo = new char[10];
  //simbolo = ['a','x', , ,@, ,'','+','Q', ];

    simbolo[0] = 'a';
    simbolo[1] = 'x';
  //simbolo[2] =    ;
  //simbolo[3] =    ;
    simbolo[4] = '@';
  //simbolo[5] =    ;
    simbolo[6] = ' ';
  //simbolo[7] = '+';
    simbolo[8] = 'Q';
  //simbolo[9] =    ;
      
    for(int i = 0; i < simbolo.length; i++) {
      System.out.println(i + ". " + simbolo[i]);
    }
  }
}
