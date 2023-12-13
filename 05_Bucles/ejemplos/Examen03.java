
/** 
 * Comprobar si un número es perfecto o no.
 * 
* @author Adrián Jiménez Santiago
*/

import java.util.Scanner;

public class Examen03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número entero positivo: ");
    int numero = sc.nextInt();

    if (numero > 0) {
      int sumaDivisores = 1; // Empiezo la suma en 1 por que es divisor de todos los números.
      System.out.print("Los divisores propios de " + numero + " son: ");

      // Encuentro los divisores
      boolean primerDivisor = true;
      for (int i = 2; i <= numero / 2; i++) {
        if (numero % i == 0) {
          sumaDivisores += i;
          if (primerDivisor) {
            System.out.print(i);
            primerDivisor = false;
          } else {
            System.out.print(", " + i);
          }
        }
      }

      // Comrpuebo si es un número perfecto
      System.out.println("\nSuma de los divisores propios y el 1: " + sumaDivisores);
      if (sumaDivisores == numero) {
        System.out.println("Es un número perfecto.");
      } else {
        System.out.println("No es un número perfecto.");
      }
    } else {
      System.out.println("El número debe ser positivo.");
    }
  }
}
