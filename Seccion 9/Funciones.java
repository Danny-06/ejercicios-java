import java.util.Scanner;

// Imprimir texto en pantalla
public static void print(String texto) {
  System.out.print(texto);
}

public static void print(char texto) {
  System.out.print(texto);
}

public static void print(int n) {
  System.out.print(n);
}

public static void print(long n) {
  System.out.print(n);
}

public static void print(float n) {
  System.out.print(n);
}

public static void print(double n) {
  System.out.print(n);
}


public static void println(String texto) {
  System.out.println(texto);
}

public static void println(char texto) {
  System.out.println(texto);
}

public static void println(int n) {
  System.out.println(n);
}

public static void println(long n) {
  System.out.println(n);
}

public static void println(float n) {
  System.out.println(n);
}

public static void println(double n) {
  System.out.println(n);
}



// Función que automatiza la entrada de datos por teclado
public static int inputInt() {
  Scanner s = new Scanner(System.in);
  int n = Integer.parseInt(s.nextLine());
  return n;
}

public static long inputLong() {
  Scanner s = new Scanner(System.in);
  long n = Long.parseLong(s.nextLine());
  return n;
}

public static float inputFloat() {
  Scanner s = new Scanner(System.in);
  float n = Float.parseFloat(s.nextLine());
  return n;
}

public static double inputDouble() {
  Scanner s = new Scanner(System.in);
  double n = Double.parseDouble(s.nextLine());
  return n;
}

public static String inputString() {
  Scanner s = new Scanner(System.in);
  String n = s.nextLine();
  return n;
}

public static char inputChar() {
  Scanner s = new Scanner(System.in);
  char n = s.nextLine().charAt(0);
  return n;
}
