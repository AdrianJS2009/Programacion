import java.util.Scanner;

/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */
public class T03Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Cuantos MB quieres convertir");
    int mb = sc.nextInt();

    System.out.println(mb + " son " + (mb * 1000) + "kb");
  }
}
