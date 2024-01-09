import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class Array02 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = { 26, -2, 3, 0, 100 };

    System.out.println("Los valores del Array son los siguientes:");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3] + ", " + n[4]);

    int suma = n[1] + n[3];
    System.out.println("El resultado de la suma del contenido en la posición 1 y 3 es: " + suma);

    System.out.println("El Array contiene " + n.length + " elementos.  ¿Cúal deseas ver? (0-4)");
    int indice = sc.nextInt();
    System.out.println("El elemento que se encuentra en la posición " + indice + " es el " + n[indice]);
  }

}