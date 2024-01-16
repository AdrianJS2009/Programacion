/**
 * Generar números aleatorios entre [50,71]
 * 
 * @author Adrián Jiménez Santiago
 */

public class Ejemplo05 {
  public static void main(String[] args) {

    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int) (Math.random() * 21) + 50;
      System.out.println(numero);
    }
  }
}

// La multiplicación indica el rango de números con el que trabajar, en este
// caso de 50 a 71 hay 21 números.
// La suma nos indica desde que número empezamos a sacar números aleatorios, en
// este caso +50 por que el primer número de el rango que nos interesa es 50.