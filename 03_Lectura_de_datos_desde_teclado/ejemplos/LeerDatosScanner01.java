import java.util.Scanner;

/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */
public class LeerDatosScanner01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce tu nombre:");
    String nombre = sc.nextLine();

    System.out.println("Introduce tu edad:");
    int edad = sc.nextInt();

    System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
  }

}
