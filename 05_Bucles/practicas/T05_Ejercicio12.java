
/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

import java.util.Scanner;

public class T05_Ejercicio12 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el valor de n: ");
    int n = sc.nextInt();

    int primero = 0;
    int segundo = 1;

    System.out.println("Fibonacci con " + n + " términos");

    for (int i = 0; i < n; i++) {

      System.out.println(primero + " ");
      int aux = primero + segundo;
      primero = segundo;
      segundo = aux;

    }
    sc.close();
  }

}