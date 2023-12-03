import java.util.Scanner;

public class EjemploTryCatch {
  public static void main(String[] args) {
    double num1;
    double num2;
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Introduzca el primer número: ");
      num1 = Double.parseDouble(sc.nextLine());
      System.out.println("Introduzca el segundo número");
      num2 = Double.parseDouble(sc.nextLine());
      System.out.println("La media es " + (num1 + num2) / 2);
    } catch (Exception e) {
      System.out.println("No se puede calcular la media");
      System.out.println("Los datos introducidos no son correctos");
    } finally {
      System.out.println("Gracias por utilizar este programa");
    }
  }

}
