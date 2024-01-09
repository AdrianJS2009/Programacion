import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class T07Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numero = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    System.out.println("Introduce números enteros y pulse INTRO");

    for (int i = 0; i < numero.length; i++) {
      numero[i] = sc.nextInt();

      if (numero[i] > maximo) {
        maximo = numero[i];

      }

      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }
    System.out.println("Los números introducidos son: ");
    for (int i = 0; i < numero.length; i++) {
      System.out.println(numero[i] + " ");
      if (numero[i] == maximo) {
        System.out.println(" es el número máximo");

      }

      if (numero[i] == minimo) {
        System.out.println(" es el número minimo");

      }
    }
  }

}
