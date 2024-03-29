import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class T05_Ejercicio31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la altura de la L: ");
    int altura = sc.nextInt();

    if (altura < 2) {
      System.out.println("La altura es demasiado baja para dibujar una L.");
    } else {
      // Escribir en vertical
      for (int i = 0; i < altura - 1; i++) {
        System.out.println("*");
      }

      // Escribir en horizontal
      for (int i = 0; i < altura / 2 + 1; i++) {
        System.out.print("* ");
      }

      System.out.println();
    }

    sc.close();
  }
}
