import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class Array03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[10];
    num[0] = 15;
    num[1] = 254;
    num[2] = 9854;
    num[3] = -256;
    num[4] = 0;
    num[5] = 65;
    num[6] = num[2] * 10;
    num[7] = num[2] / 10;
    num[8] = num[0] + num[1] + num[2];
    num[9] = num[8];

    System.out.println("Los valores del Array son los siguientes:");

    // Lectura de Array
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }
  }
}
