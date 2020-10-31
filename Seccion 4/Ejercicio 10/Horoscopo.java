import java.util.Scanner;

/**
 * 
 * 
 * @auto Daniel Fabián El Belaizi
 *
 */
 
public class Horoscopo {
  public static void main (String[] ars) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca su DÍA y MES");

    int dia = s.nextInt();
    String mes = s.next().toLowerCase();
    System.out.println();
    
    if(dia >= 21 && dia <= 31 && mes.equals("marzo") || dia >= 1 && dia <= 20 && mes.equals("abril")) {
      
      System.out.println("Su horoscopo es Aries"); //1
      
    } else if(dia >= 21 && dia <= 30 && mes.equals("abril") || dia >= 1 && dia <= 20 && mes.equals("mayo")) {
      
      System.out.println("Su horoscopo es Tauro"); //2
      
    } else if(dia >= 21 && dia <= 31 && mes.equals("mayo") || dia >= 1 && dia <= 20 && mes.equals("junio")) {
      
      System.out.println("Su horoscopo es Géminis"); //3
      
    } else if(dia >= 21 && dia <= 30 && mes.equals("junio") || dia >= 1 && dia <= 20 && mes.equals("julio")) {
      
      System.out.println("Su horoscopo es Cáncer"); //4
      
    } else if(dia >= 21 && dia <= 31 && mes.equals("julio") || dia >= 1 && dia <= 21 && mes.equals("agosto")) {
      
      System.out.println("Su horoscopo es Leo"); //5
      
    } else if(dia >= 22 && dia <= 31 && mes.equals("agosto") || dia >= 1 && dia <= 22 && mes.equals("septiembre")) {
      
      System.out.println("Su horoscopo es Virgo"); //6
      
    } else if(dia >= 23 && dia <= 30 && mes.equals("septiembre") || dia >= 1 && dia <= 22 && mes.equals("octubre")) {
      
      System.out.println("Su horoscopo es Libra"); //7
      
    } else if(dia >= 23 && dia <= 31 && mes.equals("octubre") || dia >= 1 && dia <= 22 && mes.equals("noviembre")) {
      
      System.out.println("Su horoscopo es Escorpio"); //8
      
    } else if(dia >= 23 && dia <= 30 && mes.equals("noviembre") || dia >= 1 && dia <= 20 && mes.equals("diciembre")) {
      
      System.out.println("Su horoscopo es Sagitario"); //9
      
    } else if(dia >= 21 && dia <= 31 && mes.equals("diciembre") || dia >= 1 && dia <= 19 && mes.equals("enero")) {
      
      System.out.println("Su horoscopo es Capricornio"); //10
      
    } else if(dia >= 20 && dia <= 30 && mes.equals("enero") || dia >= 1 && dia <= 18 && mes.equals("febrero")) {
      
      System.out.println("Su horoscopo es Aquario"); //11
      
    } else if(dia >= 19 && dia <= 29 && mes.equals("febrero") || dia >= 1 && dia <= 20 && mes.equals("marzo")) {
      
      System.out.println("Su horoscopo es Piscis"); //12
      
    } else {System.out.println("ERROR, esa fecha no existe");}
    
  }
}
