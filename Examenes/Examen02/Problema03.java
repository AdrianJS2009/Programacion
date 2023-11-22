
/** 
 * Realiza un programa que nos pedirá un número real de doble precisión, un signo aritmético en forma de carácter y por último, otro número real de doble precisión. Según el valor que haya introducido se realizará la operación correspondiente. Al final mostrará el resultado por pantalla, bajo las siguientes condiciones:

* La instrucción de mostrar por pantalla el resultado debe aparecer una sola vez en tu código.
* Aunque el usuario introduzca número con varios decimales, en el mensaje de salida solo deben aparecer 2 dígitos. 
* Los signos aritméticos disponibles son:

+: suma los dos operandos.

-: resta los operandos.

*: multiplica los operandos.

/: divide los operandos, este debe dar un resultado con decimales.

^:  la operación potencia, donde el primer número actuará como base y el segundo número como exponente.

%:  resto de la división entre el primer número y el segundo.


 * 
* @author Adrián Jiménez Santiago
*/

import java.util.Scanner;

public class Problema03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el primer número con el que operar: ");
    double num1 = sc.nextDouble();

    System.out.println("Introduce el signo aritmético (+, -, *, /, ^, %): ");
    char operador = sc.next().charAt(0);

    System.out.println("Introduce el segundo número: ");
    double num2 = sc.nextDouble();

    sc.close();

    double resultado = 0;

    switch (operador) {
      case '+':
        resultado = num1 + num2;
        break;
      case '-':
        resultado = num1 - num2;
        break;
      case '*':
        resultado = num1 * num2;
        break;
      case '/':
        resultado = num1 / num2;
        break;
      case '^':
        resultado = Math.pow(num1, num2);
        break;
      case '%':
        resultado = num1 % num2;
        break;
      default:
        System.out.println("Operador inválido.");
        return;
    }

    System.out.printf("El resultado es: %.2f", resultado);
  }
}
