import java.util.Scanner;

/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */
public class T03Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la nota del primer examen:");
    float primeraNota = sc.nextFloat();

    System.out.println("¿Qué nota quieres sacar en el trimestre?");
    float notaEsperada = sc.nextFloat();

    float notaNecesaria = ((notaEsperada * 100) - (primeraNota * 40)) / 60;

    System.out
        .println("Para tener un " + notaEsperada + " necesitas sacar un " + notaNecesaria + " en el siguiente examen");
  }
}
