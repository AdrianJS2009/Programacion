import java.util.Scanner;

/**
 * Realiza una multiplicación a través de dos variables recogidas mediante
 * teclado
 * 
 * @author Adrián Jiménez Santiago
 */
public class T03Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el primer número entero");
    int num1 = sc.nextInt();

    System.out.println("Introduce el segundo número entero");
    int num2 = sc.nextInt();

    int multiplicacion = num1 * num2;

    System.out.println("La multiplicación de ambos númeroes es: " + multiplicacion);
  }
}
