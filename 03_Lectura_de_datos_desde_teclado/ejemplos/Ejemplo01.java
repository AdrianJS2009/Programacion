/**
 * Ejemplo primera lectura de datos
 * 
 * @author Adrián Jiménez Santiago
 */

/**
 * Ejemplo01
 */
public class Ejemplo01 {

  public static void main(String[] args) {
    String nombre;
    System.out.println("Dime como te llamas: ");
    nombre = System.console().readLine();

    System.out.println("¡Hola! " + nombre + " ¡Bienvenido@ a programación!");

    String num1;
    String num2;
    System.out.println("Introduce un número");
    num1 = System.console().readLine();

    System.out.println("Introduce otro número");
    num2 = System.console().readLine();

    System.out.println("El resultado es: " + (num1 + num2));
  }
}
