import java.util.Scanner;

/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */
public class LeerDatosScanner02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce tu nombre y tu edad (separados mediante un espacio)");
    String nombre = sc.next();
    int edad = sc.nextInt();

    System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
    sc.close();

  }
}
