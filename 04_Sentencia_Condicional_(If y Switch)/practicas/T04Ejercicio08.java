import java.util.Scanner;

/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * @author Adrián Jiménez Santiago
 */
public class T04Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Vamos a hacer la media de tres notas, indicame la primera:");
    double primeraNota = sc.nextDouble();

    System.out.println("Ahora la segunda nota:");
    double segundaNota = sc.nextDouble();

    System.out.println("Y por último, la tercera nota:");
    double terceraNota = sc.nextDouble();

    double resultado = (primeraNota + segundaNota + terceraNota) / 3;

    System.out.println("Según las notas que has introducido, la media es de: " + resultado);

    if (resultado >= 0 && resultado <= 4) {
      System.out.println("Tu media es INSUFICIENTE");
    }

    if (resultado >= 5 && resultado < 6) {
      System.out.println("Tu media es SUFICIENTE");
    }

    if (resultado >= 6 && resultado <= 7) {
      System.out.println("Tu media es BIEN");
    }

    if (resultado >= 7 && resultado <= 9) {
      System.out.println("Tu media es NOTABLE");
    } else {
      System.out.println("Tu media es SOBRESALIENTE");
    }

  }
}
