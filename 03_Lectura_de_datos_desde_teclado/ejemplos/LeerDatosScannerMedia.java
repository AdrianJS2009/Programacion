import java.util.Scanner;

/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */

public class LeerDatosScannerMedia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el primer número con decimales");
    float num1 = sc.nextFloat();

    System.out.println("Introduce el segundo número con decimales");
    float num2 = sc.nextFloat();

    System.out.println("Introduce el tercer numero con decimales");
    float num3 = sc.nextFloat();

    float media = num1 * num2 * num3 / 100;

    System.out.println("El primer numero es: " + num1 + " El segundo número es: " + num2 + " El tercer numero es: "
        + num3 + " Y la media de estos: " + media);

    sc.close();
  }
}
