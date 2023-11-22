import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class T05_Ejercicio34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    long numero1 = sc.nextLong();

    System.out.print("Introduce otro número: ");
    long numero2 = sc.nextLong();

    long numeroPares = 0;
    long numeroImpares = 0;
    long multiplicador = 1; // Con este formaré los número

    while (numero1 > 0 && numero2 > 0) {
      // Así obtengo el último número de cada digito
      long digito1 = numero1 % 10;
      long digito2 = numero2 % 10;

      if (multiplicador % 2 == 0) { // Si el multiplicador es par recojo el dígito del primer número
        numeroPares += digito1 * multiplicador;
        numeroImpares += digito2 * multiplicador;
      } else { // Lo mismo, pero recogo el digito del segundo número
        numeroPares += digito2 * multiplicador;
        numeroImpares += digito1 * multiplicador;
      }

      // Borro el último digito de cada número
      numero1 /= 10;
      numero2 /= 10;

      // Aumento el multiplicador
      multiplicador *= 10;
    }

    System.out.println("El número formado por los dígitos pares es " + numeroPares);
    System.out.println("El número formado por los dígitos impares es " + numeroImpares);

    sc.close();
  }
}
