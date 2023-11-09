import java.util.Scanner;

/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 * 
 * @author Adrián Jiménez Santiago
 */
public class T04Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número entero positivo de hasta 5 cifras: ");
    int num = sc.nextInt();
    sc.close();

    int cifra1 = num / 10000;
    int cifra2 = num % 10000 / 1000;
    int cifra3 = num % 1000 / 100;
    int cifra4 = num % 100 / 10;
    int cifra5 = num % 10;
    if (num < 10_000 && (cifra1 == cifra5) && (cifra2 == cifra4)) {
      System.out.println("El número " + num + " es capicúa.");
    } else if (num >= 10_000 && (cifra1 == cifra5) && (cifra2 == cifra4) && (cifra3 == cifra3)) {
      System.out.println("El número " + num + " es capicúa.");
    } else {
      System.out.println("El número " + num + " no es capicúa.");
    }
  }
}
