/**
 * Generar numeros enteros entre 1 y 11
 * 
 * @author Adrián Jiménez Santiago
 */

public class Ejemplo04 {
  public static void main(String[] args) {
    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int) (Math.random() * 10) + 1; // El número sumado modifica el primer rango de los dos valores (x, y)
      System.out.println(numero);
    }
  }
}
