import java.util.Scanner;

/**
 * Uso de sumas, restas, multiplicaciones y divisiones mediante dos números
 * recodigos por teclado.
 * 
 * @author Adrián Jiménez Santiago
 */

public class T03Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el primer número con el que operar");
    int num1 = sc.nextInt();

    System.out.println("Introduce el segundo número con el que operar");
    int num2 = sc.nextInt();

    int suma = num1 + num2;
    int resta = num1 - num2;
    int multiplicacion = num1 * num2;
    float division = num1 / num2;

    System.out.println("La suma de ambos números es: " + suma);
    System.out.println("La resta de ambos números es: " + resta);
    System.out.println("La multiplicación de ambos números es: " + multiplicacion);
    System.out.println("La división de ambos números es: " + division);

  }
}
