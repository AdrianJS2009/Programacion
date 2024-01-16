import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */
public class T07Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[12];

    for (int i = 0; i < num.length; i++) {
      num[i] = (int) (Math.random() * 201);
    }

    System.out.println("Array original: ");
    System.out.print("índice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", num[i]);
    }

    System.out.print("Introduzca el número que desea insertar: ");
    int numeroIntroducido = sc.nextInt();
    System.out.print("Introduzca la posición donde desee insertar el número (0-11)");
    int posicion = sc.nextInt();

    // Desplazar los valores e insertar el número introducido por el usuario.

  }
}
