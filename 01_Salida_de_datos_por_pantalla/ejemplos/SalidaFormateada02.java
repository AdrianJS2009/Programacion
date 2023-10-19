/**
 * Muestra por pantalla utilizando distintos flags
 * 
 * @author Adrián Jiménez Santiago
 */

public class SalidaFormateada02 {
  public static void main(String[] args) {
    System.out.printf("%8d\n", 100);
    System.out.printf("%08d\n", 100);
    System.out.printf("%+d\n", 100);
    System.out.printf("%-8d\n", 100);
  }
  
}
