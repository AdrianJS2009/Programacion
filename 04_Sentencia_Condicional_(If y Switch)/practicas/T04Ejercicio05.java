import java.util.Scanner;

/**
 * Realiza un programa que resuelva una ecuación de primer grado.
 * 
 * @author Adrián Jiménez Santiago
 */

public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.println("Por favor, introduzca el valor de a:");
    int primerValor = sc.nextInt();

    System.out.println("Ahora introduzca el valor de b:");
    int segundoValor = sc.nextInt();

    float resultado = -primerValor / segundoValor;

    if (primerValor == 0) {
      System.out.println("Esa ecuación no tiene solución real");
    } else {
      System.out.println("El valor de x es: " + resultado);
    }

  }
}
