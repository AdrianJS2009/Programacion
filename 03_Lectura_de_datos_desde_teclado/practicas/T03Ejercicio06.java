import java.util.Scanner;

/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */
public class T03Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la altura en cm del triángulo");
    double altura = sc.nextDouble();

    System.out.println("Introduce la base en cm del triángulo ");
    double base = sc.nextDouble();

    System.out.println("Por lo tanto el área es de: " + (base * altura / 2) + "cm");
  }
}
