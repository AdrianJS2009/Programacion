import java.util.Scanner;

/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */
public class T03Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("¿Cúantos KBs quieres convertir?");
    int kb = sc.nextInt();

    System.out.println(kb + "kb son " + (kb / 1000) + "mb");

  }
}
