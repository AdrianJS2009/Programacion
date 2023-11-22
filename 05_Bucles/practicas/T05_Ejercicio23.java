import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class T05_Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int suma = 0;
    int contador = 0;

    System.out.println("Introduce números para acumular la cantidad (hasta que la suma supere o igual a 10000):");

    while (suma < 10000) {
      int numero = sc.nextInt();
      suma += numero;
      contador++;
    }

    double media = (double) suma / contador;

    System.out.println("Total acumulado: " + suma);
    System.out.println("Cantidad de números introducidos: " + contador);
    System.out.println("Media de los números introducidos: " + media);

    sc.close();
  }
}
