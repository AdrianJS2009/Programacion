import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */
public class T05_Ejercicio08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce un número:");
    int numero = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }

  }

}