/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class Array01 {

  public static void main(String[] args) {
    int[] n;
    n = new int[4];

    n[0] = 26;
    n[1] = -2;
    n[2] = 3;
    n[3] = 0;

    System.out.println("Los valores del Array son los siguientes:");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);

    int suma = n[1] + n[3];
    System.out.println("El resultado de la suma de ambos números es: " + suma);
  }

}