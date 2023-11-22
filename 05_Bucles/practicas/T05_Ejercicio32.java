import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class T05_Ejercicio32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número entero y positivo: "); // Este será el long
    long numero = sc.nextLong();

    // Convierto numero a String para trabajar con charAT.
    String numeroStr = Long.toString(numero);

    System.out.print("Dígitos pares: ");
    int sumaPares = 0;

    // Utilizo un for para ir caracter a caracter
    for (int i = 0; i < numeroStr.length(); i++) {
      char digitoChar = numeroStr.charAt(i);
      int digito = Character.getNumericValue(digitoChar); // Aqui convierto el String númerico a un Int

      if (digito % 2 == 0) {
        System.out.print(digito + " ");
        sumaPares += digito;
      }
    }

    if (sumaPares == 0) {
      System.out.println("\nSuma de los dígitos pares: 0");
    } else {
      System.out.println("\nSuma de los dígitos pares: " + sumaPares);
    }

    sc.close();
  }
}
