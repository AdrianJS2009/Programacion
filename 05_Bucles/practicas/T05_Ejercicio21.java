import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class T05_Ejercicio21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int contadorNumeros = 0;
    int sumaImpares = 0;
    int mayorPar = Integer.MIN_VALUE;

    System.out.println("Introduce números (introduce un número negativo para terminar):");

    while (true) {
      int numero = sc.nextInt();

      if (numero < 0) {
        break; // Para salir del bucle al introducir un número negativo
      }

      contadorNumeros++;

      if (numero % 2 == 0) { // Es par
        if (numero > mayorPar) {
          mayorPar = numero;
        }
      } else { // Es impar
        sumaImpares += numero;
      }
    }

    if (contadorNumeros == 0) {
      System.out.println("No has introducido ningún número.");
    } else {
      double mediaImpares = (double) sumaImpares / contadorNumeros;

      System.out.println("Has introducido " + contadorNumeros + " números.");
      System.out.println("La media de los impares es: " + mediaImpares);

      if (mayorPar != Integer.MIN_VALUE) {
        System.out.println("El mayor de los pares es: " + mayorPar);
      } else {
        System.out.println("No se introdujeron números pares.");
      }
    }

    sc.close();
  }
}
