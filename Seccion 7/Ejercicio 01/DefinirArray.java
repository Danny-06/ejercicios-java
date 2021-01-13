
/**
 *
 * 
 * @autor Daniel Fabián El Belaizi
 */
public class DefinirArray { // Clase principal
  public static void main(String[] args) {
    
    int[] num = new int[12];
  //num = [39,-2, , ,0, ,14, ,5,120, , ];

    num[0] =  39;
    num[1] =  -2;
  //num[2] =    ;
  //num[3] =    ;
    num[4] =   0;
  //num[5] =    ;
    num[6] =  14;
  //num[7] =    ;
    num[8] =   5;
    num[9] = 120;
  //num[10] =   ;
  //num[11] =   ;
    
    for(int i = 0; i < num.length; i++) {
      System.out.println(i + ". " + num[i]);
    }
  }
}
