
/** 
 * Explica tu código aquí
 * 
* @author Adrián Jiménez Santiago
*/

import java.util.Scanner;

public class Examen01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String opcion;

    do {
      System.out
          .println("Introduce el nombre del alumno en el siguiente orden y seguido: Apellido1 Apellido2, Nombre: ");

      String nombre = sc.nextLine();

      int nota1, nota2, nota3;
      while (true) {
        System.out.println("Introduce las notas de los tres trimestres (entre 0 y 10): ");
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();

        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {
          break;
        } else {
          System.out.println("Las notas que has introducido son inválidas, por favor, revisalas.");
        }
      }

      double notaMedia = (nota1 + nota2 + nota3) / 3.0;

      // Muestro la tabla
      System.out.println("--- --- --- --- --- --- --- --- --- ---");
      System.out.print("| ");
      for (int i = 0; i < nombre.length(); i++) {
        System.out.print("\033[1m" + nombre.charAt(i) + "\033[0m");
      }

      // Muestro las notas
      System.out.print(" | ");
      if (nota1 < 5) {
        System.out.print("\033[31m\033[1m" + nota1 + "\033[0m");
      } else {
        System.out.print("\033[32m\033[1m" + nota1 + "\033[0m");
      }

      System.out.print(" | ");
      if (nota2 < 5) {
        System.out.print("\033[31m\033[1m" + nota2 + "\033[0m");
      } else {
        System.out.print("\033[32m\033[1m" + nota2 + "\033[0m");
      }

      System.out.print(" | ");
      if (nota3 < 5) {
        System.out.print("\033[31m\033[1m" + nota3 + "\033[0m");
      } else {
        System.out.print("\033[32m\033[1m" + nota3 + "\033[0m");
      }

      // Muestro la nota media en verde o rojo
      System.out.print(" | ");
      if (notaMedia < 5) {
        System.out.printf("\033[31m\033[1m%.2f\033[0m", notaMedia);
      } else {
        System.out.printf("\033[32m\033[1m%.2f\033[0m", notaMedia);
      }
      System.out.println(" |\n--- --- --- --- --- --- --- --- --- ---");

      // Continuo preguntando por otro alumno
      System.out.println("¿Deseas introducir notas de otro alumno? (S/N): ");
      opcion = sc.next();
      sc.nextLine();

    } while (opcion.equalsIgnoreCase("S"));

    if (!opcion.equalsIgnoreCase("N")) {
      System.out.println("Opción inválida, saliendo del programa...");
    } else {
      System.out.println("¡Espero que hayan aprobado todos los alumnos!\nSaliendo del programa...  ");
    }
  }
}
