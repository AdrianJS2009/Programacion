/**
 * Manejo de dos variables que almacenan números, sumar, restar, dividir
 * y multiplicar usando variables.
 * 
 * @author Adrián Jiménez Santiago
 */
public class T02Ejercicio01 {
  public static void main(String[] args) {
    int x, y;
    x = 144;
    y = 999;
    int suma = x + y;
    int resta = x - y;
    int multiplicacion = x * y;
    float division = x / y;

    System.out.println("El valor de x es: " + x);
    System.out.println("El valor de y es: " + y);

    System.out.println("La suma de ambos valores es: " + suma);
    System.out.println("La resta de ambos valores es: " + resta);
    System.out.println("La división de ambos valores es: " + division);
    System.out.println("La multiplicación de ambos valores es: " + multiplicacion);

  }

}