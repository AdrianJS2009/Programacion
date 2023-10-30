import java.util.Scanner;

/**
 * Cáclculo de el área de un rectángulo mediante datos recogidos por teclado.
 * 
 * @author Adrián Jiménez Santiago
 */
public class T03Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la altura en cm del rectángulo");
    double altura = sc.nextDouble();

    System.out.println("Introduce la base en cm del rectángulo ");
    double base = sc.nextDouble();

    System.out.println("El rectángulos se compone de " + altura + "cm de largo y de " + base + "cm de ancho");
    System.out.println("Por lo tanto el área es de: " + (base * altura) + "cm");
  }
}
