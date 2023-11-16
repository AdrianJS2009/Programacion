
/** 
 * Explica tu código aquí
 * 
* @author Adrián Jiménez Santiago
*/

import java.util.Scanner;

public class T05_Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número, este debe ser positivo y entero");
    int numero = sc.nextInt();

    if (numero < 0) {
      System.out.println("El número introducido debe ser entero y positivo.");
    } else {
      int suma = 0;
      for (int i = numero; i <= numero + 100; i++) {
        suma += i;
      }
      System.out.println("La suma de los 100 números siguientes a " + numero + " es: " + suma);
    }

    sc.close();
  }
}
