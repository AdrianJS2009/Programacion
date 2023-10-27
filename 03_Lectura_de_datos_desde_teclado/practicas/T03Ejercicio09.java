import java.util.Scanner;

public class T03Ejercicio09 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce el radio del cono: ");
    double radio = scanner.nextDouble();

    System.out.print("Introduce la altura del cono: ");
    double altura = scanner.nextDouble();

    double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;

    System.out.println("El volumen del cono es: " + volumen);

    scanner.close();
  }
}
