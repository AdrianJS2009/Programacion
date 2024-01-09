import java.util.Scanner;

/**
 * Se muestra un array de números de tipo double que almacena notas de alumnos
 * al estilo foreach
 * 
 * @author Adrián Jiménez Santiago
 */

public class Array05ForEach {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double[] notas = new double[3];
    double notaMedia = 0;
    double suma = 0;

    // Escritura de las posiciones del Array
    for (int i = 0; i < notas.length; i++) {
      System.out.println("Nota del examen nº " + (i + 1) + ": ");
      notas[i] = sc.nextDouble();
    }

    // Lectura de Array
    System.out.println("Tus notas son: ");
    for (double n : notas) {
      System.out.print(n + "\t");
      suma += n;
    }

    notaMedia = suma / notas.length;
    System.out.println("\nTu nota media es: " + notaMedia);

  }
}
