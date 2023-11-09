import java.util.Scanner;

/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 digitos.
 * 
 * @author Adrián Jiménez Santiago
 */
public class T04Ejercicio19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce un número entero: ");
    int numero = scanner.nextInt();

    int digitos = String.valueOf(Math.abs(numero)).length();

    if (digitos >= 6) {
      System.out.println("El número introducido tiene más de 5 digitos");
    } else {
      System.out.println("El número tiene " + digitos + " dígitos.");
    }

    scanner.close();
  }
}
