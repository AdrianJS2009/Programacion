
/** 
 * Explica tu código aquí
 * 
* @author Adrián Jiménez Santiago
*/

import java.util.Scanner;

public class T05_Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la base:");
    double base = sc.nextDouble();
    System.out.println("Introduce el exponente, tiene que ser un número entero y positivo");
    int exponente = sc.nextInt();

    double resultado = 1;

    for (int i = 0; i < exponente; i++) {
      resultado *= base;

    }

    System.out.println("El resultado es: " + resultado);
    sc.close();
  }
}
