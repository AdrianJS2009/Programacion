import java.util.Scanner;

/**
 * Conversion de euros a pesetas mediante variables recogida por teclado.
 * 
 * @author Adrián Jiménez Santiago
 */
public class T03Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la cantidad de euros a convertir");
    int euros = sc.nextInt();

    float pesetas = euros * 1000 / 6;

    System.out.println(euros + "€" + " equivalen a: " + pesetas + " pesetas");
  }

}
