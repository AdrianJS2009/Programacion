
/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

import java.util.Scanner;

public class T05_Ejercicio11 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número: ");
    int num = sc.nextInt();

    System.out.println("Número\tCuadrado\tCubo");

    for (int i = num; i < num + 5; i++) {
      int cuadrado = i * i;
      int cubo = i * i * i;

      System.out.println(i + "\t" + cuadrado + "\t\t" + cubo);
    }
    sc.close();

  }

}