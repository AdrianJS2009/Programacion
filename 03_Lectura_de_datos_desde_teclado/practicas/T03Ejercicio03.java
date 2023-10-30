import java.util.Scanner;

/**
 * Conversión de pesetas a euros mediante datos recogidos por teclado
 * 
 * @author Adrián Jiménez Santiago
 */
public class T03Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduza la cantidad de pesetas a convertir");
    float pesetas = sc.nextFloat();

    float euros = pesetas / 166;

    System.out.println(pesetas + " equivalen a " + euros + "€");
  }
}
