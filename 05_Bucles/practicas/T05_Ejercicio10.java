
/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */
import java.util.Scanner;

public class T05_Ejercicio10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float numero;
    int suma = 0;
    int contador = 0;

    do {
      System.out.println("Introduce un número: ");
      numero = sc.nextFloat();

      if (numero > 0) {
        suma += numero;
        contador++;

      }
    } while (numero >= 0);
    float resultado = suma / contador;
    System.out.println("La media de los números introducidos es " + (resultado));
  }
}
